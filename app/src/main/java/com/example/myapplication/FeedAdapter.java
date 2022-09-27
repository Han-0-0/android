package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.CustomViewHolder> {

    //팀노바강의에서는 arrayList 를 mainActivity 에 두고 사용히는듯해보임 . 확인필요 .
    //ex> return mainactivity.arrayList.size() - arrayList를 static 으로 두면 사용가능할것으로 보임. - 스태틱의 부작용이없다면 두고싶은곳에 어디든 둘수있을것으로 보임
    ArrayList<FeedData> arrayList;

    public FeedAdapter(ArrayList<FeedData> feedArrayList) {
        this.arrayList=feedArrayList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        //생략시어케되지?
        holder.feederimage.setImageResource(arrayList.get(position).Ib_FeederImage);
        holder.feedernickname.setText(arrayList.get(position).Tv_FeederName);
        holder.feedimage.setImageResource(arrayList.get(position).Iv_Feedimage);
        holder.likebutton.setImageResource(arrayList.get(position).Ib_LikeButton);
        holder.likenumber.setText(arrayList.get(position).Tv_Like);
        holder.time.setText(arrayList.get(position).Tv_Time);
        holder.commentnickname.setText(arrayList.get(position).Tv_CommentNickname);
        holder.comment.setText(arrayList.get(position).Tv_Comment);
        //일단 버튼은 텍스트니까 텍스트로 해놓았음
        holder.viewcomment.setText(arrayList.get(position).Bt_ViewCommnent);

        holder.feederimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //피더의 데이터로 갱신된 프로필 액티비티로 이동
            }
        });

        holder.likebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1.라이크 버튼의 이미지가 채워지고
                //2.그 피드의 좋아요갯수가 1늘고 갱신
            }
        });

        holder.viewcomment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //코맨트 gone -> visible  혹은  코맨트 엑티비티로이동
                //1.gone - > visible 선택시 : (장)액티비티이동 x (단)리사이클러뷰에 다선언해야함 (특)
                //2. 코맨트 액티비티로 이동시  : (장)분리?깔끔함,불필요한연산 x (단) ()
                //*2번선택
                //*코맨트 액티비티로 이동하는 인탠트 추가할것.
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        ImageButton feederimage ;
        TextView feedernickname ;
        ImageView feedimage;
        ImageButton likebutton;
        TextView likenumber;
        TextView time;
        TextView commentnickname;
        TextView comment;
        Button viewcomment;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            feederimage=(itemView).findViewById(R.id.Ib_FeederImage);
            feedernickname=(itemView).findViewById(R.id.Bt_FeederName);
            feedimage=(itemView).findViewById(R.id.Iv_Feedimage);
            likebutton=(itemView).findViewById(R.id.Ib_LikeButton);
            likenumber=(itemView).findViewById(R.id.Tv_Like);
            time=(itemView).findViewById(R.id.Tv_Time);
            commentnickname=(itemView).findViewById(R.id.Tv_CommentNickname);
            comment=(itemView).findViewById(R.id.Tv_Comment);
            viewcomment=(itemView).findViewById(R.id.Bt_ViewCommnent);

        }
    }
}
