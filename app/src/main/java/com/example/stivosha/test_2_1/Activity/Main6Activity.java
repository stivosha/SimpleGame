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

import java.util.Random;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final String[] jobs = new String[3];jobs[0] = "уборщиком";jobs[1]="мойщиком машин";jobs[2] = "дворником";
        TextView respect = (TextView) findViewById(R.id.respect);
        final TextView money = (TextView) findViewById(R.id.money);
        TextView iq = (TextView) findViewById(R.id.iq);
        final TextView day = (TextView) findViewById(R.id.day);
        day.setText("Дата(Дней)\n"+String.valueOf(Person.getDay()));
        respect.setText("Уважение\n"+String.valueOf((int)Person.getRespect()));
        money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
        iq.setText("Интелект\n"+String.valueOf(Person.getIq()));
        Button simple_job = (Button) findViewById(R.id.btn_simple_work);
        final Random random = new Random();
        Button freelance = (Button) findViewById(R.id.btn_freelance);
        simple_job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "Вы проработали 1 день "+jobs[random.nextInt(3)]+" и заработали 1$";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
                Person.setMoney(Person.getMoney() + 1);
                money.setText("Деньги\n"+String.valueOf(Person.getMoney())+"$");
                Person.setDay(Person.getDay() + 1);
                day.setText("Дата(день)\n"+String.valueOf(Person.getDay()));
            }
        });
        freelance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main6Activity.this, Main7Activity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Main6Activity.this, Main2Activity.class);
        startActivity(intent);
    }
}
