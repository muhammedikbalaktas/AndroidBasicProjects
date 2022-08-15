package com.example.spannablestring;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.BaseMovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.DrawableMarginSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpannableStringBuilder stringBuilder=new SpannableStringBuilder("This is some color for text");
        String data=stringBuilder.toString();
        int start=data.indexOf("color");
        int end=start+5;

        stringBuilder.setSpan(new BackgroundColorSpan(Color.GREEN),start,end,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        TextView tv_result1=findViewById(R.id.tv_result1);
        tv_result1.setText(stringBuilder);

        //????????????????????????????????????????????????????????????????????????????????????????????????

        SpannableStringBuilder stringBuilder2=new SpannableStringBuilder("This is for bullet span example");
        BulletSpan bulletSpan=new BulletSpan(40,Color.RED,20);


        stringBuilder2.setSpan(bulletSpan,0,stringBuilder2.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextView tv_result2=findViewById(R.id.tv_result2);

        tv_result2.setText(stringBuilder2);
        //?????????????????????????????????????????????????????????????????????????????????????????????????

        SpannableStringBuilder stringBuilder3=new SpannableStringBuilder("this is some blur for text");
        int st1=stringBuilder3.toString().indexOf("blur");
        MaskFilter blur=new BlurMaskFilter(15f, BlurMaskFilter.Blur.NORMAL);

        stringBuilder3.setSpan(new MaskFilterSpan(blur),st1,st1+4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView tv_result3=findViewById(R.id.tv_result3);
        tv_result3.setText(stringBuilder3);

        //?????????????????????????????????????????????????????????????????????????????????????????????????

        SpannableStringBuilder stringBuilder4=new SpannableStringBuilder("this is another color for text");
        String data1=stringBuilder4.toString();
        int start1=data1.indexOf("color");


        stringBuilder4.setSpan(new ForegroundColorSpan(Color.CYAN),start1,start1+5,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView tv_result4=findViewById(R.id.tv_result4);
        tv_result4.setText(stringBuilder4);


        //?????????????????????????????????????????????????????????????????????????????????????????????????

        SpannableStringBuilder stringBuilder5=new SpannableStringBuilder("this is for relative size");
        String res=stringBuilder5.toString();
        int st=res.indexOf("relative");

        stringBuilder5.setSpan(new RelativeSizeSpan(1.75f),st,st+8,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextView tv_result5=findViewById(R.id.tv_result5);

        tv_result5.setText(stringBuilder5);









    }

}