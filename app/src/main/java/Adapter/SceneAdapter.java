package Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.hayder.kidsstories.R;

import java.util.Locale;

import Model.Scene;
import Model.Story;

public class SceneAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    private Story story;

    private TextToSpeech textToSpeech;

    private boolean isPlaying = false;





    public SceneAdapter(Context context, Story story) {
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
        this.story =story;

        textToSpeech = new TextToSpeech(context,status->{
            if (status != TextToSpeech.SUCCESS){
              int result =  textToSpeech.setLanguage(Locale.ENGLISH);
              if (result ==  TextToSpeech.LANG_MISSING_DATA  || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                  Toast.makeText(context, "Language not Supported", Toast.LENGTH_SHORT).show();
              }else {
                      Toast.makeText(context, "TextToSpeech initialization failed", Toast.LENGTH_SHORT).show();
                  }


            }
        });
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

        ImageButton start;
        start =view.findViewById(R.id.audio_start);


        Scene scene = story.getScenes()[position];
        title_scene.setText(scene.getScene_title());
        description_scene.setText(scene.getContext());
        imageView.setImageResource(scene.getScene_image());

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPlaying){
                    textToSpeech.speak(scene.getContext(), TextToSpeech.QUEUE_FLUSH, null);
                    start.setImageResource(R.drawable.pause_icon);
                    isPlaying = true;

                } else {
                    textToSpeech.stop();
                    start.setImageResource(R.drawable.audio_icon);
                    isPlaying = false;
                }

            }
        });
        container.addView(view);
        return view;
    }

    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
        if (textToSpeech != null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
