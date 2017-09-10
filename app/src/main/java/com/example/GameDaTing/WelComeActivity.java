package com.example.GameDaTing;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.example.androidteris.R;

public class WelComeActivity extends Activity {

    protected Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wele_come);




        doInUI(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelComeActivity.this,GameDaTingActivity.class);
                startActivity(intent);
                WelComeActivity.this.finish();
            }
        },10);
    }

    public void doInUI(Runnable runnable, long delayMillis){
        getHandler().postDelayed(runnable, delayMillis);
    }

    public Handler getHandler(){
        if(mHandler == null){
            synchronized (this){
                if(mHandler == null){
                    mHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return mHandler;
    }
}
