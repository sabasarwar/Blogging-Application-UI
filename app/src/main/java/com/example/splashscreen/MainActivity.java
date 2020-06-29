package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //Animation
    Animation logo_animation, mid_animation, vision_animation;

    //Hooks
    TextView vision, mid;

    Handler handler;
    Runnable runnable;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_animation = AnimationUtils.loadAnimation(this,R.anim.logo_animation);
        vision_animation = AnimationUtils.loadAnimation(this,R.anim.vision_animation);
        mid_animation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        img = findViewById(R.id.img);
        mid = findViewById(R.id.midLogo);
        vision = findViewById(R.id.vision);

        img.animate().alpha(400).setDuration(0);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent dsp = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(dsp);
                finish();
            }

        }, 4000);

        img.setAnimation(logo_animation);
        mid.setAnimation(mid_animation);
        vision.setAnimation(vision_animation);

    }
}