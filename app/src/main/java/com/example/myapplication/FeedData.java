package com.example.myapplication;

import android.widget.TextView;

public class FeedData {

    int Ib_FeederImage ;
    String  Tv_FeederName;
           // Fl_Feed 레이아웃은 복합이라 int String 으로 표현이안되지않을까?
    int Iv_Feedimage;
    int Ib_LikeButton;
    String Tv_Like;
    String Tv_Time;
    String Tv_CommentNickname;
    String Tv_Comment;
    String Bt_ViewCommnent;

    public FeedData(int ib_FeederImage, String tv_FeederName, int iv_Feedimage, String tv_Like, String tv_Time, String tv_CommentNickname, String tv_Comment) {
        Ib_FeederImage = ib_FeederImage;
        Tv_FeederName = tv_FeederName;
        Iv_Feedimage = iv_Feedimage;
        Tv_Like = tv_Like;
        Tv_Time = tv_Time;
        Tv_CommentNickname = tv_CommentNickname;
        Tv_Comment = tv_Comment;
        Bt_ViewCommnent = "댓글보기";
        Ib_LikeButton = com.google.android.material.R.drawable.btn_checkbox_checked_mtrl;
    }

}
