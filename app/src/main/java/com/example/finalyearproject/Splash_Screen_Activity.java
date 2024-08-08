package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen_Activity extends AppCompatActivity {

    private AnimationDrawable drop_animation;
    private ImageView drop_image;
    private ImageView logo_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


//drop animation............
        drop_image=(ImageView) findViewById(R.id.drop_id);
        drop_image.setBackgroundResource(R.drawable.frame_animatio);
        drop_animation=(AnimationDrawable) drop_image.getBackground();
        drop_animation.start();



    //loading app logo..................

        logo_image=(ImageView) findViewById(R.id.app_logo);
        Animation startanimation= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_animation);


        logo_image.startAnimation(startanimation);
        //next activity...........................
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_Screen_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);


    }
}