package com.example.GameDaTing;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.androidteris.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GamePingTaiActivity extends Activity {

    @BindView(R.id.wvPrivacyProtocolActivity)
    WebView wvPrivacyProtocolActivity;

    private String urlPath = "http://game.gionee.com/Front/Category/index/?category=13&cku=1767078621_null&action=visit&object=category13&intersrc=13";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_ping_tai);
        ButterKnife.bind(this);
        initWebView();

    }

    public void initWebView(){
        wvPrivacyProtocolActivity.loadUrl(urlPath);
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        wvPrivacyProtocolActivity.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
        //启用支持javascript
        WebSettings settings = wvPrivacyProtocolActivity.getSettings();
        settings.setJavaScriptEnabled(true);
        //使用缓存
        wvPrivacyProtocolActivity.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
    }
}

