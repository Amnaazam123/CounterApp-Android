package com.example.mfirstapp;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //variable for maintaining count 
    private int count = 0;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.txt);
        b = (Button)findViewById(R.id.btn);

    }
    public void IncreaseCount(View view){
        count++;
        t.setText(Integer.toString(count));
    }
    public void decreaseCount(View view){
        count--;
        t.setText(Integer.toString(count));
    }

}
