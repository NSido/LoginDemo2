package com.example.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yourButton =  findViewById(R.id.button);

        yourButton.setOnClickListener(new OnClickListener(){
            public void onClick (View v){
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        Button yourButton2 =  findViewById(R.id.button2);

        yourButton2.setOnClickListener(new OnClickListener(){
            public void onClick (View v){
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });


    }
}
