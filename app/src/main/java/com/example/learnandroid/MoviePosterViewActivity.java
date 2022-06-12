package com.example.learnandroid;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MoviePosterViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movieposterview);
        setTitle("그리드 뷰 영화 포스터");

        final GridView gc = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gridAdpter = new MyGridAdapter(this);
        gc.setAdapter(gridAdpter);
        }
}
