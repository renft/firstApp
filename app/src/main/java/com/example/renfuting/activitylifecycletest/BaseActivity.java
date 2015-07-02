package com.example.renfuting.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by renfuting on 15/06/05.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
