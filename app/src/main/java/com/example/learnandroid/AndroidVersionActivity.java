package com.example.learnandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AndroidVersionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidversion);

        TextView text1, text2;
        Switch chkAgree;
        RadioGroup rdoGroup;
        RadioButton rdbVersion_O, rdbVersion_R, rdbVersion_S;
        Button btnExit;
        Button btnHome;
        ImageView imgAndroid;

        setTitle("좋아하는 안드로이드 버전 선택");

        chkAgree = (Switch) findViewById(R.id.schAgree);

        rdoGroup = (RadioGroup) findViewById(R.id.rdoAndroidGroup);
        rdbVersion_O = (RadioButton) findViewById(R.id.rdbVersion_O);
        rdbVersion_R = (RadioButton) findViewById(R.id.rdbVersion_R);
        rdbVersion_S = (RadioButton) findViewById(R.id.rdbVersion_S);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnHome = (Button) findViewById(R.id.btnHome);
        imgAndroid = (ImageView) findViewById(R.id.imgAndroid);
        if (chkAgree != null) {
            chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (chkAgree.isChecked()) {
                        rdoGroup.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
        if (rdoGroup != null) {
            rdoGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (rdoGroup.getCheckedRadioButtonId()) {
                        case R.id.rdbVersion_O:
                            imgAndroid.setImageResource(R.drawable.androidversion_o);
                            break;
                        case R.id.rdbVersion_R:
                            imgAndroid.setImageResource(R.drawable.androidversion_r);
                            break;
                        case R.id.rdbVersion_S:
                            imgAndroid.setImageResource(R.drawable.androidversion_s);
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "버전을 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        Button.OnClickListener clickListener;
        clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnHome:
                        finish();//인텐트 종료
                        overridePendingTransition(0, 0); //인텐트 효과 없애기
                        Intent intent = getIntent();
                        startActivity(intent); // 액티비티 열기
                        break;
                    case R.id.btnExit:
                        moveTaskToBack(true); // 태스크를 백그라운드로 이동
                        finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기
                        System.exit(0);
                }
            }

        };
    }
}
