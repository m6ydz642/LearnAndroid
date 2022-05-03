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
        Button btnAndroidActiviry = (Button)findViewById(R.id.btnAndroidActiviry);
        Button btnMakeLinearLayoutOnJavaCodeActivity = (Button)findViewById(R.id.btnMakeLinearLayoutOnJavaCodeActivity);
        Button btnTranning_4Activiry = (Button)findViewById(R.id.btnTranning4Activity);
        Button btnCalcTableLayout = (Button)findViewById(R.id.btnCalcTableLayoutActivity);

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