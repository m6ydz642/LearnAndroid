package com.example.learnandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        setTitle("리스트 뷰 테스트");

        final String[] mid = {"히어로즈", "24시", "로스트", "브이", "슈퍼내추럴"};

        ListView list = (ListView)findViewById(R.id.listView1);
        ListView list2 = (ListView)findViewById(R.id.listView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mid);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice,mid);

        list2.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list2.setAdapter(adapter2);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), mid[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
