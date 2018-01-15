package com.example.stivosha.test_2_1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stivosha.test_2_1.Classes.Freelance_situation;
import com.example.stivosha.test_2_1.Classes.Knowledge;
import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.Classes.all_for_freelance;
import com.example.stivosha.test_2_1.Programming_languages.CSharp;
import com.example.stivosha.test_2_1.Programming_languages.Cpp;
import com.example.stivosha.test_2_1.Programming_languages.JS;
import com.example.stivosha.test_2_1.Programming_languages.Java;
import com.example.stivosha.test_2_1.Programming_languages.Python;
import com.example.stivosha.test_2_1.R;

import java.util.Random;

public class Main7Activity extends AppCompatActivity {
    private boolean turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        final TextView respect = (TextView) findViewById(R.id.respect);
        final TextView money = (TextView) findViewById(R.id.money);
        TextView iq = (TextView) findViewById(R.id.iq);
        final TextView day = (TextView) findViewById(R.id.months);
        day.setText("Дата(дни)\n"+String.valueOf(Person.getDay()));
        respect.setText("Уважение\n"+String.valueOf((int)Person.getRespect()));
        money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
        iq.setText("Интелект\n"+String.valueOf(Person.getIq()));
        final TextView result_text = (TextView) findViewById(R.id.result_text);
        final boolean[] sw_java = new boolean[1];
        sw_java[0] = false;
        final boolean[] sw_js = new boolean[1];
        sw_js[0] = false;
        final boolean[] sw_python = new boolean[1];
        sw_python[0] = false;
        final boolean[] sw_cpp = new boolean[1];
        sw_cpp[0] = false;
        final boolean[] sw_csharp = new boolean[1];
        sw_csharp[0] = false;
        final boolean[] sw_html = new boolean[1];
        sw_html[0] = false;
        final int[] n = {0};
        Button back = (Button) findViewById(R.id.back);
        final TextView main = (TextView)findViewById(R.id.Main_text);
        final Random random = new Random();
        final String type = all_for_freelance.return_type(random.nextInt(5));
        final int day_1 = (random.nextInt(7)+1);
        final double money_pr = pred_money(type);
        main.setText(situation(type,day_1,money_pr));
        Button skip = (Button) findViewById(R.id.skip);
        Button to_do = (Button) findViewById(R.id.to_do);
        final Switch java_sw = (Switch) findViewById(R.id.java_switch);
        final Switch js_sw = (Switch) findViewById(R.id.js_switch);
        final Switch cpp_sw = (Switch) findViewById(R.id.cpp_switch);
        final Switch csharp_sw = (Switch) findViewById(R.id.csharp_switch);
        final Switch python_sw = (Switch) findViewById(R.id.python_switch);
        final Switch html_sw = (Switch) findViewById(R.id.html_switch);
        final double[] results = {0,0,0,0,0,0};
        final String[] lang_res = {"","","","","",""};
        turn = true;
        java_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    sw_java[0] = b;

            }
        });
        js_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                sw_js[0] = b;
            }
        });
        python_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                sw_python[0] = b;
            }
        });
        html_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                sw_html[0] = b;
            }
        });
        cpp_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                sw_cpp[0] = b;
            }
        });
        csharp_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                sw_csharp[0] = b;
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main7Activity.this, Main2Activity.class);
                startActivity(intent);

            }
        });
        to_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn){
                if (sw_java[0]==true){
                    lang_res[n[0]] = "java";
                    results[n[0]] = Java.return_result(type);
                    n[0] +=1;
                    if (Knowledge.getKnowledge_of_Java() < 10){

                        Toast.makeText(getApplicationContext(),"Ваш уровень знания java меньше 10",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if (sw_cpp[0]==true)
                    {
                        results[n[0]] = Cpp.return_result(type);lang_res[n[0]] = "C++";
                        n[0] +=1;
                    if (Knowledge.getKnowledge_of_Cpp() < 10){
                        Toast.makeText(getApplicationContext(),"Ваш уровень знания C++ меньше 10",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if (sw_html[0]==true){
                        results[n[0]] = 0;lang_res[n[0]] = "HTML";
                        n[0]+=1;
                    if (Knowledge.getKnowledge_of_HTML() < 10){
                        Toast.makeText(getApplicationContext(),"Ваш уровень знания HTML меньше 10",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if (sw_csharp[0]==true){
                    results[n[0]] = CSharp.return_result(type);lang_res[n[0]] = "C#";
                    n[0]+=1;
                  if (Knowledge.getKnowledge_of_CSharp() < 10){
                    Toast.makeText(getApplicationContext(),"Ваш уровень знания C# меньше 10",Toast.LENGTH_SHORT).show();
                    return;
                  }
                }
                if (sw_js[0]==true){
                    results[n[0]] = JS.return_result(type);lang_res[n[0]] = "JS";
                    n[0]+=1;
                    if (Knowledge.getKnowledge_of_JS() < 10){
                        Toast.makeText(getApplicationContext(),"Ваш уровень знания JS меньше 10",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if (sw_python[0]==true){
                    results[n[0]] = Python.return_result(type);lang_res[n[0]] = "python";
                    n[0]+=1;
                    if (Knowledge.getKnowledge_of_Python() < 10){
                        Toast.makeText(getApplicationContext(),"Ваш уровень знания python меньше 10",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                String comb = "Плохая";
                double result = 1;
                if (n[0] == 0) {
                    Toast.makeText(getApplicationContext(),"Ваш уровень знания python меньше 10",Toast.LENGTH_SHORT).show();
                    return;
                }else if(n[0] == 1){
                    comb = "Нету";
                }else if(type == "сайт" && n[0] == 2 && ((sw_html[0] && sw_js[0])||(sw_html[0] && sw_python[0]))){
                    comb = "Хорошая";
                    result = 2;
                }
                result *= max(results)* day_1 * Knowledge.getKnowlerge_of_any(lang_res[max_i(results)]) / 100;
                String compl;
                if (result >= pred_result(type,day_1)) {
                    compl = "Да";
                    Person.setRespect(Person.getRespect()+1);
                }else{
                    compl = "Нет";
                    if (Person.getRespect() != 0){
                        Person.setRespect(Person.getRespect()-1);
                    }
                }
                result *=100;
                result = Math.round(result);
                result /=100;
                if (compl =="Нет")result_text.setText("Ваш результат: "+String.valueOf(result)+"\n"+"Комбинация: "+comb+"\nЗаказчик доволен : "+compl+"\nВаша прибыль: 0$");
                if (compl =="Да")result_text.setText("Ваш результат: "+String.valueOf(result)+"\n"+"Комбинация: "+comb+"\nЗаказчик доволен : "+compl+"\nВаша прибыль: "+String.valueOf(money_pr/10)+"$");
                Person.setMoney(Person.getMoney()+money_pr/10);
                Person.setDay(Person.getDay()+day_1);
                day.setText("Дата(дни)\n"+String.valueOf(Person.getDay()));
                respect.setText("Уважение\n"+String.valueOf((int)Person.getRespect()));
                money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                turn = false;
                }
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person.setDay(Person.getDay() + 1);
                Intent intent = new Intent(Main7Activity.this, Main7Activity.class);
                startActivity(intent);
            }
        });
    }
    private String situation(String type,int day_1,double money_pr){
        final Random random = new Random();
        double complexity = 1;
        double respect = Person.getRespect();
        if (respect < 1000){
            if(respect == 0)   respect = 1;
            respect /= 100;
            complexity = complexity * respect;
        }
        double result = day_1*complexity;
        Freelance_situation situation = new Freelance_situation(type,day_1,result,all_for_freelance.return_company(random.nextInt(7)),money_pr/10);
        return Freelance_situation.finished_line();
    }
    private double pred_money(String type){
        double n = 1;
        final Random random = new Random();
        switch (type){
            case "web сервер":{ n = 1; break;}
            case "script для игры":{n = 2.5; break;}
            case "сайт":{n = 1.5; break;}
            case "приложение для PC":{n = 1; break;}
            case "android приложение":{n = 1.5; break;}
        }
        if (Person.getRespect() < 50) {
            return 10 * n + random.nextInt(5);
        }else if (Person.getRespect() < 300){
            return 20 * n + random.nextInt(10);
        }
        else if (Person.getRespect() <1000){
            return 30 * n + random.nextInt(15);
        }else if (Person.getRespect() <5000){
            return  Person.getRespect()/10 * n + random.nextInt(30);
        }else{
            return  Person.getRespect()/5*n + random.nextInt(100);
        }
    }
    private double pred_result(String type,int day_1){
        double complexity = 1;
        double respect = Person.getRespect();
        if (respect < 1000){
            if(respect == 0)   respect = 1;
            respect /= 100;
            complexity = complexity * respect;
        }
        double predict_result =day_1*complexity*100;
        predict_result = Math.round(predict_result);
        predict_result /= 100;
        return predict_result;
    }
    private int max_i(double[] results){
        int max = 0;
        for (int i = 0; i < 6; i++){
            if (results[i] > max){
                max = i;
            }
        }
        return max;
    }
    private double max(double[] results){
        double max = 0;
        for (int i = 0; i < 6; i++){
            if (results[i] > max){
                max = results[i];
            }
        }
        return max;
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Main7Activity.this, Main6Activity.class);
        startActivity(intent);
    }
}
