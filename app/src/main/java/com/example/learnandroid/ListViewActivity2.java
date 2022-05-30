package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.androidquery.AQuery;

public class ListViewActivity2 extends Fragment {

    private AQuery aQuery = null;
    ListView listView2 = null;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_listview2, container, false);
        aQuery = new AQuery(view);

        listView2 = aQuery.id(R.id.listView2).getListView();

        final String[] mid = {"히어로즈2", "24시2", "로스트2", "브이2", "슈퍼내추럴2"};

        listView2.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_checked, mid));

        listView2.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        return view;
    }
}

