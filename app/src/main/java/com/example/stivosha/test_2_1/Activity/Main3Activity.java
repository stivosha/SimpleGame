package com.example.stivosha.test_2_1.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.stivosha.test_2_1.Classes.Knowledge;
import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.Programming_languages.CSharp;
import com.example.stivosha.test_2_1.Programming_languages.Cpp;
import com.example.stivosha.test_2_1.Programming_languages.JS;
import com.example.stivosha.test_2_1.Programming_languages.Java;
import com.example.stivosha.test_2_1.Programming_languages.Python;
import com.example.stivosha.test_2_1.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Person geek = new Person();
        TextView txt_python = (TextView) findViewById(R.id.Python);
        TextView txt_cpp = (TextView) findViewById(R.id.Cpp);
        TextView txt_csharp = (TextView) findViewById(R.id.CSharp);
        TextView txt_java = (TextView) findViewById(R.id.Java);
        TextView txt_js = (TextView) findViewById(R.id.JS);
        TextView txt_html = (TextView) findViewById(R.id.HTML);
        Knowledge kn = new Knowledge();
        txt_python.setText(" "+String.valueOf(kn.getKnowledge_of_Python())+"/100");
        txt_cpp.setText(" "+String.valueOf(kn.getKnowledge_of_Cpp())+"/100");
        txt_csharp.setText(" "+String.valueOf(kn.getKnowledge_of_CSharp())+"/100");
        txt_java.setText(" "+String.valueOf(kn.getKnowledge_of_Java())+"/100");
        txt_js.setText(" "+String.valueOf(kn.getKnowledge_of_JS())+"/100");
        txt_html.setText(" "+String.valueOf(kn.getKnowledge_of_HTML())+"/100");
        Button html = (Button) findViewById(R.id.html_);
        Button cpp = (Button)findViewById(R.id.Cpp_);
        Button java = (Button)findViewById(R.id.Java_);
        Button csharp = (Button)findViewById(R.id.CSharp_);
        Button js = (Button)findViewById(R.id.JS_);
        Button python = (Button)findViewById(R.id.Python_);
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Информация о HTML")
                        .setMessage("HTML язык разметки, для хорошей работы достаточно владеть им на 40 очков,остальные параметры не влияют на результат")
                        .setCancelable(false)
                        .setNegativeButton("Принять",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Информация о C++")
                        .setMessage("Время для написания обычной программы: "+ String.valueOf(Cpp.getTime_for_create_simple_program())+"\n"+
                        "Очков для верстки: "+String.valueOf(Cpp.getWeb_lvl())+"\nОчков для написания web сервера: "+String.valueOf(Cpp.getServer_lvl())+"\nОчков для написания игр:"+String.valueOf(Cpp.getGame_lvl())+"\nОчков для андроид разработки: "+
                                String.valueOf(Cpp.getAndroid_lvl())+"\nОчков для разработки по: "+String.valueOf(Cpp.getApp_lvl()))
                        .setCancelable(false)
                        .setNegativeButton("Принять",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Информация о C#")
                        .setMessage("Время для написания обычной программы: "+ String.valueOf(CSharp.getTime_for_create_simple_program())+"\n"+
                                "Очков для верстки: "+String.valueOf(CSharp.getWeb_lvl())+"\nОчков для написания web сервера: "+String.valueOf(CSharp.getServer_lvl())+"\nОчков для написания игр: "+String.valueOf(CSharp.getGame_lvl())+"\nОчков для андроид разработки: "+
                                String.valueOf(CSharp.getAndroid_lvl())+"\nОчков для разработки по: "+String.valueOf(CSharp.getApp_lvl()))
                        .setCancelable(false)
                        .setNegativeButton("Принять",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Информация о Java")
                        .setMessage("Время для написания обычной программы: "+ String.valueOf(Java.getTime_for_create_simple_program())+"\n"+
                                "Очков для верстки: "+String.valueOf(Java.getWeb_lvl())+"\nОчков для написания web сервера: "+String.valueOf(Java.getServer_lvl())+"\nОчков для написания игр: "+String.valueOf(Java.getGame_lvl())+"\nОчков для андроид разработки: "+
                                String.valueOf(Java.getAndroid_lvl())+"\nОчков для разработки по: "+String.valueOf(Java.getApp_lvl()))
                        .setCancelable(false)
                        .setNegativeButton("Принять",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Информация о Java Script")
                        .setMessage("Время для написания обычной программы: "+ String.valueOf(JS.getTime_for_create_simple_program())+"\n"+
                                "Очков для верстки: "+String.valueOf(JS.getWeb_lvl())+"\nОчков для написания web сервера: "+String.valueOf(JS.getServer_lvl())+"\nОчков для написания игр: "+String.valueOf(JS.getGame_lvl())+"\nОчков для андроид разработки: "+
                                String.valueOf(JS.getAndroid_lvl())+"\nОчков для разработки по: "+String.valueOf(JS.getApp_lvl()))
                        .setCancelable(false)
                        .setNegativeButton("Принять",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Информация о Python")
                        .setMessage("Время для написания обычной программы: "+ String.valueOf(Python.getTime_for_create_simple_program())+"\n"+
                                "Очков для верстки: "+String.valueOf(Python.getWeb_lvl())+"\nОчков для написания web сервера: "+String.valueOf(Python.getServer_lvl())+"\nОчков для написания игр: "+String.valueOf(Python.getGame_lvl())+"\nОчков для андроид разработки: "+
                                String.valueOf(Python.getAndroid_lvl())+"\nОчков для разработки по: "+String.valueOf(Python.getApp_lvl()))
                        .setCancelable(false)
                        .setNegativeButton("Принять",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
