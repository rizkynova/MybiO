package com.rizkynova.mybio.ClassUtama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rizkynova.mybio.R;
import com.rizkynova.mybio.StaggeredRecyclerAdapter;
import com.rizkynova.mybio.row;

import java.util.ArrayList;
import java.util.List;

public class Gallery extends AppCompatActivity {
    private RecyclerView staggeredRv;
    private StaggeredRecyclerAdapter adapter;
    private StaggeredGridLayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);
        //array
        List<row> lst = new ArrayList<>();


        adapter = new StaggeredRecyclerAdapter(this,lst);
        staggeredRv.setAdapter(adapter);lst.add(new row(R.drawable.image1));
        lst.add(new row(R.drawable.image2));
        lst.add(new row(R.drawable.image3));
        lst.add(new row(R.drawable.image4));
        lst.add(new row(R.drawable.image5));
        lst.add(new row(R.drawable.image6));
        lst.add(new row(R.drawable.image7));
        lst.add(new row(R.drawable.image8));
        lst.add(new row(R.drawable.image9));
        lst.add(new row(R.drawable.image10));
        lst.add(new row(R.drawable.image11));
        lst.add(new row(R.drawable.image1));
        lst.add(new row(R.drawable.image2));
        lst.add(new row(R.drawable.image3));
        lst.add(new row(R.drawable.image4));
        lst.add(new row(R.drawable.image5));
        lst.add(new row(R.drawable.image6));
        lst.add(new row(R.drawable.image7));
        lst.add(new row(R.drawable.image8));
        lst.add(new row(R.drawable.image9));
        lst.add(new row(R.drawable.image10));
        lst.add(new row(R.drawable.image11));




        BottomNavigationView bottomNavigationView =findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_gallery);

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
