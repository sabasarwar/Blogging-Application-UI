package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FeedActivity extends AppCompatActivity
{

    ImageView img, img2, img3, img4, img5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        img = findViewById(R.id.profile);
        img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openProfilePage();
            }
        });


        img2 = findViewById(R.id.add_blog);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWriteBlogPage();
            }
        });

        img3 = findViewById(R.id.search);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchPage();
            }
        });

        img4 = findViewById(R.id.home);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeedPage();
            }
        });


        img5 = findViewById(R.id.messaging);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMessagingPage();
            }
        });
    }

    public void openProfilePage()
    {
        Intent intent = new Intent(FeedActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void openWriteBlogPage()
    {
        Intent intent2 = new Intent(this, WriteBlogActivity.class);
        startActivity(intent2);
    }

    public void openSearchPage()
    {
        Intent intent3 = new Intent(this, SearchActivity.class);
        startActivity(intent3);
    }

    public void openFeedPage()
    {
        Intent intent4 = new Intent(this, FeedActivity.class);
        startActivity(intent4);
    }

    public void openMessagingPage()
    {
        Intent intent5 = new Intent(this, MessagingActivity.class);
        startActivity(intent5);
    }
}