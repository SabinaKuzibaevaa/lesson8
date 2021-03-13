 package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class LoginActivity extends AppCompatActivity {

     EditText et_email, et_password;
     Button log_in, sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        log_in = findViewById(R.id.log_in);
        sign_in = findViewById(R.id.sign_in);


        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent registrationIntent = new Intent (LoginActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });

        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(TextUtils.isEmpty(et_email.getText())) {
                    et_email.setError("Толтырыңыз");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())) {
                    et_password.setError("Толтырыңыз");
                    return;
                }

                if (et_email.getText().toString().equals("user@gmail.com")&&
                et_password.getText().toString().equals("123456")) {
                    Intent registrationIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(registrationIntent);
                }else{
                    Toast.makeText(LoginActivity.this, "e-mail or password is wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}