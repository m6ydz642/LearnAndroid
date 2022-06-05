package com.example.learnandroid;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class TabViewListViewActivity extends AppCompatActivity {
    Fragment frg;
    Fragment frg2;
    Fragment frg3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listtab);
        frg = new ListViewActivity();
        frg2 = new ListViewActivity2();
        frg3 = new ListViewActivity3();

        getSupportFragmentManager().beginTransaction().add(R.id.frame, frg).commit(); // 초기화면 지정

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();

                Fragment selected = null;
                if(position == 0){
                    selected = frg;
                }     else if(position == 1){
                    selected = frg2;
                } else if(position == 2){
                    selected = frg3;
                }
                if(selected != null)
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

/*public class TabViewListViewActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_listview, container, false);

        return view;
    }
}*/
