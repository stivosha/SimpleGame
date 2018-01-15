package com.example.stivosha.test_2_1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stivosha.test_2_1.Classes.Knowledge;
import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.Programming_languages.CSharp;
import com.example.stivosha.test_2_1.Programming_languages.Cpp;
import com.example.stivosha.test_2_1.Programming_languages.JS;
import com.example.stivosha.test_2_1.Programming_languages.Java;
import com.example.stivosha.test_2_1.Programming_languages.Python;
import com.example.stivosha.test_2_1.R;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final TextView txt_python = (TextView) findViewById(R.id.Python_lvl);
        final TextView txt_cpp = (TextView) findViewById(R.id.Cpp_lvl);
        final TextView txt_csharp = (TextView) findViewById(R.id.CSharp_lvl);
        final TextView txt_java = (TextView) findViewById(R.id.Java_lvl);
        final TextView txt_js = (TextView) findViewById(R.id.JS_lvl);
        final TextView txt_html = (TextView) findViewById(R.id.HTML_lvl);
        final TextView day = (TextView) findViewById(R.id.months);
        txt_python.setText(" "+String.valueOf(Knowledge.getKnowledge_of_Python())+"/100");
        txt_cpp.setText(" "+String.valueOf(Knowledge.getKnowledge_of_Cpp())+"/100");
        txt_csharp.setText(" "+String.valueOf(Knowledge.getKnowledge_of_CSharp())+"/100");
        txt_java.setText(" "+String.valueOf(Knowledge.getKnowledge_of_Java())+"/100");
        txt_js.setText(" "+String.valueOf(Knowledge.getKnowledge_of_JS())+"/100");
        txt_html.setText(" "+String.valueOf(Knowledge.getKnowledge_of_HTML())+"/100");
        TextView respect = (TextView) findViewById(R.id.respect);
        final TextView money = (TextView) findViewById(R.id.money);
        TextView iq = (TextView) findViewById(R.id.iq);
        day.setText("Дата(дни)\n"+String.valueOf(Person.getDay()));
        respect.setText("Уважение\n"+String.valueOf((int)Person.getRespect()));
        money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
        iq.setText("Интелект\n"+String.valueOf(Person.getIq()));
        Button back = (Button) findViewById(R.id.back);
        Button js = (Button) findViewById(R.id.JS);
        Button java = (Button) findViewById(R.id.Java);
        final Button cpp = (Button) findViewById(R.id.Cpp);
        Button html = (Button) findViewById(R.id.html);
        final Button python = (Button) findViewById(R.id.Python);
        Button csharp = (Button) findViewById(R.id.CSharp);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this, Main4Activity.class);
                startActivity(intent);

            }
        });
        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double money_for_study;
               if(Knowledge.getKnowledge_of_JS() < 30 ){
                    money_for_study = 2;
                }else if(Knowledge.getKnowledge_of_JS() < 70){
                   money_for_study = 5;
               }else{
                    money_for_study = 10;
               }
                if(Person.getMoney() >= money_for_study) {
                    if(Knowledge.getKnowledge_of_JS() < 100) {
                        Knowledge.setKnowledge_of_JS(Knowledge.getKnowledge_of_JS()+1*(Person.getIq()/100));
                        double okryg = Knowledge.getKnowledge_of_JS()*10;
                        okryg = Math.round(okryg);
                        Knowledge.setKnowledge_of_JS(okryg/10);
                        if(Knowledge.getKnowledge_of_JS() > 100) {
                            Knowledge.setKnowledge_of_JS(100);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    txt_js.setText(" "+String.valueOf(Knowledge.getKnowledge_of_JS())+"/100");
                    Person.setMoney(Person.getMoney() - money_for_study);
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                    Person.setDay(Person.getDay() + JS.getTime_to_study());
                    day.setText("Дата(месяц)\n"+String.valueOf(Person.getDay()));
                }
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double money_for_study;
                if(Knowledge.getKnowledge_of_Java() < 30 ){
                    money_for_study = 2;
                }else if(Knowledge.getKnowledge_of_Java() < 70){
                    money_for_study = 5;
                }else{
                    money_for_study = 10;
                }
                if(Person.getMoney() >= money_for_study) {
                    if(Knowledge.getKnowledge_of_Java() < 100) {
                        Knowledge.setKnowledge_of_Java(Knowledge.getKnowledge_of_Java()+1*(Person.getIq()/100));
                         double okryg = Knowledge.getKnowledge_of_Java()*10;
                         okryg = Math.round(okryg);
                         Knowledge.setKnowledge_of_Java(okryg/10);
                        if(Knowledge.getKnowledge_of_Java() > 100) {
                            Knowledge.setKnowledge_of_Java(100);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    txt_java.setText(" "+String.valueOf(Knowledge.getKnowledge_of_Java())+"/100");
                    Person.setMoney(Person.getMoney() - money_for_study);
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                    Person.setDay(Person.getDay() + Java.getTime_to_study());
                    day.setText("Дата(месяц)\n"+String.valueOf(Person.getDay()));
                }
            }
        });
        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double money_for_study;
                if(Knowledge.getKnowledge_of_Cpp() < 30 ){
                    money_for_study = 2;
                }else if(Knowledge.getKnowledge_of_Cpp() < 70){
                    money_for_study = 5;
                }else{
                    money_for_study = 10;
                }
                if(Person.getMoney() >= money_for_study) {
                    if(Knowledge.getKnowledge_of_Cpp() < 100) {
                        Knowledge.setKnowledge_of_Cpp(Knowledge.getKnowledge_of_Cpp()+1*(Person.getIq()/100));
                        double okryg = Knowledge.getKnowledge_of_Cpp()*10;
                        okryg = Math.round(okryg);
                        Knowledge.setKnowledge_of_Cpp(okryg/10);
                        if(Knowledge.getKnowledge_of_Cpp() > 100) {
                            Knowledge.setKnowledge_of_Cpp(100);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    txt_cpp.setText(" "+String.valueOf(Knowledge.getKnowledge_of_Cpp())+"/100");
                    Person.setMoney(Person.getMoney() - money_for_study);
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                    Person.setDay(Person.getDay() + Cpp.getTime_to_study());
                    day.setText("Дата(месяц)\n"+String.valueOf(Person.getDay()));
                }
            }
        });
        csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double money_for_study;
                if(Knowledge.getKnowledge_of_CSharp() < 30 ){
                    money_for_study = 2;
                }else if(Knowledge.getKnowledge_of_CSharp() < 70){
                    money_for_study = 5;
                }else{
                    money_for_study = 10;
                }
                if(Person.getMoney() >= money_for_study) {
                    if(Knowledge.getKnowledge_of_CSharp() < 100) {
                        Knowledge.setKnowledge_of_CSharp(Knowledge.getKnowledge_of_CSharp()+1*(Person.getIq()/100));
                        double okryg = Knowledge.getKnowledge_of_CSharp()*10;
                        okryg = Math.round(okryg);
                        Knowledge.setKnowledge_of_CSharp(okryg/10);
                        if(Knowledge.getKnowledge_of_JS() > 100) {
                            Knowledge.setKnowledge_of_JS(100);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    txt_csharp.setText(" "+String.valueOf(Knowledge.getKnowledge_of_CSharp())+"/100");
                    Person.setMoney(Person.getMoney() - money_for_study);
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                    Person.setDay(Person.getDay() + CSharp.getTime_to_study());
                    day.setText("Дата(день)\n"+String.valueOf(Person.getDay()));
                }
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double money_for_study;
                if(Knowledge.getKnowledge_of_Python() < 30 ){
                    money_for_study = 2;
                }else if(Knowledge.getKnowledge_of_Python() < 70){
                    money_for_study = 5;
                }else{
                    money_for_study = 10;
                }
                if(Person.getMoney() >= money_for_study) {
                    if(Knowledge.getKnowledge_of_Python() < 100) {
                        Knowledge.setKnowledge_of_Python(Knowledge.getKnowledge_of_Python()+1*(Person.getIq()/100));
                        double okryg = Knowledge.getKnowledge_of_Python()*10;
                        okryg = Math.round(okryg);
                        Knowledge.setKnowledge_of_Python(okryg/10);
                        if(Knowledge.getKnowledge_of_Python() > 100) {
                            Knowledge.setKnowledge_of_Python(100);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    txt_python.setText(" "+String.valueOf(Knowledge.getKnowledge_of_Python())+"/100");
                    Person.setMoney(Person.getMoney() - money_for_study);
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                    Person.setDay(Person.getDay() + Python.getTime_to_study());
                    day.setText("Дата(день)\n"+String.valueOf(Person.getDay()));
                }
            }
        });
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double money_for_study;
                if(Knowledge.getKnowledge_of_HTML() < 30 ){
                    money_for_study = 2;
                }else if(Knowledge.getKnowledge_of_HTML() < 70){
                    money_for_study = 5;
                }else{
                    money_for_study = 10;
                }
                if(Person.getMoney() >= money_for_study) {
                    if(Knowledge.getKnowledge_of_HTML() < 100) {
                        Knowledge.setKnowledge_of_HTML(Knowledge.getKnowledge_of_HTML()+1*(Person.getIq()/100));
                        double okryg = Knowledge.getKnowledge_of_HTML()*10;
                        okryg = Math.round(okryg);
                        Knowledge.setKnowledge_of_HTML(okryg/10);
                        if(Knowledge.getKnowledge_of_HTML() > 100) {
                            Knowledge.setKnowledge_of_HTML(100);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    txt_html.setText(" "+String.valueOf(Knowledge.getKnowledge_of_HTML())+"/100");
                    Person.setMoney(Person.getMoney() - money_for_study);
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                    Person.setDay(Person.getDay() + 1);
                    day.setText("Дата(день)\n"+String.valueOf(Person.getDay()));

                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Main5Activity.this, Main4Activity.class);
        startActivity(intent);
    }
}
