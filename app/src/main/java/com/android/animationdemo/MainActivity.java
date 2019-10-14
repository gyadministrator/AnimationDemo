package com.android.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_start;
    private Button btn_stop;
    private ImageView iv;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);
        iv = findViewById(R.id.iv);

        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);

        animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.frame_animation);
        iv.setBackgroundDrawable(animationDrawable);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start:
                if (iv != null && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
                break;
            case R.id.btn_stop:
                if (iv != null && animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                break;
        }
    }
}
