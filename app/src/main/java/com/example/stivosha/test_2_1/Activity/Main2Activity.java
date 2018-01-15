package com.example.stivosha.test_2_1.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stivosha.test_2_1.Classes.Knowledge;
import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.Programming_languages.Cpp;
import com.example.stivosha.test_2_1.R;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_knowledge = (Button) findViewById(R.id.button);
        TextView respect = (TextView) findViewById(R.id.respect);
        TextView money = (TextView) findViewById(R.id.money);
        TextView iq = (TextView) findViewById(R.id.iq);
        TextView day = (TextView) findViewById(R.id.months);
        day.setText("Дата(дни)\n"+String.valueOf(Person.getDay()));
        respect.setText("Уважение\n"+String.valueOf((int)Person.getRespect()));
        money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
        iq.setText("Интелект\n"+String.valueOf(Person.getIq()));
        Button btn_study = (Button)findViewById(R.id.study);
        Button btn_work = (Button)findViewById(R.id.button3);
        Button shop = (Button)findViewById(R.id.shop);
        Button save = (Button)findViewById(R.id.save);
        final String string = String.valueOf(Person.getRespect())+"\n"+String.valueOf(Person.getMoney())+"\n"+String.valueOf(Person.getDay())+"\n"+String.valueOf(Person.getIq())+"\n"+ Knowledge.getAll();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                            openFileOutput("save1", MODE_PRIVATE)));
                    bw.write(string);
                    bw.close();
                    Toast.makeText(getApplicationContext(),"Сохранение прошло успешно",Toast.LENGTH_SHORT).show();
            } catch (FileNotFoundException e) {
                    Toast.makeText(getApplicationContext(),"Ошибка #1",Toast.LENGTH_SHORT).show();
            }catch (Exception e) {
                    Toast.makeText(getApplicationContext(),"Ошибка #2",Toast.LENGTH_SHORT).show();
                }
            }
        });
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main8Activity.class);
                startActivity(intent);
            }
        });
        btn_knowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
        btn_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
        btn_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {

    }
}
