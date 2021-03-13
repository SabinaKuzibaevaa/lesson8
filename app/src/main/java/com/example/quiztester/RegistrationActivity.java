package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    EditText et_name, et_surname, et_phone, et_email, et_password;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        et_name = findViewById(R.id.et_name);
        et_surname = findViewById(R.id.et_surname);
        et_phone = findViewById(R.id.et_phone);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        signin = findViewById(R.id.sign_in);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(TextUtils.isEmpty(et_name.getText())) {
                    et_name.setError("Толтырыңыз");
                    return;
                }
                if(TextUtils.isEmpty(et_surname.getText())) {
                    et_surname.setError("Толтырыңыз");
                    return;
                }
                if(TextUtils.isEmpty(et_phone.getText())) {
                    et_phone.setError("Толтырыңыз");
                    return;
                }
                if(TextUtils.isEmpty(et_email.getText())) {
                    et_email.setError("Толтырыңыз");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())) {
                    et_password.setError("Толтырыңыз");
                    return;
                }

                Intent registrationIntent = new Intent (RegistrationActivity.this, MainActivity.class);
                startActivity(registrationIntent);

            }
        });


    }
}