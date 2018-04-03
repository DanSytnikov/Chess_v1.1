package com.example.user.myapplication;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by student on 03.04.18.
 */

public class ChessApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
