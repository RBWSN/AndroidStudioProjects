package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onBackButtonClicked(View view) {

        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌렀다", Toast.LENGTH_LONG).show();
        finish();

    }
}