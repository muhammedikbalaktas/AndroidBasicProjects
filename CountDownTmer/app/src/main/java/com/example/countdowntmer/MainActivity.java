package com.example.countdowntmer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long time=15000;

        TextView textView=findViewById(R.id.tv_count);
        ProgressBar progressBar=findViewById(R.id.my_progresBar);

        progressBar.setMax(15000);


        CountDownTimer finished = new CountDownTimer(time, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished/1000<=50){
                    progressBar.getProgressDrawable().setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);

                }
                textView.setText("remaining second:\n" + millisUntilFinished / 1000);
                progressBar.setProgress((int)millisUntilFinished);
                
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "finished", Toast.LENGTH_LONG).show();
                progressBar.setProgress(0);
            }
        }.start();

    }
}