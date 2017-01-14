package com.sunil.pdf.createpdfandroidapp;

import android.app.Application;
import android.os.SystemClock;
import android.provider.Settings;

/**
 * Created by sunil on 13-01-2017.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(1500);
    }
}