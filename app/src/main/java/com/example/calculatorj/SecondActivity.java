package com.example.calculatorj;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView txt = findViewById(R.id.txt);
        int nember1 = Integer.parseInt(getIntent().getExtras().getString("n1"));
        int nember2 = Integer.parseInt(getIntent().getExtras().getString("n2"));
        int result = nember1 + nember2;
        String st;
        if(nember2 < 0) st = nember1 + "+" + "(" + nember2 + ")=" + result;
        else st = nember1 + "+" + nember2 + "=" + result;
        txt.setText(st);
    }

}