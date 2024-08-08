package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class RC_Boat_Activity extends AppCompatActivity {
    private Button Back_Button;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc_boat);

        videoView = findViewById(R.id.videoView1);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.boat);
        MediaController mediaController =new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();


        Back_Button=findViewById(R.id.boat_back_button_id);
        Back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RC_Boat_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}