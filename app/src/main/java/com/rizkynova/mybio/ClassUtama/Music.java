package com.rizkynova.mybio.ClassUtama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rizkynova.mybio.ClassPendukung.RV;
import com.rizkynova.mybio.ClassPendukung.RVAdapter;
import com.rizkynova.mybio.R;
import com.rizkynova.mybio.RVMusic;
import com.rizkynova.mybio.RVMusicAdapter;

import java.util.ArrayList;
import java.util.List;

public class Music extends AppCompatActivity {
    RecyclerView rvcoy;
    RVMusicAdapter rvMusicAdapter;
    List<RVMusic> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        //inisiasi viewnya disini
        rvcoy = findViewById(R.id.rv);
        mData = new ArrayList<>();
        //ini isinya tinggal tambah kalo butuh banyak
        mData.add(new RVMusic("With ear to see and eye to hear","Sleeping With Sirens","2 May 2020",R.drawable.sws));
        mData.add(new RVMusic("Iris","Sleeping With Sirens","2 May 2020",R.drawable.sws));
        mData.add(new RVMusic("Roger Rabbit","Sleeping With Sirens","2 May 2020",R.drawable.sws));
        mData.add(new RVMusic("If i'm James Dean, You're Audrey Hepburn","Sleeping With Sirens","2 May 2020",R.drawable.sws));
        mData.add(new RVMusic("Kick Me","Sleeping With Sirens","2 May 2020",R.drawable.sws));
        mData.add(new RVMusic("Do it now! Remember it Later!","Sleeping With Sirens","2 May 2020",R.drawable.sws));
        mData.add(new RVMusic("Cancer","My Chemical Romance","2 May 2020",R.drawable.mcr));
        mData.add(new RVMusic("Helena","My Chemical Romance","2 May 2020",R.drawable.mcr));
        mData.add(new RVMusic("Welcome to Black Parade","My Chemical Romance","2 May 2020",R.drawable.mcr));
       // inisiasi adapternya sekalian setup si adapternya
        rvMusicAdapter = new RVMusicAdapter(this,mData);
        rvcoy.setAdapter(rvMusicAdapter);
        rvcoy.setLayoutManager(new LinearLayoutManager(this));


        BottomNavigationView bottomNavigationView =findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_music);

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
}
