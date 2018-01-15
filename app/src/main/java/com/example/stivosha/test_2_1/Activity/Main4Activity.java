package com.example.stivosha.test_2_1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.R;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btn_iq = (Button) findViewById(R.id.maths);
        Button back = (Button) findViewById(R.id.back);
        TextView respect = (TextView) findViewById(R.id.respect);
        final TextView money = (TextView) findViewById(R.id.money);
        final TextView iq = (TextView) findViewById(R.id.iq);
        TextView day = (TextView) findViewById(R.id.months);
        day.setText("Дата(день)\n"+String.valueOf(Person.getDay()));
        respect.setText("Уважение\n"+String.valueOf((int)Person.getRespect()));
        money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
        iq.setText("Интелект\n"+String.valueOf(Person.getIq()));
        Button btn_languages = (Button) findViewById(R.id.languages);
        btn_iq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Person.getMoney() >=1) {
                    if(Person.getIq() < 130) {
                        double test_ = (Person.getIq() + 0.1) * 10;
                        test_ = Math.round(test_);
                        Person.setIq(test_ / 10);
                    }else{
                        Toast.makeText(getApplicationContext(),"Вы слишком умны",Toast.LENGTH_SHORT).show();
                    }
                    Person.setDay(Person.getDay()+5);
                    Person.setMoney(Person.getMoney()-1);
                    iq.setText("Интелект\n"+String.valueOf(Person.getIq()));
                    money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");

                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, Main2Activity.class);
                startActivity(intent);

            }
        });
        btn_languages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Main4Activity.this, Main2Activity.class);
        startActivity(intent);
    }
}
