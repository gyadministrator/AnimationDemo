package com.android.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_user;
    private EditText et_password;
    private Button btn_login;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        et_user = findViewById(R.id.et_user);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);
    }

    private String getUser() {
        return et_user.getText().toString();
    }

    private String getPassword() {
        return et_password.getText().toString();
    }

    @Override
    public void onClick(View view) {
        if (TextUtils.isEmpty(getUser())) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
            animation = AnimationUtils.loadAnimation(this, R.anim.login_anim);
            et_user.startAnimation(animation);

            et_user.setHint("用户名不能为空");
            et_user.setHintTextColor(Color.RED);
            return;
        }
        if (TextUtils.isEmpty(getPassword())) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
            animation = AnimationUtils.loadAnimation(this, R.anim.login_anim);
            et_password.startAnimation(animation);

            et_password.setHint("密码不能为空");
            et_password.setHintTextColor(Color.RED);
            return;
        }
        login();
    }

    private void login() {

    }
}
