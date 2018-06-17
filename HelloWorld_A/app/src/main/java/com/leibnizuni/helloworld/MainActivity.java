package com.leibnizuni.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView decodeMeTV = (TextView)findViewById(R.id.decodMeTextView);
        Button decodeMeBTN = (Button)findViewById(R.id.decodeMeButton);

        decodeMeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decodeMeTV.setText("I am a useless application");
            }
        });


    }
}
