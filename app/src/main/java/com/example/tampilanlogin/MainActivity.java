package com.example.tampilanlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_username, text_password;
    private String username, password;
    private Button button_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
        logout();
    }

    public void initView(){
        text_username = findViewById(R.id.text_username_id);
        text_password = findViewById(R.id.text_password_id);
        button_logout = findViewById(R.id.button_logout_id);
    }

    public void setData(){
        Intent login = getIntent();
        username = login.getStringExtra("username");
        password = login.getStringExtra("password");

        text_username.setText(username);
        text_password.setText(password);
    }

    public void logout(){
        button_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(logout);
            }
        });
    }
}