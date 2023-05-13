package com.hayder.kidsstories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
    Toolbar toolbar ;
    TextView tv1 , tv2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);


        toolbar=findViewById(R.id.tb);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        MenuItem storiesItem = menu.findItem(R.id.stories);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.stories: toStories(); return true;
            case R.id.favourite: toFavStories(); return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void toFavStories() {
        Intent intent = new Intent(WelcomeActivity.this,FavStoriesActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Favorite Stories", Toast.LENGTH_SHORT).show();
    }

    private void toStories() {
        Intent intent = new Intent(WelcomeActivity.this, StoriesActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Stories", Toast.LENGTH_SHORT).show();
    }
}