package com.example.fileio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        

        FileIOManager fileIOManager=new FileIOManager();

        EditText et_input=findViewById(R.id.et_inputForFile);

        Button btn_read=findViewById(R.id.btn_read);

        Button btn_write=findViewById(R.id.btn_write);


        btn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "some places are empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    String input=et_input.getText().toString();
                    fileIOManager.writeToFile(getApplicationContext(),input);
                    et_input.setText("");
                    Toast.makeText(getApplicationContext(),"Data added succesfully",Toast.LENGTH_LONG).show();
                }
            }
        });

        TextView tv_output=findViewById(R.id.tv_output);

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_output.setText(fileIOManager.readFromFile(getApplicationContext()));
            }
        });







    }

}