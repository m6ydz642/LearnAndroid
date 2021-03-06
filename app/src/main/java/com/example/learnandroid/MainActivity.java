package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button subpagebutton = (Button)findViewById(R.id.subactivitybutton);
        Button btnClickCheckboxActivity = (Button)findViewById(R.id.btnCheckBoxActivity);
        Button btnAnimalActivity = (Button)findViewById(R.id.btnAnimalActivity);
        Button btnAndroidActiviry = (Button)findViewById(R.id.btnAndroidActiviry);
        Button btnMakeLinearLayoutOnJavaCodeActivity = (Button)findViewById(R.id.btnMakeLinearLayoutOnJavaCodeActivity);
        Button btnTranning_4Activiry = (Button)findViewById(R.id.btnTranning4Activity);
        Button btnCalcTableLayout = (Button)findViewById(R.id.btnCalcTableLayoutActivity);
        Button btnActivityClock = (Button)findViewById(R.id.btnClockActivity);
        Button btnFileWriteActivity = (Button)findViewById(R.id.btnFileWriteActivity);
        Button btnDiaryActivity = (Button)findViewById(R.id.btnDiaryActivity);
        Button btnListViewActivity = (Button)findViewById(R.id.btnListViewactivity);
        Button btnMoviePosterViewActivity = (Button)findViewById(R.id.btnMoviePosterViewActivity);
        Button btnbtnGallery = (Button)findViewById(R.id.btnGallery);
        Button btnSpinner = (Button)findViewById(R.id.btnSpinnerActivity);

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpinnerActivity.class);
                startActivity(intent);
            }
        });
        btnbtnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GalleryActivty.class);
                startActivity(intent);
            }
        });

        btnMoviePosterViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MoviePosterViewActivity.class);
                startActivity(intent);
            }
        });


        btnListViewActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabViewListViewActivity.class);
                startActivity(intent);
            }
        });

        btnDiaryActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DiaryActivity.class);
                startActivity(intent);
            }
        });

        btnFileWriteActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FileWriteActivity.class);
                startActivity(intent);
            }
        });

        btnCalcTableLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalcTableRowActivity.class);
                startActivity(intent);
            }
        });
        btnTranning_4Activiry.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tranning_4Activity.class);
                startActivity(intent);
            }
        });
        btnAndroidActiviry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AndroidVersionActivity.class);
                startActivity(intent);
            }
        });
        btnAnimalActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AnimalActivity.class);
                startActivity(intent);
            }
        });
        subpagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });

        btnClickCheckboxActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        btnMakeLinearLayoutOnJavaCodeActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MakeLinearLayoutOnJavaCodeActivity.class);
                startActivity(intent);
            }
        });

        btnActivityClock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClockActivity.class);
                startActivity(intent);
            }
        });

    }

    // onClick?????? ???????????? ?????? ?????? ?????? (???????????? ?????? ???????????? ?????? ??????)
    public void calcbutton(View view) {
        Intent intent = new Intent(getApplicationContext(), CalcActivity.class);
        startActivity(intent);
    }

   /* public void btnClickCheckBox(View view) {
        Intent intent = new Intent(getApplicationContext(), CheckBoxActivity.class);
        startActivity(intent);
    }*/
}