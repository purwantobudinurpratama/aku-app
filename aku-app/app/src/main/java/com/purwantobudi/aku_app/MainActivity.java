package com.purwantobudi.aku_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "--Aku App : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStrat() event");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The onResume event");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause event");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop event");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg, "The onRestart event");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy event");
    }
}

