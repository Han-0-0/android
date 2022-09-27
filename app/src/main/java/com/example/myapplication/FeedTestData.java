package com.example.myapplication;

//데이터 입출력을 담당하는 클래스
public class FeedTestData {
    //데이터 - 데이터변수타입지정. -xml형식으로 변환할필요가있음
    int feedimage ;
    int likebutton ;

    public FeedTestData(int feedimage, int likebutton) {
        this.feedimage = feedimage;
        this.likebutton = likebutton;
    }

    public int getFeedimage() {
        return feedimage;
    }

    public void setFeedimage(int feedimage) {
        this.feedimage = feedimage;
    }

    public int getLikebutton() {
        return likebutton;
    }

    public void setLikebutton(int likebutton) {
        this.likebutton = likebutton;
    }
}
