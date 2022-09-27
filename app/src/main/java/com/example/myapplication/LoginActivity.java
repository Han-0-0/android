package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_entry);

        //아이디와 비밀번호가 서버에있다면 로그인
        //없다면 회원가입




        Spinner spinner = (Spinner) findViewById(R.id.Spinner_Email);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String FinalEmail;
                EditText editText = (EditText) findViewById(R.id.Et_input_Email);

                EditText editText1 = (EditText) findViewById(R.id.Et_LoginEmail_Front);
                TextView textView = (TextView) findViewById(R.id.Tv_LoginEmail_back);

                //만약 직접입력이면 아무것도적지않음
               if (adapterView.getItemAtPosition(i).toString().equals("직접입력")){
                   editText1.setVisibility(View.GONE);
                   textView.setVisibility(View.GONE);
                   editText.setText(editText1.getText());
                   editText.setVisibility(View.VISIBLE);

                }else {
                   //기존 에디트텍스트 invi
                   editText.setVisibility(View.INVISIBLE);
                   //새로운 에디트텍스트와 텍스트뷰로 대체

                    //기존 에디트텍스트 정보 가져오기
                   editText1.setText(editText.getText());
                    //visible 로 전환
                   editText1.setVisibility(View.VISIBLE);

                    //스피너에서 받아온 값으로 텍스트채우기
                   String domain = "@"+adapterView.getItemAtPosition(i).toString();
                   textView.setText(domain);
                    //visible 로 전환
                   textView.setVisibility(View.VISIBLE);
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        //Email 과 Pw 에서 입력값을 받아옴

        //1.이메일 규격확인 , 2.패스워드 규격확인

        //서버 데이터베이스에 이메일 중복확인

        //계정이없을시 생성 or 계정이있을시 로그인



        //또는 카카오로그인
    }
}