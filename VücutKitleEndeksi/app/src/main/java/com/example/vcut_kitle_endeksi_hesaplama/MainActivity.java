package com.example.vcut_kitle_endeksi_hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_height=findViewById(R.id.et_height_input);
        EditText et_weight=findViewById(R.id.et_weight_input);
        EditText et_age=findViewById(R.id.et_age);
        Button btn_hesapla=findViewById(R.id.btn_hesapla);
        Intent intent=new Intent(this,Result.class);

        btn_hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_height.getText().toString().isEmpty()||et_weight.getText().toString().isEmpty()||et_age.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Some places are empty!\n Please fill all of them!",Toast.LENGTH_LONG).show();



                }
                else{

                    double height=Double.parseDouble(et_height.getText().toString());
                    double h=(double)height/100;
                    int weight=Integer.parseInt(et_weight.getText().toString());
                    int age=Integer.parseInt(et_age.getText().toString());
                    double result= (double) weight/(h*h);
                    String res="h is = "+h+"\n weight is ="+weight+"\n result is = "+result+"\n";
                    Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
                    intent.putExtra("Result",result);
                    intent.putExtra("Age",age);
                    startActivity(intent);


                }
            }
        });

    }
}