package com.example.appods;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CH_Activity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11);
    }
    public void goMenu(View view) {
        setContentView(R.layout.activity_main);
    }
}