package com.rizkynova.mybio.ClassUtama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rizkynova.mybio.R;

public class Profile extends AppCompatActivity {
    Context con;
    ImageButton btnInstagram,btnTwitter,btnWhatsapp,btnGoogle,btnLocation;
    Button btnVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnTwitter = findViewById(R.id.btnTwitter);
        btnWhatsapp = findViewById(R.id.btnWhatsapp);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnLocation = findViewById(R.id.btnLocation);
        btnVersion = findViewById(R.id.btnVersion);
        BottomNavigationView bottomNavigationView =findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_profile);

        btnVersion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });


        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/rizkynovaaa");
                Intent instagramIntent = new Intent(Intent.ACTION_VIEW,uri);
                instagramIntent.setPackage("com.instagram.android");
                try {
                    startActivity(instagramIntent);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://instagram.com/rizkynovaaa")));
                }
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                try {
                    con.getPackageManager().getPackageInfo("com.twitter.android",0);
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=rizkynovaaa"));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }catch (Exception e){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/rizkynovaaa"));
                }
                startActivity(intent);
            }
        });
        btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber="+6289514166180";
                String message="Hallo Nova, Aplikasinya keren!";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(String.format("https://api.whatsapp.com/send?phone=%s&text=%s",phoneNumber,message))));
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_SEND);
               intent.setType("message/rfc822");
               intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rizkynovayandiofficial@gmail.com"});
               intent.putExtra(Intent.EXTRA_SUBJECT,"MybiO Apps");
               if (intent.resolveActivity(getPackageManager())!=null){
                   startActivity(intent);
               }
            }
        });
        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String latitude = "-6.903811";
                String longitude = "107.568702";
                String uri ="geo:"+latitude+","+longitude+"?q="+latitude+","+longitude;
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(uri)));
            }
        });


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_daily:
                        startActivity(new Intent(getApplicationContext(),DailyActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_gallery:
                        startActivity(new Intent(getApplicationContext(),Gallery.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_music:
                        startActivity(new Intent(getApplicationContext(),Music.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(),Profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    public void showDialog(){
        Dialog dialog = new Dialog(Profile.this);
        dialog.setContentView(R.layout.costum_dialog);
        dialog.show();

    }

}
