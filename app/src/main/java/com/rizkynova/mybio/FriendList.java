package com.rizkynova.mybio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rizkynova.mybio.ClassPendukung.MainAdapter;
import com.rizkynova.mybio.ClassPendukung.MainModel;
import com.rizkynova.mybio.ClassUtama.DailyActivity;

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
        Integer[] UserImageFriend = {R.drawable.foto,R.drawable.foto,R.drawable.foto,R.drawable.foto,R.drawable.foto,R.drawable.foto,R.drawable.foto};
        String[] UserNameFriend = {"Rizky Nova","Rizky Nova","Rizky Nova","Rizky Nova","Rizky Nova","Rizky Nova","Rizky Nova"};

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
