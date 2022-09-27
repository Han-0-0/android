package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyExerciseListAdaper extends RecyclerView.Adapter<MyExerciseListAdaper.ViewHolder>{

    private ArrayList<String> mdata = null;


    public MyExerciseListAdaper(ArrayList<String> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyExerciseListAdaper.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyExerciseListAdaper.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
