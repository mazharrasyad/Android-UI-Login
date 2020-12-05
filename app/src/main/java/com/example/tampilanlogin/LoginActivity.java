package com.example.tampilanlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button button_login;
    private EditText edit_username, edit_password;
    private String text_username, text_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setData();
    }

    public void initView(){
        button_login = findViewById(R.id.button_login_id);
        edit_username = findViewById(R.id.edit_username_id);
        edit_password = findViewById(R.id.edit_password_id);
    }

    public void setData(){
        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text_username = edit_username.getText().toString();
                text_password = edit_password.getText().toString();

                Intent login = new Intent(LoginActivity.this, MainActivity.class);
                login.putExtra("username", text_username);
                login.putExtra("password", text_password);
                startActivity(login);
            }
        });
    }
}