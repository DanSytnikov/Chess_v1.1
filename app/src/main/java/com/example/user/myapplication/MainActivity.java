package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private final static String LOG_TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.chess);
    }

    public void onClick(View view) {
        // TextView tv = (TextView) view;
        if (view.getId() == R.id.framebutton) {
            Intent intentfr = new Intent(this, FrameActivity.class);
            startActivity(intentfr); // Frame_Activity
        }
        if (view.getId() == R.id.relativebutton) {
            Intent intentrel = new Intent(this, RelativeActivity.class);
            startActivity(intentrel); // Relative_Activity
        }
        if (view.getId() == R.id.helpbutton) {
            Intent intentdon = new Intent(this, Donation.class);
            startActivity(intentdon); //
        }
        if (view.getId() == R.id.chess) {
            Intent intentchess = new Intent(this, ChessActivity.class);
            startActivity(intentchess); //
        }
        if (view.getId() == R.id.imageView2) {
            view.setEnabled(true);
            view.isPressed();
            ImageView img = (ImageView) findViewById(R.id.imageView2);
            img.setImageDrawable(getResources().getDrawable(R.drawable.ddfs));

            view.setForeground(getResources().getDrawable(R.drawable.frame));
           // img.setTag();
            //img.getTag();
        }
    }
}


