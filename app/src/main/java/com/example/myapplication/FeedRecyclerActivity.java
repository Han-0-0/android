package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FeedRecyclerActivity extends AppCompatActivity {

    //왜 또 선언해야하는지 모르겠음
    ArrayList<FeedData> arrayList;
    FeedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_recycler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.FeedRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //왜 또 선언헤야하는지 모르겠음
//        arrayList = new ArrayList<>();
//        adapter = new FeedAdapter();

        recyclerView.setAdapter(adapter);

//        recyclerView.setAdapter(new FeedAdapter()); 이런식으로 그냥 하면안되나. 잠이와서 집중안되니 내일재검토
    }

}
