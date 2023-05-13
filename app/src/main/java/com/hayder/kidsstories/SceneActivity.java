package com.hayder.kidsstories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import Adapter.SceneAdapter;
import Model.Story;

public class SceneActivity extends AppCompatActivity {

    ViewPager viewPager;

    private Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene);
        viewPager = findViewById(R.id.viewpager);


        story = (Story) getIntent().getSerializableExtra("code");

        SceneAdapter sceneAdapter = new SceneAdapter(this,story);
        viewPager.setAdapter(sceneAdapter);
    }
}