package com.example.user.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;


import java.util.Map;
import java.util.Set;

import io.realm.Realm;
import io.realm.RealmResults;

public class ChessActivity extends AppCompatActivity {
    private final static String LOG_TAG = "ChessActivity";
    private Realm realm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        //SharedPreferences sp = getSharedPreferences("shared", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sp.edit();
        //editor.putString("RandomSharedString", "Value of String 1");
        //editor.putBoolean("bool1", true);
        //editor.apply();
        //Log.e(LOG_TAG, sp.getBoolean("bool1", false));
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Figure figure = realm.createObject(Figure.class);
        figure.setX(19);
        figure.setY(99);

        realm.commitTransaction();
    }




    public void Click(View view) {
        view.setForeground(getDrawable(R.drawable.frame));
        ImageView img = (ImageView) findViewById(R.id.);
        //Figure figure = (Figure)view.getTag()
        RealmResults<Figure> results1 = realm.where(Figure.class).findAll();
        for (Figure f : results1){
            f.getX();
            f.getY();
            Log.e(LOG_TAG, "" + f.getX() + " " + f.getY());
        }


    }

    @Override
    protected void onStop() {
        super.onStop();
        realm.close();
    }
}
