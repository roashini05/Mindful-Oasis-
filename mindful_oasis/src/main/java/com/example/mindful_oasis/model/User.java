package com.example.mindful_oasis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String phonenumber;
    public User() {
    }
    public User(int uid,  String email, String password,String firstname,String lastname,String phonenumber) {
        this.uid = uid;
      
        this.email = email;
        this.password = password;
        this.firstname= firstname;
        this.lastname= lastname;
        this.phonenumber= phonenumber;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getfirstname()
    {
        return firstname;
    }
    public void setfirstname(String firstname)
    {
        this.firstname=firstname;
    }

    public String getlastname()
    {
        return lastname;
    }
    public void setlastname(String lastname)
    {
        this.lastname=lastname;
    }


    
}
