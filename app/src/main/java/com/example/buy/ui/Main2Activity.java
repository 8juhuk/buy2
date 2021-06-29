package com.example.buy.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.buy.R;

public class Main2Activity extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton btn_home,btn_category,btn_cart,btn_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
