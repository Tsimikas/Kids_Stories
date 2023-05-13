package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.hayder.kidsstories.Data;
import com.hayder.kidsstories.R;
import com.hayder.kidsstories.SceneActivity;

import java.util.List;

import Model.Story;

public class FavStoriesAdapter extends RecyclerView.Adapter<FavStoriesAdapter.FavStoriesViewHolder> {

    private List<Story> FavList = Data.FavList;

    Context context;

    public FavStoriesAdapter(List<Story> favList, Context context) {
        FavList = favList;
        this.context = context;
    }

    @Override
    public FavStoriesAdapter.FavStoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_stories,parent,false);

        return new FavStoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavStoriesAdapter.FavStoriesViewHolder holder, int position) {
        Story story=FavList.get(position);
        holder.title.setText(story.getTitle());
        holder.desc.setText(story.getDesc());
        holder.image.setImageResource(story.getImage());
    }

    @Override
    public int getItemCount() {
        if (FavList != null){
            return FavList.size();
        }
        return 0;
    }

    public class FavStoriesViewHolder extends RecyclerView.ViewHolder {
        TextView title , desc;

        ImageView image;

        CardView cardView;

        public FavStoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.story_title);
            desc = itemView.findViewById(R.id.story_desc);
            image = itemView.findViewById(R.id.story_image);
            cardView =itemView.findViewById(R.id.card_view);


            cardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                    popupMenu.getMenuInflater().inflate(R.menu.removefavorite, popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            switch (menuItem.getItemId()){

                                case R.id.remove_from_favourite:
                                    Story story = FavList.get(getAdapterPosition());
                                    Data.FavList.remove(story);
                                    return true;
                            }
                            return true;
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
                    Story story = FavList.get(getAdapterPosition());
                    Intent intent = new Intent(itemView.getContext(), SceneActivity.class);
                    intent.putExtra("code",story);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
