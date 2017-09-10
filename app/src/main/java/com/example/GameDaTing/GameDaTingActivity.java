package com.example.GameDaTing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.androidteris.HomePage;
import com.example.androidteris.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameDaTingActivity extends Activity implements View.OnClickListener {

    @BindView(R.id.btnGameDaTingActivityXiuXian)
    Button btnGameDaTingActivityXiuXian;
    @BindView(R.id.btnGameDaTingActivityDongZuo)
    Button btnGameDaTingActivityDongZuo;
    @BindView(R.id.btnGameDaTingActivityQiPai)
    Button btnGameDaTingActivityQiPai;
    @BindView(R.id.btnGameDaTingActivityFeiXing)
    Button btnGameDaTingActivityFeiXing;
    @BindView(R.id.btnGameDaTingActivityKaPai)
    Button btnGameDaTingActivityKaPai;
    @BindView(R.id.btnGameDaTingActivityMoNi)
    Button btnGameDaTingActivityMoNi;
    @BindView(R.id.btnGameDaTingActivityTiYu)
    Button btnGameDaTingActivityTiYu;
    @BindView(R.id.btnGameDaTingActivityErLuoShi)
    Button btnGameDaTingActivityErLuoShi;
    @BindView(R.id.llKindActivityAll)
    LinearLayout llKindActivityAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_da_ting);
        ButterKnife.bind(this);
         btnGameDaTingActivityXiuXian.setOnClickListener(this);
        btnGameDaTingActivityDongZuo.setOnClickListener(this);
         btnGameDaTingActivityQiPai.setOnClickListener(this);
         btnGameDaTingActivityFeiXing.setOnClickListener(this);
        btnGameDaTingActivityKaPai.setOnClickListener(this);
        btnGameDaTingActivityMoNi.setOnClickListener(this);
        btnGameDaTingActivityTiYu.setOnClickListener(this);
         btnGameDaTingActivityErLuoShi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGameDaTingActivityXiuXian:
                Intent intent  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent);
                break;
            case R.id.btnGameDaTingActivityDongZuo:
                Intent intent2  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnGameDaTingActivityQiPai:
                Intent intent3  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent3);
                break;
            case R.id.btnGameDaTingActivityFeiXing:
                Intent intent4  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent4);
                break;
            case R.id.btnGameDaTingActivityKaPai:
                Intent intent5  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent5);
                break;
            case R.id.btnGameDaTingActivityMoNi:
                Intent intent6  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent6);
                break;
            case R.id.btnGameDaTingActivityTiYu:
                Intent intent7  = new Intent(this,GamePingTaiActivity.class);
                startActivity(intent7);
                break;
            case R.id.btnGameDaTingActivityErLuoShi:
                Intent intent8  = new Intent(this,HomePage.class);
                startActivity(intent8);
                break;
        }

    }
}
