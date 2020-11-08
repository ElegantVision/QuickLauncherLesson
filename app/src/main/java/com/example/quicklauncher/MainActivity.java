package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button secondActivity;
    Button googleBtn;

    String google;
    Uri webaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondActivity = (Button) findViewById(R.id.secondActivityBtn);
        googleBtn = (Button) findViewById(R.id.googleBtn);
        google = "https://www.gamestop.com";
    }


    public void GoToNextActivity(View view){
        Intent startIntent = new Intent(MainActivity.this, SecondActivity.class);
        startIntent.putExtra("Something", "Hello World!");
        startActivity(startIntent);
    }

    //Attempt to launch an activity outside our app
    public void GoToGoogleApp(View view){
        //Parsing Web Address
        webaddress = Uri.parse(google);

        Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);

        //checks if there is an app that can do this request
        if (gotoGoogle.resolveActivity(getPackageManager()) != null){
            startActivity(gotoGoogle);
        }

    }


}
