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


        Button subpagebutton = (Button)findViewById(R.id.subactivitybutton);
        Button btnClickCheckboxActivity = (Button)findViewById(R.id.btnCheckBoxActivity);
        Button btnAnimalActivity = (Button)findViewById(R.id.btnAnimalActivity);

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

    }

    // onClick으로 윈폼처럼 추가 하는 방식 (리스너로 계속 추가하니 오류 나서)
    public void calcbutton(View view) {
        Intent intent = new Intent(getApplicationContext(), CalcActivity.class);
        startActivity(intent);
    }

   /* public void btnClickCheckBox(View view) {
        Intent intent = new Intent(getApplicationContext(), CheckBoxActivity.class);
        startActivity(intent);
    }*/
}