package com.example.pengdan.packagetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mysdk.AppUtils;

/**
 * pars
 */

public class MainAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.hello);
        new AppUtils().printHellWorld();
        tv.setText(AppUtils.TAG);
    }
}
