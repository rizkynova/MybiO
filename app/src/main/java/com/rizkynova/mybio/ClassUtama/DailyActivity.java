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
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
        mData.add(new RV("1. Nugas","Nugas, kegiatan yang selalu dilakukan setiap hari ketika sedang melakukan masa Work from home. Meski tidak semua materi yang diberikan benar benar dimengerti, akan tetapi Nugas adalah hal yang mutlak harus dilakukan oleh setiap mahasiswa yang ada di Indonesia saat ini. Berhubung dengan hal tersebut, dimulai lah kegiatan Nugas ini, salah satu tugas yang sangat saya gemari adalah Tugas dari mata kuliah Aplikasi Komputasi Bergerak(Mobile). Ini adalah Aktivitas sehari hari saya dimulai dari sini.","2 May 2020",R.drawable.foto));
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
