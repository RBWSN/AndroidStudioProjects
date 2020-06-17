package com.example.hello;

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
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        text = (EditText) findViewById(R.id.textee); // 에디트 텍스트 연결

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //에디터 텍스트가 변경되었을때 작동하는 리스너

                int edittext = text.getText().length();
                String to = Integer.toString(edittext);

                TextView textView;
                textView = findViewById(R.id.textv);
                textView.setText(to+"  /  80");



            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });




    }

   public void onSend(View view){
       text = (EditText)findViewById(R.id.textee);
        String messageall = text.getText().toString();

        Toast.makeText(this.getApplicationContext(),messageall ,Toast.LENGTH_LONG).show();

   }

}