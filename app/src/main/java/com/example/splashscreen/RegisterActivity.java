package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity
{
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        img = findViewById(R.id.back_arrow);
        img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openLoginPage();
            }
        });
    }

    public void openLoginPage()
    {
        Intent dsp = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(dsp);
    }
}