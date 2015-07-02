package com.example.renfuting.activitylifecycletest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity{

    public static final String TAG = "MainActivity";
    private ProgressDialog load;

    @InjectView(R.id.start_dialog_activity) Button dialogBtn;
    @InjectView(R.id.start_normal_activity) Button normalBtn;
    @InjectView(R.id.webView) public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        load = load.show(this,"","load...",true,false);
        MyAndroidWebViewClient webViewClient = new MyAndroidWebViewClient();
        webView.setWebViewClient(webViewClient);
        webViewClient.onPageStarted(webView,"www.baidu.com",null);
        load.dismiss();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @OnClick(R.id.start_dialog_activity)
    public void dialogBtnonClick(){
        Log.d("onClickDia","over.");
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.start_normal_activity)
    public void normalBtnonClick(){
        Log.d("onClickNor","over.");
        Intent intent = new Intent(MainActivity.this, NormalActivity.class);
        startActivity(intent);

    }


}
