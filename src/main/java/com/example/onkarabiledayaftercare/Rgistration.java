package com.example.onkarabiledayaftercare;

import android.app.Application;

public class Rgistration  {

    String name,surname,email,cell,ID,childiD,Child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setChildiD(String childiD) {
        this.childiD = childiD;
    }

    public void setChild(String child) {
        Child = child;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCell() {
        return cell;
    }

    public String getID() {
        return ID;
    }

    public String getChildiD() {
        return childiD;
    }

    public String getChild() {
        return Child;
    }

    public Rgistration(String child, String Surname, String Name, String Email, String Cell, String Id, String Chlidid)
    {
        Child = child;
        name = Name;
        email = Email;
        cell= Cell;
        childiD= Chlidid;
        surname = Surname;
        ID = Id;


    }
}
