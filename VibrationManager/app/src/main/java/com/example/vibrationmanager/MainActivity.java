package com.example.vibrationmanager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);

        Button btn_1=findViewById(R.id.btn_1);

        Button btn_2 =findViewById(R.id.btn_2);

        Button btn_3=findViewById(R.id.btn_3);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View v) {
                VibrationEffect vibrationEffect=VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK);

                vibrator.vibrate(vibrationEffect);


            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VibrationEffect vibrationEffect=VibrationEffect.createOneShot(500,1);
                vibrator.vibrate(vibrationEffect);

            }
        });

        //there is a specific data set for creating custom vibration effect. For that there is something to know.
        //first element of data set is the delay of vibration. Since it is 0 there will not be any delay. But you can define any in terms of millis
        //the second thing is the number after delay info is vibration duration and the next is waiting duration.
        //you can set amptitude values of vibration but you should define one more array
        long []dataSet={0,200,1,200,1,200,1};

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VibrationEffect vibrationEffect=VibrationEffect.createWaveform(dataSet,-1);

                vibrator.vibrate(vibrationEffect);

            }
        });

    }
}