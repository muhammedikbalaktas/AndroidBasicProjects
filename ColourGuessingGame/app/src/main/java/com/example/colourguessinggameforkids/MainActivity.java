package com.example.colourguessinggameforkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    static Random random=new Random();
    public static final String []random_colour={"Siyah","Sarı","Kırmızı","Mavi","Yeşil","Turuncu"};
    public static String answer;
    static int dogru=0;
    static int yanlış=0;
    static String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn_1=findViewById(R.id.btn_answer1);
        Button btn_2=findViewById(R.id.btn_answer2);
        Button btn_3=findViewById(R.id.btn_answer3);
        TextView tv_result=findViewById(R.id.tv_result);
        result="Dogru: "+dogru+"\nYanlış: "+yanlış;
        tv_result.setText(result);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_1.getText().toString().equals(answer)){
                    dogru++;
                    result="Dogru: "+dogru+"\nYanlış: "+yanlış;
                    tv_result.setText(result);

                    start_game();
                }
                else{


                    yanlış++;
                    result="Dogru: "+dogru+"\nYanlış: "+yanlış;
                    tv_result.setText(result);
                }


            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_2.getText().toString().equals(answer)){
                    dogru++;
                    result="Dogru: "+dogru+"\nYanlış: "+yanlış;
                    tv_result.setText(result);
                    start_game();

                }
                else{

                    yanlış++;
                    result="Dogru: "+dogru+"\nYanlış: "+yanlış;
                    tv_result.setText(result);
                }


            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_3.getText().toString().equals(answer)){
                    dogru++;
                    result="Dogru: "+dogru+"\nYanlış: "+yanlış;
                    tv_result.setText(result);
                    start_game();

                }
                else{

                    yanlış++;
                    result="Dogru: "+dogru+"\nYanlış: "+yanlış;
                    tv_result.setText(result);
                }

            }
        });
        start_game();

    }
    void start_game(){
        TextView tv_set_colour=findViewById(R.id.tv_set_colour);
        int color=random.nextInt(6);
        if(color==0){
            tv_set_colour.setBackgroundColor(getResources().getColor(R.color.black));
            answer="Siyah";
        }
        else if(color==1){
            tv_set_colour.setBackgroundColor(getResources().getColor(R.color.yellow));
            answer="Sarı";
        }
        else if(color==2){
            tv_set_colour.setBackgroundColor(getResources().getColor(R.color.red));
            answer="Kırmızı";
        }
        else if(color==3){
            tv_set_colour.setBackgroundColor(getResources().getColor(R.color.blue));
            answer="Mavi";
        }
        else if(color==4){
            tv_set_colour.setBackgroundColor(getResources().getColor(R.color.green));
            answer="Yeşil";
        }
        else {
            tv_set_colour.setBackgroundColor(getResources().getColor(R.color.orange));
            answer="Turuncu";
        }
        arrange_buttons(color);


    }

    void arrange_buttons(int color){
        Button btn_1, btn_2, btn_3;
        btn_1=findViewById(R.id.btn_answer1);
        btn_2=findViewById(R.id.btn_answer2);
        btn_3=findViewById(R.id.btn_answer3);


        int ans1,ans2,ans3;

        do {
            ans1=random.nextInt(6);
        }while (ans1==color);

        do {
            ans2=random.nextInt(6);
        }while (ans2==color || ans2==ans1);
        do {
            ans3=random.nextInt(6);
        }while (ans3==color || ans3==ans1|| ans3==ans2);
        btn_1.setText(random_colour[ans1]);
        btn_2.setText(random_colour[ans2]);
        btn_3.setText(random_colour[ans3]);
        int index=random.nextInt(3);
        Button []buttons={btn_1,btn_2,btn_3};

        buttons[index].setText(random_colour[color]);



    }
}