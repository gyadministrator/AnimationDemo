package com.android.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class TweenActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_alpha;
    private Button btn_scale;
    private Button btn_translate;
    private Button btn_rotate;
    private Button btn_set;
    private ImageView iv;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        initView();
    }

    private void initView() {
        btn_alpha = findViewById(R.id.btn_alpha);
        btn_scale = findViewById(R.id.btn_scale);
        btn_translate = findViewById(R.id.btn_translate);
        btn_rotate = findViewById(R.id.btn_rotate);
        btn_set = findViewById(R.id.btn_set);
        iv = findViewById(R.id.iv);

        btn_alpha.setOnClickListener(this);
        btn_scale.setOnClickListener(this);
        btn_translate.setOnClickListener(this);
        btn_rotate.setOnClickListener(this);
        btn_set.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_alpha:
                animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
                break;
            case R.id.btn_scale:
                animation = AnimationUtils.loadAnimation(this, R.anim.scale);
                break;
            case R.id.btn_translate:
                animation = AnimationUtils.loadAnimation(this, R.anim.translate);
                break;
            case R.id.btn_rotate:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
                break;
            case R.id.btn_set:
                animation = AnimationUtils.loadAnimation(this, R.anim.set);
                break;
        }
        iv.startAnimation(animation);
    }
}
