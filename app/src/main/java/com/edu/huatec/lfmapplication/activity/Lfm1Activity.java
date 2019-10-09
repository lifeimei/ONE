package com.edu.huatec.lfmapplication.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.edu.huatec.lfmapplication.R;

public class Lfm1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_lfm1);
     ImageView LoadingView=findViewById(R.id.splash_loading_item);
        Animation animation = AnimationUtils.loadAnimation(Lfm1Activity.this,R.anim.splash_loading);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
             Intent intent= new Intent(Lfm1Activity.this,LfmActivity.class);
                startActivity(intent);
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        LoadingView.startAnimation(animation);



    }
}

