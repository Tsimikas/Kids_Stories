package com.hayder.kidsstories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

import Adapter.StoriesAdapter;
import Model.Story;

public class StoriesActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<Story> storyList = Data.storyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        recyclerView = findViewById(R.id.rv_stories);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        getSupportActionBar().hide();

       //List<Story> storyList = new ArrayList<>();
       // storyList.add(new Story("Blanch Neige","Une histoire sur une princesse dune très grande beauté",R.drawable.blancheneige));
        //storyList.add(new Story("Chaperon Rouge","Une jeune fille qui rencontre un loup en chemin",R.drawable.chaperonrouje));
        //storyList.add(new Story("Le Chat Botté","Un chat astucieux qui aide son maître à devenir riche",R.drawable.chat));
        //storyList.add(new Story("Le Vilain Petit Canard","Canard qui se sent différent des autres canards",R.drawable.petit_canard));
        //storyList.add(new Story("La Belle et la Bête","Histoire d'amour entre une femme et une bete",R.drawable.belle_bete));
       // storyList.add(new Story("Le Roman de Renart"," Un Renart et ses aventures à travers la campagne française",R.drawable.renard_romain));

        StoriesAdapter storiesAdapter =new StoriesAdapter(storyList,this);
        recyclerView.setAdapter(storiesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



}