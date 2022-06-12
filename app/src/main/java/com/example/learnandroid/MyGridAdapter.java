package com.example.learnandroid;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.learnandroid.R;

public  class MyGridAdapter extends BaseAdapter {
    Context context;

    public MyGridAdapter(Context c){
        context = c;
    }

    Integer[] posterId = {R.drawable.movie1, R.drawable.movie2, R.drawable.movie3, R.drawable.movie4};

    @Override
    public int getCount() {
        return posterId.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(200,300));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(5,5,5,5);
        imageView.setImageResource(posterId[position]);

        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                View dialogView = (View)View.inflate(context, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(context);
                ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                ivPoster.setImageResource(posterId[position]);
                dlg.setTitle("큰 포스터");
                // dlg.setIcon(R.drawable) // 아이콘 없어서 생략
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });
        return imageView;
    }
}