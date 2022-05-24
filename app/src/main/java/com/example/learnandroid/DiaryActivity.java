package com.example.learnandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

public class DiaryActivity extends AppCompatActivity {
    String fileName;
    Button btnWrite;
    EditText editDiary; // 익명함수 밖에서도 써야 해서 전역으로 선언

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        DatePicker dp;


        setTitle("간단 일기장");

        dp = (DatePicker) findViewById(R.id.dpPicker1);
        btnWrite = (Button) findViewById(R.id.btnDiaryWrite);
        editDiary = (EditText) findViewById(R.id.edDiary);

        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH);
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        dp.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                fileName = Integer.toString(year) + "_"
                        + Integer.toString(monthOfYear + 1 ) + "_"
                + Integer.toString(dayOfMonth) + ".txt";

                String str = readDiary(fileName);
                editDiary.setText(str);
                btnWrite.setEnabled(true);
            }
        });

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream outFs = openFileOutput(fileName, Context.MODE_PRIVATE);
                    String str = editDiary.getText().toString();
                    outFs.write(str.getBytes(StandardCharsets.UTF_8));
                    outFs.close();
                    Toast.makeText(getApplicationContext(),  fileName + "이 저장되었습니다", Toast.LENGTH_SHORT).show();

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),  "오류발생", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
    String readDiary(String fileName){
        String diaryStr = null;
        FileInputStream fs;
        try{
            fs = openFileInput(fileName);
            byte[] txt = new byte[500];
            fs.read(txt);
            fs.close();
            diaryStr = (new String(txt)).trim();
            btnWrite.setText("수정하기");
            Toast.makeText(getApplicationContext(), "file.txt가 생성됨", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            editDiary.setText("일기 없음");
            btnWrite.setText("새로 저장");
            Toast.makeText(getApplicationContext(), "파일없음 오류 발생", Toast.LENGTH_SHORT).show();

        }
        return diaryStr;
    }

}
