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
    String num1, num2;
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
    TextView textResult;

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


        int i;
        btnAdd = (Button) findViewById(R.id.btnAddCalc);
        btnSub = (Button)  findViewById(R.id.btnMinusCalc);
        btnMul = (Button) findViewById(R.id.btnMultipleCalc);
        btnDiv = (Button) findViewById(R.id.btnSplitCalc);
        btnRest = (Button) findViewById(R.id.btnRestCalc); // 나머지
        textResult = (TextView) findViewById(R.id.txtResult);

        edit1 = (EditText) findViewById(R.id.et_tl_number1);
        edit2 = (EditText) findViewById(R.id.et_tl_number2);
        String msg = "값을 입력해주세요";

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
