package com.example.stivosha.test_2_1.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.stivosha.test_2_1.Classes.Knowledge;
import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_start_game = (Button) findViewById(R.id.start_game);
        Button btn_exit = (Button) findViewById(R.id.exit);
        Button btn_resume = (Button)findViewById(R.id.resume_game);
        btn_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    BufferedReader br = new BufferedReader(new InputStreamReader(
                            openFileInput("save1")));
                    Person.setRespect(Double.parseDouble(br.readLine()));
                    Person.setMoney(Double.parseDouble(br.readLine()));
                    Person.setDay(Integer.parseInt(br.readLine()));
                    Person.setIq(Double.parseDouble(br.readLine()));
                    Knowledge.setKnowledge_of_Python(Double.parseDouble(br.readLine()));
                    Knowledge.setKnowledge_of_Java(Double.parseDouble(br.readLine()));
                    Knowledge.setKnowledge_of_Cpp(Double.parseDouble(br.readLine()));
                    Knowledge.setKnowledge_of_CSharp(Double.parseDouble(br.readLine()));
                    Knowledge.setKnowledge_of_HTML(Double.parseDouble(br.readLine()));
                    Knowledge.setKnowledge_of_JS(Double.parseDouble(br.readLine()));
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Файл не существует",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Начало")
                        .setMessage("Вам 18 лет, вы полны амбиций, вы решаете всать на тропу программистов, для начала вам нужно изучить базу,основу и тд для одного языка, после этого вы можете работать на фриланс бирже, ваша задача добиться успеха как можно раньше, удачи.")
                        .setCancelable(false)
                        .setNegativeButton("Ок",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                        startActivity(intent);
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {

    }
}
