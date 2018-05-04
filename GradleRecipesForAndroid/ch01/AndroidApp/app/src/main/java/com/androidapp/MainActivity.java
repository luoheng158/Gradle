package com.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import okio.AsyncTimeout;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = null;
        if (retrofit != null) {
            Log.d("luoheng", "NULL");
        } else {
            Log.d("luoheng", "NONE NULL");
        }
        AsyncTimeout d = null;
    }
}
