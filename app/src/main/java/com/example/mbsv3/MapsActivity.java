/**
 * Elina Kuzmina
 * 3ITB
 */

package com.example.mbsv3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {



    private GoogleMap mMap;
    private Uri info;
    private Button btn;
//    private DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        
    }

        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;
            btn = findViewById(R.id.homePageButton);
            // Make cinemas Markers
            //ForumCinemas
            final Marker Forma = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng( 56.9464689,24.1165938))
                    .title("Forma Kino"));
            //Multikino
            final Marker MediaKino = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng( 56.92804347731904,24.103543613324444))
                    .title("Media Kino"));
            //Cinamon
            final Marker Kanelis = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng( 56.983255122680966,24.203775794557497))
                    .title("Kanēlis"));
            //Splendid Palace
            final Marker BieziasKino = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng( 56.95349512268097,24.1190769583203))
                    .title("Biezais kinoteātris"));
            //KinoBize
            final Marker FrizurKino = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng( 56.95747632268097,24.1114646230645))
                    .title("Frizūru kino"));
            //K.Suns
            final Marker KKakis = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng( 56.95030702268097,24.121586386546166))
                    .title("K.Kakis"));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Forma.getPosition(), 12F));

            mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker marker) {
                    if (marker.equals(Forma) || marker.equals(MediaKino) || marker.equals(Kanelis) || marker.equals(BieziasKino) || marker.equals(FrizurKino) || marker.equals(KKakis)) {
                        System.out.println("Success!!");
                        openInfo("http://printingtechnology.lv/testWebPage/index.html");

                    } else {
                        System.out.println("Dohhh");
                    }
                    return false;
                }
            });

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToHomePage(v);
                }
            });

        }

        public void openInfo(String link) {
            info = Uri.parse(link);
            Intent i = new Intent(Intent.ACTION_VIEW, info);
            if (i.resolveActivity(getPackageManager())!=null) {
                startActivity(i);
            }
        }

        public void goToHomePage(View v){
            info = Uri.parse("http://printingtechnology.lv/testWebPage/index.html");
            Intent i = new Intent(Intent.ACTION_VIEW, info);
            if (i.resolveActivity(getPackageManager())!=null) {
                startActivity(i);
            }
        }

}
