package com.example.onkarabiledayaftercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Parent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        Button btnLogin2 = (Button) findViewById(R.id.btnLogin2);
        Button btnCredentials = (Button) findViewById(R.id.btnCredentials);

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Parent.this, Menu.class);
                startActivity(in);
            }
        });

        btnCredentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Parent.this, ParentRegister.class);
            }
        });
    }
}
