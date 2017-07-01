package com.shannonj.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText dollarText = (EditText) findViewById(R.id.dollarText);

        Double dollarAmountDouble = Double.parseDouble(dollarText.getText().toString());
        
        Double poundAmount = dollarAmountDouble * 0.75;

        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();
        
        Log.i("amount", dollarText.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
