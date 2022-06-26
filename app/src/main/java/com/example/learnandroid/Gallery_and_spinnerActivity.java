package com.example.learnandroid;

import android.os.Bundle;
import android.widget.Gallery;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Gallery_and_spinnerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_and_spinner);
        setTitle("갤러리 영화 포스터");
        Gallery gallery = (Gallery)findViewById(R.id.gallery1);
        MyGalleryAdapater gallyadapter = new MyGalleryAdapater(this);
        // gallyadapter.setAdapter
    }
}
