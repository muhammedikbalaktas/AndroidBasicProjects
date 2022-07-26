package com.example.vcut_kitle_endeksi_hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        DecimalFormat dc=new DecimalFormat("0.000");
        Intent intent=getIntent();
        int age=intent.getIntExtra("Age",19);

        double result=intent.getDoubleExtra("Result",24);


        TextView textView=findViewById(R.id.tv_int_result);
        textView.setText("VKİ:"+dc.format(result));
        TextView tv_result=findViewById(R.id.tv_result);
        if (age>=19&&age <=23){
            if(result>0&&result<=18.4){
                String res="Sonucunuz:Zayıf. Ağırlığınız boyunuza oranla yetersiz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);
            }
            else if(result>18.4&&result<=24.9){
                String res="Sonucunuz:Normal. Sağlıklı beslenmeye devam edin :)";
                tv_result.setText(res);

            }
            else if(result>24.9&&result<=30){
                String res="Sonucunuz:Fazla kilolu. Boyunuza göre kilonuz fazla. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>30&&result<=35){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre birinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>35&&result<=45){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre ikinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>45&&result<=105){
                String res="Sonucunuz:Aşırı Şişman. Sonuçlarınıza göre üçüncü derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
        }
        else if(age>=25&&age<=34){
            if(result>0&&result<=20){
                String res="Sonucunuz:Zayıf. Ağırlığınız boyunuza oranla yetersiz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);
            }
            else if(result>20&&result<=25){
                String res="Sonucunuz:Normal. Sağlıklı beslenmeye devam edin :)";
                tv_result.setText(res);

            }
            else if(result>25&&result<=30){
                String res="Sonucunuz:Fazla kilolu. Boyunuza göre kilonuz fazla. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>30&&result<=35){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre birinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>35&&result<=45){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre ikinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>45&&result<=105){
                String res="Sonucunuz:Aşırı Şişman. Sonuçlarınıza göre üçüncü derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }

        }
        else if(age>=35&&age<=44){
            if(result>0&&result<=21){
                String res="Sonucunuz:Zayıf. Ağırlığınız boyunuza oranla yetersiz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);
            }
            else if(result>21&&result<=26){
                String res="Sonucunuz:Normal. Sağlıklı beslenmeye devam edin :)";
                tv_result.setText(res);

            }
            else if(result>26&&result<=31){
                String res="Sonucunuz:Fazla kilolu. Boyunuza göre kilonuz fazla. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>31&&result<=36){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre birinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>36&&result<=46){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre ikinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>46&&result<=105){
                String res="Sonucunuz:Aşırı Şişman. Sonuçlarınıza göre üçüncü derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }

        }
        else if(age>=45&&age<=54){
            if(result>0&&result<=22){
                String res="Sonucunuz:Zayıf. Ağırlığınız boyunuza oranla yetersiz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);
            }
            else if(result>22&&result<=27){
                String res="Sonucunuz:Normal. Sağlıklı beslenmeye devam edin :)";
                tv_result.setText(res);

            }
            else if(result>27&&result<=32){
                String res="Sonucunuz:Fazla kilolu. Boyunuza göre kilonuz fazla. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>32&&result<=37){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre birinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>37&&result<=47){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre ikinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>47&&result<=105){
                String res="Sonucunuz:Aşırı Şişman. Sonuçlarınıza göre üçüncü derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }

        }
        else if(age>=55&&age<=64){
            if(result>0&&result<=23){
                String res="Sonucunuz:Zayıf. Ağırlığınız boyunuza oranla yetersiz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);
            }
            else if(result>23&&result<=28){
                String res="Sonucunuz:Normal. Sağlıklı beslenmeye devam edin :)";
                tv_result.setText(res);

            }
            else if(result>28&&result<=33){
                String res="Sonucunuz:Fazla kilolu. Boyunuza göre kilonuz fazla. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>33&&result<=38){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre birinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>43&&result<=53){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre ikinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>53&&result<=105){
                String res="Sonucunuz:Aşırı Şişman. Sonuçlarınıza göre üçüncü derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }

        }
        else if(age>=65&&age<=120){
            if(result>0&&result<=24){
                String res="Sonucunuz:Zayıf. Ağırlığınız boyunuza oranla yetersiz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);
            }
            else if(result>24&&result<=29){
                String res="Sonucunuz:Normal. Sağlıklı beslenmeye devam edin :)";
                tv_result.setText(res);

            }
            else if(result>29&&result<=34){
                String res="Sonucunuz:Fazla kilolu. Boyunuza göre kilonuz fazla. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>34&&result<=39){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre birinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>39&&result<=49){
                String res="Sonucunuz:Şişman. Sonuçlarınıza göre ikinci derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }
            else if(result>49&&result<=105){
                String res="Sonucunuz:Aşırı Şişman. Sonuçlarınıza göre üçüncü derecenden obezsizniz. Lütfen bir diyetisyenden yardım alınız.";
                tv_result.setText(res);

            }

        }

        

    }
}