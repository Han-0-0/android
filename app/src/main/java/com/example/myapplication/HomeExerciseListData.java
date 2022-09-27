package com.example.myapplication;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeExerciseListData {
    String exercisename;
    int exerciseimage;
    int deletebutton;
    int changebutton;

    public HomeExerciseListData(String exercisename, int exerciseimage) {
        this.exercisename = exercisename;
        this.exerciseimage = exerciseimage;
        this.deletebutton = com.google.android.material.R.drawable.btn_checkbox_checked_to_unchecked_mtrl_animation;
        this.changebutton = com.google.android.material.R.drawable.btn_checkbox_checked_to_unchecked_mtrl_animation;
    }
}
