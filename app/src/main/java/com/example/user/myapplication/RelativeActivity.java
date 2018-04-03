package com.example.user.myapplication;

import android.icu.util.Output;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.OutputStream;
import java.util.Objects;

public class RelativeActivity extends AppCompatActivity {
    private final static String LOG_TAG = "RelativeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }

    public void onClick1(View view){
        TextView viewCheck = (TextView)view;
        view.setVisibility(View.GONE);
    }
    public void Reset(View view){
        setContentView(R.layout.activity_relative);
    }
}
