package com.example.learnandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileWriteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filewrite);

        Button btnRead, btnWrite;
        btnWrite = (Button)findViewById(R.id.btnFileWrite);
        btnRead = (Button)findViewById(R.id.btnFileRead);

        btnWrite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream fs = openFileOutput("file.txt", Context.MODE_PRIVATE);
                    String str = "쿡북 안드로이드";
                    fs.write(str.getBytes(StandardCharsets.UTF_8));
                    fs.close();
                    Toast.makeText(getApplicationContext(), "file.txt가 생성됨", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "파일 없음", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {

                    FileInputStream fs = openFileInput("file.txt");
                    byte[] betxt = new byte[30];
                    fs.read(betxt);
                    String str = new String(betxt);
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "파일 없음", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
