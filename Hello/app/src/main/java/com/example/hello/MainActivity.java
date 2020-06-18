package com.example.hello;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101; // 다른 액티비티를 띄우기 위한 요청코드 정의


    @Override // 재정의 메소드 코드 번호 식별
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_MENU){
            Toast.makeText(getApplicationContext(),"onActivityReslut 메소드 호출됨 요청코드 "+requestCode+" , " +
                    "결과코드 : "+resultCode,Toast.LENGTH_LONG).show();
            if(resultCode == RESULT_OK){
                String name = data.getExtras().getString("name"); //  키의 값 가져오기
                Toast.makeText(getApplicationContext(),"응답으로 전달된 name : "+ name,Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class); // 메뉴 액티비티 띄우기
                startActivityForResult(intent,REQUEST_CODE_MENU); // 액티비티 시작과 요청코드 넣기기 가져와야할 값이있으면 ForResult

           }
        });



    }


}