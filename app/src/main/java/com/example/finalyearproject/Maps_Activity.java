package com.example.finalyearproject;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.finalyearproject.databinding.ActivityMapsBinding;

import java.util.ArrayList;

public class Maps_Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    private ArrayList<LatLng> River_LatLngs = new ArrayList<LatLng>();
    private ArrayList<String> Markers =new ArrayList<String>();

    private Button Back_Button;

    //all latlngs ...............
    private LatLng cooum_River_LatLng= new LatLng(13.070371, 80.277762);
    private LatLng bagmati_River_LatLng= new LatLng(27.644851, 85.285111);
    private LatLng vaitarna_River_LatLng= new LatLng(19.691379, 72.937277);
    private LatLng sirsiya_River_LatLng= new LatLng(26.93269901812416, 84.8669815836439);
    private LatLng mithi_River_LatLng= new LatLng(19.093530012690653, 72.87843671398147);
    private LatLng versova_Beach_LatLng= new LatLng(19.140402918669828, 72.802787181342);
    private LatLng yamuna_River_LatLng= new LatLng(26.1497091481696, 79.93562566979008);
    private LatLng hidon_River_LatLng= new LatLng(28.626489059777565, 77.40716325725181);
    private LatLng waldhuni_River_LatLng= new LatLng(19.216040705357607, 73.16586636054544);
    private LatLng indrayani_River_LatLng= new LatLng(18.68043927164618, 73.85980262184263);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Back_Button = findViewById(R.id.doc_back_button_id);

        Back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Maps_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });





        River_LatLngs.add(cooum_River_LatLng);
        River_LatLngs.add(bagmati_River_LatLng);
        River_LatLngs.add(vaitarna_River_LatLng);
        River_LatLngs.add(sirsiya_River_LatLng);
        River_LatLngs.add(mithi_River_LatLng);
        River_LatLngs.add(versova_Beach_LatLng);
        River_LatLngs.add(yamuna_River_LatLng);
        River_LatLngs.add(hidon_River_LatLng);
        River_LatLngs.add(waldhuni_River_LatLng);
        River_LatLngs.add(indrayani_River_LatLng);


        Markers.add("Cooum River");
        Markers.add("Bagmati River");
        Markers.add("Vaitarna River");
        Markers.add("Sirsiya River");
        Markers.add("Mithi River");
        Markers.add("Versova Beach");
        Markers.add("Yamuna River");
        Markers.add("Hidon River");
        Markers.add("Waldhuni River");
        Markers.add("Indrayani River");


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        for (int i=0;i<River_LatLngs.size();i++){

            for (int j=0;j<Markers.size();j++)
            {
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                mMap.addMarker(new MarkerOptions().position(River_LatLngs.get(i)).title(String.valueOf(Markers.get(i))));
            }

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(River_LatLngs.get(i),5));

        }
    }
}