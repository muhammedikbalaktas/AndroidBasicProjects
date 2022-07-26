package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random=new Random();
        int my_num= random.nextInt(100);
        Button btn_guess=findViewById(R.id.btn_guess);
        EditText et_input=findViewById(R.id.input_guess);
        TextView tv_result=findViewById(R.id.tv_result);

        btn_guess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_input.getText().toString().equals("")){
                    tv_result.setText("First Enter a Number");
                }
                else {
                    int input=Integer.parseInt(et_input.getText().toString());
                    if(input>my_num){
                        tv_result.setText("Wrong guess You should make smaller guess");

                    }
                    else if(input<my_num){
                        tv_result.setText("Wrong guess You should make bigger guess");

                    }
                    else{
                        tv_result.setText("Congrats! You guessed correctly");
                    }
                }
            }
        });

    }
}