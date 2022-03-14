package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button webbutton = (Button)findViewById(R.id.webbutton);
        Button dialbutton = (Button)findViewById(R.id.dialbutton);
        Button gallerybutton = (Button)findViewById(R.id.gallerybutton);
        Button exitbutton = (Button)findViewById(R.id.exitbutton);


        webbutton.setBackgroundColor(Color.GRAY);
        webbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse(("http://www.naver.com")));
                startActivity(mintent);
            }
        });

        dialbutton.setBackgroundColor(Color.GREEN);
        dialbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse(("tel:/911")));
                startActivity((mintent));
            }
        });

        gallerybutton.setBackgroundColor(Color.RED);
        gallerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse(("content://media/internal/images/media")));
                startActivity(mintent);
            }
        });
        exitbutton.setBackgroundColor(Color.YELLOW);
        exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}