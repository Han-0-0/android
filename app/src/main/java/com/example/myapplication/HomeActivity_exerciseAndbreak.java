package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class HomeActivity_exerciseAndbreak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_exercise_andbreak);

        WebView exercisewebView = (WebView) findViewById(R.id.exercisewebView);
//        exercisewebView.loadUrl("https://m.naver.com");
        exercisewebView.loadUrl("https://www.youtube.com/embed/2K2WCGstHOY");
//        exercisewebView.getSettings().setLoadWithOverviewMode(true);
        exercisewebView.getSettings().setJavaScriptEnabled(true);

        Button buttonTobreak = (Button) findViewById(R.id.exerciseTobrekbutton);
        buttonTobreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View breaktimeview = (View) findViewById(R.id.breaktimeLayout2);
                View exerciseview = (View) findViewById(R.id.exerciseLayout);
                exerciseview.setVisibility(View.GONE);
                breaktimeview.setVisibility(View.VISIBLE);
            }
        });

        Button breaktimeFinish = (Button) findViewById(R.id.breaktimeFinish);
        breaktimeFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View breaktimeview = (View) findViewById(R.id.breaktimeLayout2);
                View exerciseview = (View) findViewById(R.id.exerciseLayout);
                exerciseview.setVisibility(View.VISIBLE);
                breaktimeview.setVisibility(View.GONE);
            }
        });



    }
}