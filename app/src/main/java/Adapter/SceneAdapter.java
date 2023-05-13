package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.hayder.kidsstories.R;

import Model.Scene;
import Model.Story;

public class SceneAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    private Story story;

    public SceneAdapter(Context context, Story story) {
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
        this.story =story;
    }

    @Override
    public int getCount() {
        if (story.getScenes() != null){
            return story.getScenes().length;
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.scene_item,container,false);

        ImageView imageView=view.findViewById(R.id.imagev);
        TextView title_scene , description_scene ;
        title_scene=view.findViewById(R.id.scene_title);
        description_scene= view.findViewById(R.id.scene_desc);


        Scene scene = story.getScenes()[position];
        title_scene.setText(scene.getScene_title());
        description_scene.setText(scene.getScene_title());
        imageView.setImageResource(scene.getScene_image());
        container.addView(view);
        return view;
    }

    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
