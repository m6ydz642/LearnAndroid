package com.example.learnandroid;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SpinnerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        setTitle("스피너");
        final String[] movie = {"쿵푸팬더", "짱구는 못말려" , "아저씨"};
        Integer[] posterId = {R.drawable.movie1,R.drawable.movie2,R.drawable.movie3,R.drawable.movie4 };

        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        ImageView imgview = (ImageView)findViewById(R.id.ivPoster3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, movie);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               //     imgview.setLayoutParams(new android.widget.Gallery.LayoutParams(200, 300));
                    imgview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imgview.setPadding(5,5,5,5);
                    imgview.setImageResource(posterId[i]);
                    imgview.setVisibility(View.VISIBLE);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


    }
}
