package com.example.testmultimudule;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylib1.Test1;
import com.example.mylib2.Test2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", Test1.T);
        Log.d("test", Test2.T);
    }
}