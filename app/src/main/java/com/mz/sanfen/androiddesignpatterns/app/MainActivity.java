package com.mz.sanfen.androiddesignpatterns.app;

import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.mz.sanfen.androiddesignpatterns.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_main, null);


        AlertDialog dialog = new AlertDialog.Builder(this).create();

    }
}
