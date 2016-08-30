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
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Syed pities da fool", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Goodbye", Toast.LENGTH_LONG).show();

    }
}
