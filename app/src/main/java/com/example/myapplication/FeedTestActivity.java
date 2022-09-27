package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedTestActivity extends AppCompatActivity {

    //목적:리사이클러뷰사용 > 1.리사이클러뷰선언,id지정 > 2.레이아웃매니져와 어뎁터의 선언 > 3.어뎁터의 인자에필요한 어레이리스트생성
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    FeedTestAdapter feedAdapter;
    ArrayList<FeedTestData> feedArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_feed);
        //데이터의 값구현 - 이미지뷰의 이미지와 이미지버튼의 버튼을구현
        FeedTestData feedTestData = new FeedTestData(R.drawable.ic_launcher_background, R.id.Ib_LikeButton);
        //어레이리스트에 데이터추가
        feedArrayList.add(feedTestData);

//        //리사이클러뷰의 id지정
//        recyclerView = (RecyclerView) findViewById(R.id.FeedRecyclerView);
//        //리사이클러뷰의 레이아웃매니져지정
//        linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        //리사이클러뷰의 어뎁터지정
//        feedArrayList = new ArrayList<>();
//        //어레이리스트를 사용하는이유는??
//        feedAdapter = new FeedTestAdapter(feedArrayList);
//        recyclerView.setAdapter(feedAdapter);


    }
}