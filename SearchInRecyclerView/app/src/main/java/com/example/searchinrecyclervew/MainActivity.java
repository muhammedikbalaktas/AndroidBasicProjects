package com.example.searchinrecyclervew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PublicKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    final String [] dataSet ={"Audi A5","Bmw X6","Volvo XC90","Mercedes Benz Cla200","Toyota Supra","Nissan GTR",
    "Honda s200","Mazda rx7","Lamborghini urus","Ferrari","Porche taycan","Bugatti"};

    ArrayList<String> resultSet=new ArrayList<>();
    ArrayList<String> searchSet=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultSet.addAll(Arrays.asList(dataSet));

        EditText et_input = findViewById(R.id.et_input);
        initRecycler(resultSet);

        et_input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                    if(s.toString().isEmpty()){
                        searchSet.clear();
                        initRecycler(resultSet);
                    }
                    else{
                        check(s.toString());
                        initRecycler(searchSet);
                    }

            }
        });




    }
    public void initRecycler(ArrayList<String> data){
        MyAdapter myAdapter=new MyAdapter(data,this);
        RecyclerView my_Recycler=findViewById(R.id.my_Recycler);
        my_Recycler.setLayoutManager(new LinearLayoutManager(this));
        my_Recycler.setAdapter(myAdapter);
    }


    public  void check(String input){

        String lowerInput=input.toLowerCase(Locale.ROOT);

        for (int i=0;i<resultSet.size();i++){
            String compare=resultSet.get(i);
            String compareLower=resultSet.get(i).toLowerCase(Locale.ROOT);
            if(compareLower.contains(lowerInput)){
                if(!searchSet.contains(compare)){
                    searchSet.add(compare);

                }
            }


        }

        checkSearchSet(input);

    }
    public void checkSearchSet(String input){
        String lowerInput=input.toLowerCase(Locale.ROOT);
        for (int i=0;i<searchSet.size();i++){

            String compareLower=searchSet.get(i).toLowerCase(Locale.ROOT);
            if(!compareLower.contains(lowerInput)){
                searchSet.remove(i);
                i--;

            }
        }


    }




}