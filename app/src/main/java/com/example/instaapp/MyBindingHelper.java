package com.example.instaapp;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class MyBindingHelper {
    @BindingAdapter({"imgRes"})
    public static void imgLoad(ImageView imageView, int resId) {
        imageView.setImageResource(resId);
    }
}
