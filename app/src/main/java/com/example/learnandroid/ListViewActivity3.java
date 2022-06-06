package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.androidquery.AQuery;

import java.sql.Array;
import java.util.ArrayList;

public class ListViewActivity3 extends Fragment {

    private AQuery aQuery = null;
    ListView listView3 = null;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_listview3, container, false);
        aQuery = new AQuery(view);

        listView3 = aQuery.id(R.id.listView3).getListView();

        final String[] mid = {"히어로즈_동적", "24시_동적", "로스트_동적", "브이_동적", "슈퍼내추럴_동적"}; // 안씀
        final ArrayList<String> midList = new ArrayList<String>();

        midList.add("히어로즈_동적");
        midList.add("24시_동적");
        midList.add("로스트_동적");
        midList.add("브이_동적");
        midList.add("슈퍼내추럴_동적");
/*        listView3.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1, midList));

                 이방법도 되고
*/

        // 이 방법도 됨
        ArrayAdapter<String> adpater = new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1, midList);
        listView3.setAdapter(adpater);
        listView3.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        Button btnAdd = (Button)aQuery.id(R.id.btnAddListView).getView();
        EditText editText  = (EditText)aQuery.id(R.id.editItem).getView();
btnAdd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        midList.add(editText.getText().toString());
        // listView3.deferNotifyDataSetChanged();
        adpater.notifyDataSetChanged();
    }
});

listView3.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // 꾹 누르면
    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        midList.remove(i);
        adpater.notifyDataSetChanged();
        return false;
    }
});
        return view;
    }
}

