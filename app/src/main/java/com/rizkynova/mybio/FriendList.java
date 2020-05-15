package com.rizkynova.mybio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rizkynova.mybio.ClassPendukung.MainAdapter;
import com.rizkynova.mybio.ClassPendukung.MainModel;
import com.rizkynova.mybio.ClassUtama.DailyActivity;
import com.rizkynova.mybio.ClassUtama.Gallery;
import com.rizkynova.mybio.ClassUtama.Home;
import com.rizkynova.mybio.ClassUtama.Music;
import com.rizkynova.mybio.ClassUtama.Profile;

import java.util.ArrayList;

public class FriendList extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;
    FloatingActionButton fabutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        fabutton = findViewById(R.id.floatingActionButton);
        recyclerView = findViewById(R.id.rvfriend);
        Integer[] UserImageFriend = {R.drawable.rizkynova,R.drawable.tasyadian,R.drawable.billyelish,R.drawable.brunomars,R.drawable.edsheeran,R.drawable.emmawatson,R.drawable.johnmayer,R.drawable.justinbieber,R.drawable.leejieun,R.drawable.raisa,R.drawable.songhyekyo,R.drawable.taylorswift};
        String[] UserNameFriend = {"Rizky Nova","Tasya Dian Lestari","Billy Eilish","Bruno Mars","Edsheeran","Emma Watson","John Mayer","Justin Bieber","Lee Ji Eun","Raisa Andriana","Song Hye Kyo","Taylor Swift"};

        mainModels = new ArrayList<>();
        for(int i=0;i<UserImageFriend.length;i++){
            MainModel model = new MainModel(UserImageFriend[i],UserNameFriend[i]);
            mainModels.add(model);
        }
        //ini design horizontalnya
        LinearLayoutManager layoutManager = new LinearLayoutManager(FriendList.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //inisialisasi main adapternya
        mainAdapter = new MainAdapter(FriendList.this,mainModels);
        //set mainadapternya ke recycleview
        recyclerView.setAdapter(mainAdapter);

        BottomNavigationView bottomNavigationView =findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_daily);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_daily:
                        startActivity(new Intent(getApplicationContext(),DailyActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_gallery:
                        startActivity(new Intent(getApplicationContext(), Gallery.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_music:
                        startActivity(new Intent(getApplicationContext(), Music.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        fabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FriendList.this, DailyActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
