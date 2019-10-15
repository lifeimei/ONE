package com.edu.huatec.lfmapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.edu.huatec.lfmapplication.R;

public class AdActivity extends AppCompatActivity {
    TextView tv_count;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        tv_count=findViewById(R.id.tv_count);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=5;i>=0;i--){
                    SystemClock.sleep(1000);

                    final int count=i;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv_count.setText("点击跳转"+count);
                        }
                    });

                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(AdActivity.this,LfmActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }).start();


    }}
