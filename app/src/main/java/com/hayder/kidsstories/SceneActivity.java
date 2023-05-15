package com.hayder.kidsstories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import Adapter.SceneAdapter;
import Model.Story;

public class SceneActivity extends AppCompatActivity {

    ViewPager viewPager;

    private Story story;

    ImageView back , next ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene);


        viewPager = findViewById(R.id.viewpager);
        story = (Story) getIntent().getSerializableExtra("code");

        next = findViewById(R.id.next);
        back = findViewById(R.id.back);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (viewPager.getCurrentItem()==0){
                    back.setVisibility(View.GONE);
                } else {
                    back.setVisibility(View.VISIBLE);
                }

                if (viewPager.getCurrentItem()== story.getScenes().length-1){
                    next.setVisibility(View.GONE);
                } else {
                    next.setVisibility(View.VISIBLE);
                }
            }




            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(getItem(+1),true);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(getItem(-1),true);
            }
        });




        SceneAdapter sceneAdapter = new SceneAdapter(this,story);
        viewPager.setAdapter(sceneAdapter);
    }

    private int getItem(int i){
        return viewPager.getCurrentItem() + i;
    }
}