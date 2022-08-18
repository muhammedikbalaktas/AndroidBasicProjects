package com.example.sqlitetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_add=findViewById(R.id.btn_add);

        Button btn_get=findViewById(R.id.btn_get);

        EditText et_add=findViewById(R.id.et_add);

        TextView tv_result=findViewById(R.id.tv_result);

        DataBaseHelper dataBaseHelper=new DataBaseHelper(this);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=et_add.getText().toString();
                if(input.isEmpty()){
                    Toast.makeText(getApplicationContext(), "some places are empty", Toast.LENGTH_LONG).show();
                }
                else {
                    dataBaseHelper.insertStudent(input);
                    Toast.makeText(getApplicationContext(), "item added", Toast.LENGTH_LONG).show();
                    et_add.setText("");
                }
            }
        });


        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList <String> input=new ArrayList<>();
                input=dataBaseHelper.getAllStudents();
                StringBuilder stringBuilder=new StringBuilder();
                int index=1;
                for(String i:input){
                    stringBuilder.append(index).append("-) ").append(i).append("\n");
                    index++;

                }
                tv_result.setText(stringBuilder.toString());
            }
        });
    }
}