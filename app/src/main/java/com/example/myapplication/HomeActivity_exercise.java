package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class HomeActivity_exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_exercise);

        //운동시작버튼시 홈에있는 리사이클러뷰의 1번의 운동이름을 받아와서 그에맞는 웹뷰를 뛰움
        //브레이크타임
        //완료버튼시 홈에있는 리사이클러뷰의 2번의 운동이름을 받아와서 그에맞는 웹뷰를 뛰움
        //브레이크타임
        //홈의 어레이리스트의 담겨있는 갯수만큼 반복함.

        WebView exercisewebView = (WebView) findViewById(R.id.exercisewebView);
//        exercisewebView.loadUrl("https://m.naver.com");
        exercisewebView.loadUrl("https://www.youtube.com/embed/2K2WCGstHOY");
//        exercisewebView.getSettings().setLoadWithOverviewMode(true);
        exercisewebView.getSettings().setJavaScriptEnabled(true);

        //버튼 2번누르는 거 추가
        Button exerciseTobrekbutton = (Button) findViewById(R.id.exerciseTobrekbutton);
        exerciseTobrekbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View breaktimeview = (View) findViewById(R.id.breaktimeLayout2);
                View exerciseLayout = (View) findViewById(R.id.exerciseLayout);
                exerciseLayout.setVisibility(View.INVISIBLE);
                breaktimeview.setVisibility(View.VISIBLE);
            }
        });
    }
}