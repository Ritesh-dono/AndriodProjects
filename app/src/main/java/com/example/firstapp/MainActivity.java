package com.example.firstapp;
// Change this package name according to your app

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        button= findViewById(R.id.button);

        // Find the button by ID


        // Set click listener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              text.setText("welcome to graphic era hill university");
            }
        });
    }
}
