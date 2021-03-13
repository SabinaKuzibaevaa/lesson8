package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView surak1, surak2, surak3, surak4;
    RadioButton putin, moscow, oleg;
    RadioButton oven, kozerok, olleg;
    RadioButton dyshat, coding, anime;
    RadioButton qazaqstan, kazakhstan, kazakistan;
    Button check;

    String [] suraktar = {"Столица России?", "Мой зз?", "Что я люблю делать?", "Какой вариант правильный?"};

    String[][] variant = {
            {"Путин", "Моксва", "Олег"},
            { "Овен", "Козерог" , "Олег"},
            {"Дышать","Кодить","Смотреть аниме"},
            {"Qazaqstan","Kazakhstan","Қазақстан"}
    };

    String [] jauaptar = {"Моксва", "Овен", "Смотреть аниме", "Kazakhstan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surak1 = findViewById(R.id.surak1);
        surak2 = findViewById(R.id.surak2);
        surak3 = findViewById(R.id.surak3);
        surak4 = findViewById(R.id.surak4);

        putin = findViewById(R.id.putin);
        moscow = findViewById(R.id.moscow);
        oleg = findViewById(R.id.oleg);

        oven = findViewById(R.id.oven);
        kozerok = findViewById(R.id.kozerok);
        olleg = findViewById(R.id.olleg);

        dyshat = findViewById(R.id.dyshat);
        coding = findViewById(R.id.coding);
        anime = findViewById(R.id.anime);

        qazaqstan = findViewById(R.id.qazaqstan);
        kazakhstan = findViewById(R.id.kazakhstan);
        kazakistan = findViewById(R.id.kazakistan);

        check = findViewById(R.id.check);
        suraktarzhinau();

        check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                tekseris(surak1, putin, moscow, oleg, 0);
                tekseris(surak2, oven, kozerok, olleg, 1);
                tekseris(surak3, dyshat, coding, anime, 2);
                tekseris(surak4, qazaqstan, kazakhstan, kazakistan, 3);

            }
        });

    }

    public void tekseris(TextView surak, RadioButton rb1, RadioButton rb2, RadioButton rb3, int index){
        if(rb1.isChecked()&&
                rb1.getText().toString().equals(jauaptar[index])){
            surak.setText(suraktar[index]+"/ncorrect");
            surak.setTextColor(getResources().getColor(R.color.green));
        }else if(rb2.isChecked()&&
                rb2.getText().toString().equals(jauaptar[index])) {
            surak.setText(suraktar[index]+"/ncorrect");
            surak.setTextColor(getResources().getColor(R.color.green));
        }else if(rb3.isChecked()&&
                rb3.getText().toString().equals(jauaptar[index])) {
            surak.setText(suraktar[index]+"/ncorrect");
            surak.setTextColor(getResources().getColor(R.color.green));
        }else{
            surak.setText(suraktar[index]+"/nwrong");
            surak.setTextColor(getResources().getColor(R.color.red));
        }
    }
    public void suraktarzhinau(){
        surak1.setText(suraktar[0]);
        putin.setText(variant[0][0]);
        moscow.setText(variant[0][1]);
        oleg.setText(variant[0][2]);

        surak2.setText(suraktar[1]);
        oven.setText(variant[1][0]);
        kozerok.setText(variant[1][1]);
        olleg.setText(variant[1][2]);

        surak3.setText(suraktar[2]);
        dyshat.setText(variant[2][0]);
        coding.setText(variant[2][1]);
        anime.setText(variant[2][2]);

        surak4.setText(suraktar[3]);
        qazaqstan.setText(variant[3][0]);
        kazakhstan.setText(variant[3][1]);
        kazakistan.setText(variant[3][2]);
    }
}