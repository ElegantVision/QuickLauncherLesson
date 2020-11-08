package com.example.quicklauncher;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //checking if extra information has been passed into changing activity
        if (getIntent().hasExtra("Something")){

            //Assigning Value to variables
            text = getIntent().getExtras().getString("Something");
            tv = (TextView) findViewById(R.id.anotherTextView);

            //showing info
            tv.setText(text);
        }
    }
}
