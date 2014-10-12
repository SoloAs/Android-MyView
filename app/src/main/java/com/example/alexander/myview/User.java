package com.example.alexander.myview;

import java.io.Serializable;

/**
 * Created by Alexander on 10/12/2014.
 */
public class User implements Serializable {
    private String name;
    private String phone;
    private int avatar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public User(){
        this.name = "Not set";
        this.phone ="not set";
        this.avatar = R.drawable.ic_launcher;
    }
    public User( String name,String phone, int image){
        this.name = name;
        this.phone = phone;
        this.avatar = image;
    }
}