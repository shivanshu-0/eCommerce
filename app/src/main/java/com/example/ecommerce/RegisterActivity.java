package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button CreateAccountButton;
    private EditText InputName, InputPhoneNumber, InputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        CreateAccountButton =(Button) findViewById(R.id.register_btn);
        InputName =(EditText) findViewById(R.id.register_username_input);
        InputPhoneNumber =(EditText) findViewById(R.id.register_phone_number_input);
        InputPassword =(EditText) findViewById(R.id.register_password_input);
    }
}
