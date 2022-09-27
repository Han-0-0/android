package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//리사이클러.어댑터(만들어댑터클래스.커스텀뷰홀더) 를 상속받는 어댑터만들기
//커스텀뷰홀더클래스(+생성자)와 3개메서드(온크리에이트,온바인드,갯아이템)

public class FeedTestAdapter extends RecyclerView.Adapter<FeedTestAdapter.Customviewholder> {

    //데이터를 담을 어레이리스트생성.  //+ AllayList 의 <E> 안의 E는 Class 를 뜻함. ex)String class
    ArrayList<FeedTestData> arrayList;
    //어레이리스트를 인자로받는 생성자 생성
    public FeedTestAdapter(ArrayList<FeedData> arrayList) {
        //커스텀어뎁터(FeedTestAdapter) 를 선언할때 '생성자에넣는 어레이리스트' 가 이 어뎁터의 어레이리스트 값이 된다.
//        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Customviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // '레이아웃인플레이어' 로  'item_feed' 객체화하여 삽입.        객체화하여삽입할 레이아웃 ,삽입되는레이아웃 ,
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed,parent,false);
        // 인플레이트한 'view' 를 커스텀뷰홀더의 인자(itemView) 뷰로 사용 / onBindViewHolder 메서드에서 사용하기위해 holder 라는 명령어를생성
        Customviewholder holder = new Customviewholder(view);
        // 홀더(커스텀뷰홀더) 를 리턴시켜줌 / 왠진모름
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Customviewholder holder, int position) {
        //데이터를 (커스텀뷰홀터의 인자인)아이템뷰 에 표시
        //어레이리스트의 값을가져와 아이템뷰에 표시
        holder.feedimage.setImageResource(arrayList.get(position).feedimage);
        holder.likebutton.setImageResource(arrayList.get(position).likebutton);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Customviewholder extends RecyclerView.ViewHolder {
        //데이터객체
        ImageView feedimage;
        ImageButton likebutton;

        //데이터객체의 id 찾기
        public Customviewholder(@NonNull View itemView) {
            super(itemView);
            //findViewById 는 view 클래스의 메서드이기 때문에 뷰를인자로받아 메서드사용
            //이미지뷰선언 + findViewById
            //커스텀뷰 생성시 이미지뷰와 이미지버튼 메모리선언,id 찾기
            feedimage=(ImageView) itemView.findViewById(R.id.Iv_Feedimage);
            likebutton=(ImageButton) itemView.findViewById(R.id.Ib_LikeButton);
        }
    }
    //종합
    //1.CustomViewHolder 에 데이터객체 맵핑
    //2.onCreate 에서 (커스텀뷰)홀더 생성후 호출값생성,리턴
    //3.onBindViewHolder 에서 setText , setImage... 로 텍스트,이미지 값변경
    //4.getItemCount 만큼 반복


}
