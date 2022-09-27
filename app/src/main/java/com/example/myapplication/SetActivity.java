package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SetActivity extends AppCompatActivity {

    //id password 데이터값 받아와서 텍스트뷰에 이식하기


    String shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        //데이터베이스
        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //데이터베이스 끝

        Button logoutbutton = (Button) findViewById(R.id.Bt_Logout);
        logoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //로그인 액티비티로이동
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                //로그인액티비티를 제외한 액티비티를 다 꺼버려야함

            }
        });

        Button sendcommentsbutton = (Button) findViewById(R.id.button_sendcomments);
        sendcommentsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View sendcommentsview = (View) findViewById(R.id.sendcommentslayout);
                sendcommentsview.setVisibility(View.VISIBLE);
            }
        });

        Button submitcommentsbutton = (Button) findViewById(R.id.submitcommentsbutton);
        submitcommentsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View sendcommentsview = (View) findViewById(R.id.sendcommentslayout);
                sendcommentsview.setVisibility(View.GONE);

            }
        });
//사운드 on off 버튼
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.ToggleB_Sound);
        //저장된 데이터에따라 버튼 on off 뛰우기
        toggleButton.setChecked(sharedPreferences.getString("sound", "").equals("on"));
        //사운드 버튼의 리스너
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //데이터 입력
                if (b){
                    editor.putString("sound","on");
                }else {
                    editor.putString("sound","off");
                }
                //데이터저장
                editor.apply();
            }
        });

        //토글버튼 off 일때 seekbar 를 gone on 일때 visible로

//푸시 on off 버튼
        ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.ToggleB_Push);
        toggleButton1.setChecked(sharedPreferences.getString("push", "").equals("on"));
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //데이터 입력
                if (b) {
                    editor.putString("push", "on");
                } else {
                    editor.putString("push", "off");
                }
                //데이터저장
                editor.apply();
            }
        });
    }
}