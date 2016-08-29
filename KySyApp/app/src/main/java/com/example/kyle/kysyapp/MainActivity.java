package com.example.kyle.kysyapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button syedButton = (Button) findViewById(R.id.Syed_Button);
        syedButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Syed pities da fool", Toast.LENGTH_LONG).show();
    }
}
