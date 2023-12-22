package com.example.onkarabiledayaftercare;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class Firebasehelper {
    DatabaseReference db;
    Boolean save;
    ArrayList<Rgistration> Registration = new ArrayList<>();

    public Firebasehelper(DatabaseReference db) {
        this.db = db;
    }

    public Boolean save(Rgistration Registration) {
        if (Registration == null) {
            save = false;
        } else {
            try {
                db.child("Details").push().setValue(Registration);
                save = true;
            }catch (DatabaseException e){
                e.printStackTrace();
                save = false;
            }
           }return save;
        }

}

