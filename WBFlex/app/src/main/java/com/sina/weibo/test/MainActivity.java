package com.sina.weibo.test;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.soloader.SoLoader;
import com.sina.weibo.wbflex.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoLoader.init(this, false);
        setContentView(R.layout.activity_main);
    }


}
