package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView1;
    ScrollView scrollView2;
    ImageView imageView1;
    ImageView imageView2;
    BitmapDrawable bitmap;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView1 = (ScrollView) findViewById(R.id.scrollView1);
        scrollView2 = (ScrollView) findViewById(R.id.scrollView2); // 수평 스크롤 뷰 사용

        scrollView2.setHorizontalScrollBarEnabled(true);






    }

    public void onUp(View view) {
        scrollView1 = (ScrollView) findViewById(R.id.scrollView1);
        scrollView1.setHorizontalScrollBarEnabled(true);

        imageView1 = (ImageView) findViewById(R.id.image01);
        imageView2 = (ImageView) findViewById(R.id.image02);



        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.a1231);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView1.setImageDrawable(bitmap);
        imageView1.getLayoutParams().width = bitmapWidth;
        imageView1.getLayoutParams().height = bitmapHeight;

        imageView2.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.VISIBLE);
    }


    public void onButtom(View view){
        scrollView2 = (ScrollView) findViewById(R.id.scrollView2);
        scrollView2.setHorizontalScrollBarEnabled(true);

        imageView1 = (ImageView) findViewById(R.id.image01);
        imageView2 = (ImageView) findViewById(R.id.image02);



        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.a1231);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmapWidth;
        imageView2.getLayoutParams().height = bitmapHeight;

        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);

    }
}