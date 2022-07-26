package com.example.whowillpay;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    static ArrayList<String> my_data=new ArrayList<>();
    static Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter<String>my_adapter=new ArrayAdapter<String>(this,R.layout.background_for_tv,R.id.tv_for_listView,my_data);
        ListView listView=findViewById(R.id.my_listView);

        listView.setAdapter(my_adapter);
        Button btn_add=findViewById(R.id.btn_add);
        EditText et_for_input=findViewById(R.id.et_input_for_name);
        Button btn_clear=findViewById(R.id.btn_clear);
        Button btn_go=findViewById(R.id.btn_go);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                my_data.clear();
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(et_for_input.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"There no name to add please fill it",Toast.LENGTH_SHORT).show();

                }
                else{
                    String input=et_for_input.getText().toString();
                    my_data.add(input);
                    et_for_input.setText("");
                    Toast.makeText(getApplicationContext(),input+" added to list ",Toast.LENGTH_SHORT).show();

                }
            }
        });
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(my_data.isEmpty()){
                    Toast.makeText(getApplicationContext(),"There is no element to chose\n Please add some element",Toast.LENGTH_SHORT).show();
                }
                else{
                    decide_for_payment();
                }
            }
        });
    }

    void decide_for_payment(){
        int size=my_data.size();

        int payer=random.nextInt(size);
        Intent intent=new Intent(this,ResultActivity.class);

        intent.putExtra("loser",my_data.get(payer));
        startActivity(intent);


    }
}



























