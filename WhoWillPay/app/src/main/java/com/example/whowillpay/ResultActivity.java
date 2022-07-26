package com.example.whowillpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();

        TextView tv_result=findViewById(R.id.tv_result);

        String loser=intent.getStringExtra("loser");

        tv_result.setText(loser);

    }
}