package com.example.learnandroid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalcTableRowActivity extends AppCompatActivity {
    // 익명 클래스 안에서 변수 사용시 오류 있어서 전역으로 뺌
    String num1, num2;
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
    TextView textResult;
    int i;
    Integer result;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {
            R.id.btnNum0, R.id.btnNum1,R.id.btnNum2,R.id.btnNum3,R.id.btnNum4
            ,R.id.btnNum5,R.id.btnNum6,R.id.btnNum7,R.id.btnNum8,R.id.btnNum9
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablelayout_calc);



        btnAdd = (Button) findViewById(R.id.btnAddCalc);
        btnSub = (Button)  findViewById(R.id.btnMinusCalc);
        btnMul = (Button) findViewById(R.id.btnMultipleCalc);
        btnDiv = (Button) findViewById(R.id.btnSplitCalc);
        btnRest = (Button) findViewById(R.id.btnRestCalc); // 나머지
        textResult = (TextView) findViewById(R.id.txtResult);

        edit1 = (EditText) findViewById(R.id.et_tl_number1);
        edit2 = (EditText) findViewById(R.id.et_tl_number2);
        String msg = "값을 입력해주세요";

        for(i=0; i < numBtnIDs.length; i++)
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);

        for(i=0; i < numBtnIDs.length; i++) {
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edit1.isFocused()) {
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        // 버튼 한개 한개 누를 때 마다 기존 값이 같이 가야 하는데 본 문장이 없으면 버튼 두자리 입력 안됨 기존껄 지워서
                      //  num1 = numButtons[index].getText().toString();
                        edit1.setText(num1);
                    } else if (edit2.isFocused()) {
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                    //    num2 = numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }else{
                        Toast.makeText(getApplicationContext(), "먼저 텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        // OnClick이벤트로 변경
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view){
                        if (!TextUtils.isEmpty(edit1.getText().toString()) && !TextUtils.isEmpty(edit2.getText().toString())  ){
                    // 나머지 조건은 그냥 안함
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }else Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (!TextUtils.isEmpty(edit1.getText().toString()) && !TextUtils.isEmpty(edit2.getText().toString())  ){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }else Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });

    }
}
