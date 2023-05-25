package com.example.calculatorj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Fold(View view)
    {
        EditText editText1 = findViewById(R.id.nember1);
        EditText editText2 = findViewById(R.id.nember2);
        String n1 = editText1.getText().toString();
        String n2 = editText2.getText().toString();
        Pattern pattern = Pattern.compile("-?\\d+");

        if(pattern.matcher(n1).matches() & pattern.matcher(n2).matches())
        {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("n1", editText1.getText().toString());
            intent.putExtra("n2", editText2.getText().toString());
            startActivity(intent);
        }
    }
}