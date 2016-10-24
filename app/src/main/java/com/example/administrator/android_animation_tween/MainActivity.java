package com.example.administrator.android_animation_tween;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    private TranslateAnimation translateAnimation;
    private AlphaAnimation alphaAnimation;
    private ScaleAnimation scaleAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView) findViewById(R.id.iv);
      //初始化 Translate动画
        translateAnimation = new TranslateAnimation(0.1f, 1.0f,0.1f,1.0f);
      //初始化 Alpha动画
        alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        //初始化rotate
        RotateAnimation rotateAnimation=new RotateAnimation(0f,360f);
        //初始化scale
        scaleAnimation=new ScaleAnimation(0.5f, 1.0f,0.5f,1.0f);

       //动画集
        AnimationSet set = new AnimationSet(true);
        set.addAnimation(rotateAnimation);
        set.addAnimation(translateAnimation);
        set.addAnimation(alphaAnimation);
        set.addAnimation(scaleAnimation);

        //设置动画时间 (作用到每个动画)
        set.setDuration(3000);
        iv.startAnimation(set);
    }
}
