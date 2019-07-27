package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);
//Capture the layout's TextView and set the string as its text
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(message);
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(message2);

    }
}
