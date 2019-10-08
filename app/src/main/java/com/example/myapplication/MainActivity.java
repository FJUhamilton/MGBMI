package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edW,edH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        edW = findViewById(R.id.edW);
        edH = findViewById(R.id.edH);
    }


    public void bmi(View view){
        float weight = Float.parseFloat(edW.getText().toString());
        float height = Float.parseFloat(edH.getText().toString());
        float bmi = weight/(height*height);
        Log.d("MainActivity","BMI"+bmi);
    }
}
