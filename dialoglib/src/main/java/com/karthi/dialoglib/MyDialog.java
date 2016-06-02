package com.karthi.dialoglib;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;


public class MyDialog extends Dialog {

Context context;
    MaterialProgressBar materialProgressBar;
    public MyDialog(Context context) {
        super(context);
        this.context=context;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.progressdialog);

        materialProgressBar=(MaterialProgressBar)findViewById(R.id.circular);

        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }
    public void setProgressColor(int color,Context context){
//        materialProgressBar.getBackground().setColorFilter(context.getResources().getColor(color), PorterDuff.Mode.SRC_ATOP);
    }
}