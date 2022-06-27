package com.example.learnandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Gallery_and_spinnerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_and_spinner);
        setTitle("갤러리 영화 포스터");
        Gallery gallery = (Gallery)findViewById(R.id.gallery1);
        MyGalleryAdapater gallyadapter = new MyGalleryAdapater(this);
        gallery.setAdapter(gallyadapter);
    }


    // 중첩클래스
    public class MyGalleryAdapater extends BaseAdapter {

        Context context;
        Integer[] posterId = {R.drawable.movie1,R.drawable.movie2,R.drawable.movie3,R.drawable.movie4 };
        public MyGalleryAdapater(Context context){
            this.context = context;
        }

        @Override
        public int getCount() {
            return posterId.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new Gallery.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5,5,5,5);
            imageview.setImageResource(posterId[i]);

            // final int pos = i;

            imageview.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    ImageView ivPoster = (ImageView)findViewById(R.id.ivPoster2);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterId[i]);
                    return false;
                }
            });
            return imageview;
        }
    }
}
