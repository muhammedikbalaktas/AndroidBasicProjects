package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static boolean turn_of_player_one=true;//player one goes for x
    static char [][] process=new char[3][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int [][]game_area={
                {R.id.tv_0_0,R.id.tv_0_1,R.id.tv_0_2},
                {R.id.tv_1_0,R.id.tv_1_1,R.id.tv_1_2},
                {R.id.tv_2_0,R.id.tv_2_1,R.id.tv_2_2}
        };


        TextView tv_0_0, tv_0_1,tv_0_2,tv_1_0,tv_1_1,tv_1_2,tv_2_0,tv_2_1,tv_2_2;
        tv_0_0=findViewById(game_area[0][0]);
        tv_0_1=findViewById(game_area[0][1]);
        tv_0_2=findViewById(game_area[0][2]);
        tv_1_0=findViewById(game_area[1][0]);
        tv_1_1=findViewById(game_area[1][1]);
        tv_1_2=findViewById(game_area[1][2]);
        tv_2_0=findViewById(game_area[2][0]);
        tv_2_1=findViewById(game_area[2][1]);
        tv_2_2=findViewById(game_area[2][2]);

        tv_0_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn_of_player_one){
                    tv_0_0.setText("X");
                    turn_of_player_one=false;
                    tv_0_0.setClickable(false);
                    process[0][0]='X';
                }
                else {
                    tv_0_0.setText("O");
                    turn_of_player_one=true;
                    tv_0_0.setClickable(false);
                    process[0][0]='O';
                }
            }
        });
        tv_0_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_0_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_1_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tv_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }




    void prepare_are(int [][]game_area){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                TextView tv=findViewById(game_area[i][j]);
                tv.setText("");

            }
        }

    }
    void check_for_winner(TextView result, char [][] process){


    }
}