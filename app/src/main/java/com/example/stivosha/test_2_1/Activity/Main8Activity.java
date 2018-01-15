package com.example.stivosha.test_2_1.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.stivosha.test_2_1.Classes.Person;
import com.example.stivosha.test_2_1.Programming_languages.CSharp;
import com.example.stivosha.test_2_1.R;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Button end_game = (Button)findViewById(R.id.end_game);
        end_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Person.getRespect() > 1000 && Person.getMoney() > 10000){
                    Person.setDay(0);
                    Person.setRespect(0);
                    Person.setMoney(100);
                    Person.setIq(90);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Main8Activity.this);
                    builder.setTitle("Конец")
                            .setMessage("Конец игры\nВаш счет: "+Person.getDay())
                            .setCancelable(false)
                            .setNegativeButton("Принять",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(Main8Activity.this, MainActivity.class);
                                            startActivity(intent);
                                            dialog.cancel();
                                        }
                                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }else{
                    Toast.makeText(getApplicationContext(),"У вас недостаточно средств",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
