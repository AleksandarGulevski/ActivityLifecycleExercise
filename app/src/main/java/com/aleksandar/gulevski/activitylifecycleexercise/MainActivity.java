package com.aleksandar.gulevski.activitylifecycleexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onCreate method started",
                Toast.LENGTH_LONG);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onStart method started",
                Toast.LENGTH_LONG);
        toast.show();
        super.onStart();

    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onResume method called",
                Toast.LENGTH_LONG);
        toast.show();
        super.onResume();

    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onPause method called",
                Toast.LENGTH_LONG);
        toast.show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onStop method called",
                Toast.LENGTH_LONG);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "onDestroy method called",
                Toast.LENGTH_LONG);
        toast.show();
        super.onDestroy();
    }
}


