package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<HomeExerciseListData> arrayList;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    HomeExerciseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton setbutton = (ImageButton) findViewById(R.id.setbutton);
        setbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SetActivity.class);
                startActivity(intent);
            }
        });

        Button feedbutton = (Button) findViewById(R.id.feedbutton);
        feedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FeedActivity.class);
                startActivity(intent);
            }
        });

        Button recordbutton = (Button) findViewById(R.id.recordbutton);
        recordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RecordActivity.class);
                startActivity(intent);
            }
        });

        Button profilebutton = (Button) findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(intent);
            }
        });

        Button home_startbutton = (Button) findViewById(R.id.home_startbutton);
        home_startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity_exerciseAndbreak.class);
                startActivity(intent);
            }
        });
//버튼과 리스너 끝

//리사이클러뷰
        recyclerView = (RecyclerView) findViewById(R.id.ExerciseRecyclerView);

        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList=new ArrayList<>();

        adapter=new HomeExerciseAdapter(arrayList);
        recyclerView.setAdapter(adapter);
        HomeExerciseListData data = new HomeExerciseListData("랫풀다운",R.drawable.ic_launcher_background);
        arrayList.add(data);
        arrayList.add(data);
        arrayList.add(data);
        arrayList.add(data);
//리사이클러뷰끝

//데이터

//데이터끝
    }
}