package com.hayder.kidsstories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Adapter.FavStoriesAdapter;
import Adapter.StoriesAdapter;
import Model.Story;

public class FavStoriesActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    TextView favstories;

    List<Story> favstoryList = Data.FavList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_stories);



        recyclerView=findViewById(R.id.rv_favstories);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        getSupportActionBar().hide();

        favstories=findViewById(R.id.favorite_stories);


        if (favstoryList.isEmpty()) {

        favstories.setText("No Favorite Story Selected");}

        else {favstories.setText("Favorite Stories");}








       // favstoryList.add(new Story("Blanch Neige","Une histoire sur une princesse dune très grande beauté",R.drawable.blancheneige));

       FavStoriesAdapter favStoriesAdapter = new FavStoriesAdapter(favstoryList,this);
        recyclerView.setAdapter(favStoriesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}