package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity
{
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button1 = (Button) findViewById(R.id.register);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openRegisterPage();
            }
        });

        button2 = (Button) findViewById(R.id.login);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openFeedPage();
            }
        });
    }

    public void openRegisterPage()
    {
        Intent dsp = new Intent(this, RegisterActivity.class);
        startActivity(dsp);
    }

    public void openFeedPage()
    {
        Intent intent = new Intent(this, FeedActivity.class);
        startActivity(intent);
    }
}