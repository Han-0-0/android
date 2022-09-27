package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeExerciseAdapter extends RecyclerView.Adapter<HomeExerciseAdapter.Customviewholder> {

    ArrayList<HomeExerciseListData> arrayList;

    public HomeExerciseAdapter(ArrayList<HomeExerciseListData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public HomeExerciseAdapter.Customviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.y_changelayout1,parent,false);
        Customviewholder holder = new Customviewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeExerciseAdapter.Customviewholder holder, int position) {
        holder.changebutton.setImageResource(arrayList.get(position).changebutton);
        holder.deletebutton.setImageResource(arrayList.get(position).deletebutton);
        holder.exercisename.setText(arrayList.get(position).exercisename);
        holder.exerciseimage.setImageResource(arrayList.get(position).exerciseimage);

//        holder.changebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //체인지엑티비티로 이동
//            }
//        });
//        holder.deletebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //어레이리스트에서 삭제후 새로고침
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Customviewholder extends RecyclerView.ViewHolder {
        TextView exercisename ;
        ImageView exerciseimage;
        ImageButton deletebutton;
        ImageButton changebutton;
        public Customviewholder(@NonNull View itemView) {
            super(itemView);
            exercisename = (TextView) itemView.findViewById(R.id.Tv_exercisename);
            exerciseimage = (ImageView) itemView.findViewById(R.id.Iv_exerciseimage);
            deletebutton = (ImageButton) itemView.findViewById(R.id.Ib_exercisedelete);
            changebutton = (ImageButton) itemView.findViewById(R.id.Ib_exercisechange);
        }
    }
}
