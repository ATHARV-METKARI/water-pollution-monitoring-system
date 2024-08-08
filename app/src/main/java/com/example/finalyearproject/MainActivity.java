package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    public CardView Boat_CardView,Readings_CardView,Map_CardView,Cities_CardView,Documents_CartView,About_CardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boat_CardView=(CardView) findViewById(R.id.Rc_Boat_CardView_id);
        Readings_CardView=(CardView) findViewById(R.id.Readings_CardView_id);
        Map_CardView=(CardView) findViewById(R.id.Map_CardView_id);
        Cities_CardView=(CardView) findViewById(R.id.Cities_CardView_id);
        Documents_CartView=(CardView) findViewById(R.id.Document_CardView_id);
        About_CardView=(CardView) findViewById(R.id.About_CardView_id);

        Boat_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RC_Boat_Activity.class);
                startActivity(intent);
                finish();

            }
        });


        Readings_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this,Readings_Activity.class);
                startActivity(intent);
                finish();
            }
        });


        Map_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Maps_Activity.class);
                startActivity(intent);
                finish();
            }
        });


        Cities_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Cities_Activity.class);
                startActivity(intent);
                finish();
            }
        });


        Documents_CartView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Document_Activity.class);
                startActivity(intent);
                finish();
            }
        });


        About_CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, About_Activity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}