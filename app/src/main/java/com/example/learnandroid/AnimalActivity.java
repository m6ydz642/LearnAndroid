package com.example.learnandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        TextView text1, text2;
        CheckBox chkAgree;
        RadioGroup rdoGroup;
        RadioButton rdbDog, rdbCat, rdbRabbit;
        Button btnOk;
        ImageView imgPet;

        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox)findViewById(R.id.chkAgree) ;
        text2 = (TextView) findViewById(R.id.Text2);

        rdoGroup = (RadioGroup) findViewById(R.id.rdoGroup1);
        rdbDog = (RadioButton) findViewById(R.id.rdbDog);
        rdbCat = (RadioButton) findViewById(R.id.rdbCat);
        rdbRabbit = (RadioButton) findViewById(R.id.rdbRabbit);

        btnOk = (Button)findViewById(R.id.btnOk);
        imgPet = (ImageView) findViewById(R.id.imgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rdoGroup.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rdoGroup.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch (rdoGroup.getCheckedRadioButtonId()){
                    case R.id.rdbDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdbCat:
                        imgPet.setImageResource(R.drawable.cat);
                    case R.id.rdbRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                    default:
                        Toast.makeText(getApplicationContext(), "동물을 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
