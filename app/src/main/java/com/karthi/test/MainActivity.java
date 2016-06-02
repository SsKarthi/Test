package com.karthi.test;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.karthi.dialoglib.MyDialog;

public class MainActivity extends AppCompatActivity {
    MyDialog mydialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydialog = new MyDialog(this);
        mydialog.setCancelable(false);
//        mydialog.setProgressColor(R.color.colorAccent,this);
        mydialog.show();
    }
}
