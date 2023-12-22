package com.example.onkarabiledayaftercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText txtName = (EditText) findViewById(R.id.txtName);
        final EditText txtSurname = (EditText) findViewById(R.id.txtSurname);
        final EditText txtCell = (EditText) findViewById(R.id.txtCell);
        final EditText txtChildID = (EditText) findViewById(R.id.txtChildID);





        Button btnregister = (Button) findViewById(R.id.btnRegister);


        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Par = database.getReference("Registration");


                Par.child("Name").setValue(txtName.getText().toString());
                Par.child("Surname").setValue(txtSurname.getText().toString());
                Par.child(" Cell phone").setValue(txtCell.getText().toString());
                Par.child("ID").setValue(txtChildID.getText().toString());

            }
        });

        }
    }

