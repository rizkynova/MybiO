package com.rizkynova.mybio.ClassUtama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rizkynova.mybio.HomeAbout;
import com.rizkynova.mybio.HomeFavFood;
import com.rizkynova.mybio.HomeInterest;
import com.rizkynova.mybio.R;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {
    private Animation animation;
    TextView txtHelp,txtBodyHelp;
    ImageView img;
    Button btnContact,mBtnAbout,mBtnHobby,mBtnFavFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottomNavigationView =findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        animation = AnimationUtils.loadAnimation(Home.this,R.anim.bottom_anim);
        img = findViewById(R.id.imgHelp);
        txtHelp = findViewById(R.id.textHelp);
        mBtnAbout = findViewById(R.id.btnAbout);
        mBtnHobby = findViewById(R.id.btnHobby);
        mBtnFavFood = findViewById(R.id.btnFavFood);
        txtBodyHelp = findViewById(R.id.textBodyHelp);
        btnContact = findViewById(R.id.btnContact);
        txtBodyHelp.setAnimation(animation);
        btnContact.setAnimation(animation);
        txtHelp.setAnimation(animation);
        img.setAnimation(animation);
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

        mBtnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, HomeAbout.class);
                startActivity(i);
                finish();
            }
        });
        mBtnFavFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Home.this, HomeFavFood.class);
                startActivity(j);
                finish();
            }
        });
        mBtnHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Home.this, HomeInterest.class);
                startActivity(k);
                finish();
            }
        });
    }
}
