package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FeedUploadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_upload);

        Button uploadbutton = (Button) findViewById(R.id.UploadButton);
        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1.UploadFeedWriting 의 text 내용과 , FindImage 의 이미지를 받아온다.//이미지를 업로드했는지 태그
                TextView textView = (TextView) findViewById(R.id.Tv_UploadFeedWriting);
                String FeedComment = textView.getText().toString();

                //2.피드어레이리스트에 추가한다.
                //3.이엑티비티를 끝낸다.
            }
        });
//
//        ImageButton findimagebutton = (ImageButton) findViewById(R.id.Ib_Findimage);
//        findimagebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //1.갤러리앱을뛰워 사진을찾게한다.
//                //2.선택한사진으로 버튼의 이미지를갱신한다.
//                //3.태그를 이용해 이미지를 가져왔다는것을 표시한다 혹은 다른방식으로 확인
//            }
//        });



    }
}