package com.zmm.ttsyzsdemo;

import android.app.Application;
import android.content.Context;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/25
 * Time:下午1:52
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        TTSUtils.getInstance().init();
    }

    public static Context getContext(){
        return context;
    }
}