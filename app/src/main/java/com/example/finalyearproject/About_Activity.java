package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_Activity extends AppCompatActivity {

    private Button Back_button;
    public CardView atharv_cardview,yukta_cardview,dev_cardview,sushant_cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Back_button=findViewById(R.id.about_back_button_id);

        atharv_cardview=(CardView)findViewById(R.id.Atharv_CardView_id);
        yukta_cardview=(CardView)findViewById(R.id.Yukta_CardView_id);
        dev_cardview=(CardView)findViewById(R.id.Dev_CardView_id);
        sushant_cardview=(CardView)findViewById(R.id.Sushant_CardView_id);

        atharv_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(About_Activity.this, Atharv_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        yukta_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(About_Activity.this, Yukta_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        dev_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(About_Activity.this, Dev_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        sushant_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(About_Activity.this,Sushant_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        Back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(About_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}