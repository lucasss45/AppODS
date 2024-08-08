package com.example.appods;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goMenu(View view) {
        setContentView(R.layout.activity_main);
    }

    public void goCN(View view) {
        setContentView(R.layout.activity_ch1);
    }

    public void goCH(View view) {
        setContentView(R.layout.activity_ch1);
    }

    public void goLG(View view) {
        setContentView(R.layout.activity_ch1);
    }

    public void goTC(View view) {
        setContentView(R.layout.activity_ch1);
    }

    public void goMat(View view) {
        setContentView(R.layout.activity_ch1);
    }

    public void goPVPV(View view) {
        setContentView(R.layout.activity_ch1);
    }


}