package com.example.android.localization_tut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void f(View view)
    {
        TextView tv = (TextView) view;
        tv.setText(getString(R.string.time_text, "A", "B", 1));
    }
}