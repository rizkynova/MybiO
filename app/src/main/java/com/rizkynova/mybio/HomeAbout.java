package com.rizkynova.mybio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rizkynova.mybio.ClassUtama.DailyActivity;
import com.rizkynova.mybio.ClassUtama.Gallery;
import com.rizkynova.mybio.ClassUtama.Home;
import com.rizkynova.mybio.ClassUtama.Music;
import com.rizkynova.mybio.ClassUtama.Profile;

public class HomeAbout extends AppCompatActivity {
Button mBtnFavFood,mBtnHobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_about);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        mBtnFavFood = findViewById(R.id.btnFavFood);
        mBtnHobby = findViewById(R.id.btnHobby);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_daily:
                        startActivity(new Intent(getApplicationContext(), DailyActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_gallery:
                        startActivity(new Intent(getApplicationContext(), Gallery.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_music:
                        startActivity(new Intent(getApplicationContext(), Music.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
        mBtnFavFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeAbout.this, HomeFavFood.class);
                startActivity(i);
                finish();
            }
        });
        mBtnHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeAbout.this,HomeInterest.class);
                startActivity(i);
                finish();
            }
        });
    }
}
