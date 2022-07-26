package com.example.clipboardcopypasteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_copy=findViewById(R.id.btn_copy);
        btn_copy.setOnClickListener(e->{
            EditText et_data=findViewById(R.id.et_editable_text);

            if(et_data.getText().toString().isEmpty()){
                Toast.makeText(this, "some places are empty", Toast.LENGTH_SHORT).show();
            }
            else{
                String data=et_data.getText().toString();
                copyData(data);
            }

        });
        Button btn_paste=findViewById(R.id.btn_paste);
        btn_paste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasteData();
            }
        });

    }
    public void copyData(String data){
        ClipboardManager clipboardManager= (ClipboardManager) getSystemService(MainActivity.CLIPBOARD_SERVICE);

        ClipData clipData =ClipData.newPlainText("text",data);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(getApplicationContext(), "data coppied", Toast.LENGTH_LONG).show();
    }
    public void pasteData(){

        ClipboardManager clipboardManager=(ClipboardManager) getSystemService(MainActivity.CLIPBOARD_SERVICE);
        ClipData clipData=clipboardManager.getPrimaryClip();

        String data=clipData.getItemAt(0).getText().toString();
        TextView tv_paste_data=findViewById(R.id.tv_show_data);
        tv_paste_data.setText(data);


    }
}