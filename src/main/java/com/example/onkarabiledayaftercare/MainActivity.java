package com.example.onkarabiledayaftercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNo = (Button)findViewById(R.id.btnNo);
        Button btnAdmin = (Button) findViewById(R.id.btnAdmin);
        Button btnParent = (Button) findViewById(R.id.btnParent);

        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(MainActivity.this, Admin.class);
                startActivity(in);
            }
        });


        btnParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Parent.class);
                startActivity(in);
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Register.class);
                startActivity(in);
            }
        });


    }
}
