package com.example.mfirstapp;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        t = findViewById(R.id.txt);
        b = findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                t.setText(Integer.toString(count));
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}