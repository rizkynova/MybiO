package com.rizkynova.mybio.ClassUtama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rizkynova.mybio.FriendList;
import com.rizkynova.mybio.R;
import com.rizkynova.mybio.ClassPendukung.RV;
import com.rizkynova.mybio.ClassPendukung.RVAdapter;

import java.util.ArrayList;
import java.util.List;

public class DailyActivity extends AppCompatActivity {

    RecyclerView rvcoy;
    RVAdapter rvAdapter;
    List<RV> mData;
    FloatingActionButton fabutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);
        fabutton = findViewById(R.id.floatingActionButton);

        //inisiasi viewnya disini
        rvcoy = findViewById(R.id.rv);
        mData = new ArrayList<>();
        //ini isinya tinggal tambah kalo butuh banyak
        mData.add(new RV("Nugas","/nu-gas/(sedang) menjalankan tugas; ada tugas; mempunyai tugas.","2 May 2020",R.drawable.nugas));
        mData.add(new RV("Mengantar","/meng-an-tar/ menemani orang berjalan atau pergi;","2 May 2020",R.drawable.anter));
        mData.add(new RV("Main","/ma-in/ melakukan permainan untuk menyenangkan hati(dengan menggunakan alat-alat tertentu atau tidak)","2 May 2020",R.drawable.main));
        mData.add(new RV("Makan","/ma-kan/ memasukan makanan pokok kedalam mulut serta menyungah dan menelannya.","2 May 2020",R.drawable.makan));
        mData.add(new RV("Kerja","/ker-ja/ sesuatu yang dilakukan untuk mencari nafkah, mata pencaharian","2 May 2020",R.drawable.kerja));
        mData.add(new RV("Tidur","/ti-dur/ dalam keadaan berhenti badan dan kesadarannya(biasanya dengan keadaan memejamkan mata)","2 May 2020",R.drawable.tidur));
        mData.add(new RV("Belajar","/bel-a-jar/ berusaha memperoleh kepandaian atau ilmu","2 May 2020",R.drawable.kulon));
        mData.add(new RV("Nugas","/nu-gas/(sedang) menjalankan tugas; ada tugas; mempunyai tugas.","2 May 2020",R.drawable.nugas));
        mData.add(new RV("Mengantar","/meng-an-tar/ menemani orang berjalan atau pergi;","2 May 2020",R.drawable.anter));
        mData.add(new RV("Main","/ma-in/ melakukan permainan untuk menyenangkan hati(dengan menggunakan alat-alat tertentu atau tidak)","2 May 2020",R.drawable.main));
        mData.add(new RV("Makan","/ma-kan/ memasukan makanan pokok kedalam mulut serta menyungah dan menelannya.","2 May 2020",R.drawable.makan));
        mData.add(new RV("Kerja","/ker-ja/ sesuatu yang dilakukan untuk mencari nafkah, mata pencaharian","2 May 2020",R.drawable.kerja));
        mData.add(new RV("Tidur","/ti-dur/ dalam keadaan berhenti badan dan kesadarannya(biasanya dengan keadaan memejamkan mata)","2 May 2020",R.drawable.tidur));
        mData.add(new RV("Belajar","/bel-a-jar/ berusaha memperoleh kepandaian atau ilmu","2 May 2020",R.drawable.kulon));
        // inisiasi adapternya sekalian setup si adapternya
        rvAdapter = new RVAdapter(this,mData);
        rvcoy.setAdapter(rvAdapter);
        rvcoy.setLayoutManager(new LinearLayoutManager(this));



        BottomNavigationView bottomNavigationView =findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_daily);

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

        fabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DailyActivity.this, FriendList.class);
                startActivity(i);
                finish();
            }
        });

    }
}
