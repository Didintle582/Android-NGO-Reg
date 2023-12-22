package com.example.onkarabiledayaftercare;

public class ParentLoginDetails
{
        String username,password;

    public ParentLoginDetails(String password,String username)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


