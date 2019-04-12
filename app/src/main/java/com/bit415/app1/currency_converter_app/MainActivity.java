package com.bit415.app1.currency_converter_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public void convertToEuro(View view){
        EditText editText = (EditText) findViewById(R.id.edtText);

        int dollars = Integer.parseInt(editText.getText().toString());
        double ghs = 5.5;

        double result = dollars * ghs ;

        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
