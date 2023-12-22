package com.example.onkarabiledayaftercare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParentRegister extends AppCompatActivity {

    private Dictionary ParentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_register);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnAddParent = (Button) findViewById(R.id.btnAddParent);

        final EditText txtUsername = (EditText)findViewById(R.id.txtUsernameP);
        final EditText txtPasswordP = (EditText) findViewById(R.id.txtPasswordP);


        final List<ParentLoginDetails> ParentList = new ArrayList<>();

        btnAddParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //myRef.setValue("Test");

                for(int i=0; i<ParentList.size(); i++)
                {
                    String username = txtUsername.getText().toString();
                    String password = txtPasswordP.getText().toString();

                    ParentLoginDetails parentLoginDetails = new ParentLoginDetails(username,password);

                    ParentList.add(parentLoginDetails);
                }
            }
        });
    }
    public void saveToDB(List<ParentLoginDetails> parentList)
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference Par = database.getReference("Parents");

        Map<String, Object> hashMap = new HashMap<>();

        for(int i=0; i<ParentList.size();i++)
        {
            int number=i+1;
            hashMap.put("Parent "+number+"/username",ParentList.get(i));
            hashMap.put("Parent "+number+"/password",ParentList.get(i));

        }
    }
}
