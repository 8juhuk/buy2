package com.example.buy.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class utils {
    public static int dp2px(Context context,float dpvalue){
        final float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dpvalue*scale+0.5f);
    }
    public static int getScreenWidth(Context context){
        DisplayMetrics dm=new DisplayMetrics();
        WindowManager wm=(WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display display=wm.getDefaultDisplay();
        display.getMetrics(dm);
        return dm.widthPixels;
    }
    public static int getScreenHeight(Context context){
        DisplayMetrics dm=new DisplayMetrics();
        WindowManager wm=(WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display display=wm.getDefaultDisplay();
        display.getMetrics(dm);
        return dm.heightPixels;
    }
}
