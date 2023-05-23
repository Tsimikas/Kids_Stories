package Adapter;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.hayder.kidsstories.Data;
import com.hayder.kidsstories.R;
import com.hayder.kidsstories.SceneActivity;
import com.hayder.kidsstories.StoriesActivity;
import com.hayder.kidsstories.WelcomeActivity;

import java.util.ArrayList;
import java.util.List;

import Model.Story;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>{

    private List<Story> stories =Data.storyList;

    private List<Story> FavList = Data.FavList;

    private Context context;


    public StoriesAdapter(List<Story> stories, Context context) {
        this.stories =stories;
        this.context = context;

    }




    @Override
    public StoriesAdapter.StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_stories,parent,false);

        return new StoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesAdapter.StoriesViewHolder holder, int position) {
        Story story=stories.get(position);
        holder.title.setText(story.getTitle());
        holder.desc.setText(story.getDesc());
        holder.image.setImageResource(story.getImage());
    }



    @Override
    public int getItemCount() {
        if (stories != null) {
            return stories.size();
        }
        return 0;
    }


    public class StoriesViewHolder extends RecyclerView.ViewHolder {
        TextView title , desc;

        ImageView image;

        CardView cardView;


        public StoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.story_title);
            desc = itemView.findViewById(R.id.story_desc);
           image = itemView.findViewById(R.id.story_image);
           cardView =itemView.findViewById(R.id.card_view);

            cardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    ContextThemeWrapper contextWrapper = new ContextThemeWrapper(view.getContext(), R.style.PopupMenuStyle);
                    PopupMenu popupMenu =new PopupMenu(view.getContext(),view);
                    popupMenu.getMenuInflater().inflate(R.menu.favourite_popup,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            switch (menuItem.getItemId()){
                                case R.id.add_to_favourite:
                                    Story story = stories.get(getAdapterPosition());
                                    if (Data.FavList.contains(story)){
                                        Toast.makeText(context, "The story is aleardy there", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Data.FavList.add(story);
                                        Toast.makeText(context, "Added to favorites", Toast.LENGTH_SHORT).show();
                                    }
                                    return true;

                                case R.id.share : share(); return true;
                            }
                            return false;
                        }
                    });
                    popupMenu.setGravity(Gravity.END);


                    popupMenu.show();
                    return true;
                }
            });

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Story story = stories.get(getAdapterPosition());
                    Intent intent = new Intent(itemView.getContext(), SceneActivity.class);
                    intent.putExtra("code",story);
                    itemView.getContext().startActivity(intent);
                }
            });


        }
    }

    private void share(){
        Intent share = new Intent(Intent.ACTION_SEND);

        Intent Chooser = Intent.createChooser(share,"SHARE");

            context.startActivity(Chooser);


    }






    public void setStories(List<Story> stories) {
        stories = stories;
    }
}
