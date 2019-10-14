package com.android.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_frame;
    private Button btn_tween;
    private Button btn_properties;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    private void initView() {
        btn_frame = findViewById(R.id.btn_frame);
        btn_tween = findViewById(R.id.btn_tween);
        btn_properties = findViewById(R.id.btn_properties);
        btn_login = findViewById(R.id.btn_login);

        btn_frame.setOnClickListener(this);
        btn_tween.setOnClickListener(this);
        btn_properties.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.btn_frame:
                intent.setClass(this, MainActivity.class);
                break;
            case R.id.btn_tween:
                intent.setClass(this, TweenActivity.class);
                break;
            case R.id.btn_properties:
                break;
            case R.id.btn_login:
                intent.setClass(this, LoginActivity.class);
                break;
        }
        startActivity(intent);
    }
}
