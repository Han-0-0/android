package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    //목적:리사이클러뷰사용 > 1.리사이클러뷰선언,id지정 > 2.레이아웃매니져와 어뎁터의 선언 > 3.어뎁터의 인자에필요한 어레이리스트생성
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    FeedAdapter feedAdapter;
    ArrayList<FeedData> feedArrayList; // FeedData : 어레이리스트의 규격을 정함
    //서버 데이터베이터에서 값을받아서 어레이리스트에 넣기 -> 그값이 어뎁터에전달 -> 내가 뷰홀더에 객체화한값들을 전달받은값으로 갱신.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_recycler);
        //데이터의 값구현 - 이미지뷰의 이미지와 이미지버튼의 버튼을구현

        //리사이클러뷰의 id지정
        recyclerView = (RecyclerView) findViewById(R.id.FeedRecyclerView);
        //리사이클러뷰의 레이아웃매니져지정
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        //리사이클러뷰의 어뎁터지정
        feedArrayList = new ArrayList<>();
        //어레이리스트를 사용하는이유는??
        feedAdapter = new FeedAdapter(feedArrayList);
        recyclerView.setAdapter(feedAdapter);

        FeedData data = new FeedData(R.drawable.ic_launcher_background,"한한쓰",R.drawable.ic_launcher_background,"n개","n분전","한한쓰","오늘도고생했따");
        feedArrayList.add(data);
        feedAdapter.notifyDataSetChanged();
        feedArrayList.add(data);

        Button button = (Button) findViewById(R.id.Bt_To_FeedUpload);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FeedUploadActivity.class);
                startActivity(intent);
            }
        });



    }
}