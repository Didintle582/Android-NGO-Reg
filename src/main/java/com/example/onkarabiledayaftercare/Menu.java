package com.example.onkarabiledayaftercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnAnn = (Button)findViewById(R.id.btnAnn);
        Button btnEvents = (Button)findViewById(R.id.btnEvents);
        Button btnReports = (Button) findViewById(R.id.btnReports);
        Button btnfinancial = (Button) findViewById(R.id.btnFinancial);

        btnAnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu.this, Announcements.class);
                startActivity(in);
            }
        });

        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new  Intent(Menu.this, Events.class);
                startActivity(in);
            }
        });

        btnfinancial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu.this, Financial.class);
                startActivity(in);
            }
        });

        btnReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Menu.this,Reports.class);
                startActivity(in);
            }
        });
    }
}
