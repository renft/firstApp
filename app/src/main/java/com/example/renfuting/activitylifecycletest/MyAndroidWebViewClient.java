package com.example.renfuting.activitylifecycletest;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by renfuting on 15/06/05.
 */
class MyAndroidWebViewClient extends WebViewClient {

    private ProgressDialog load;
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        // TODO
        Log.d("","ttt");
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO
    }
}