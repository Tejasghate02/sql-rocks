package com.example.sql_rocks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {

    @Id
    @Column(unique = true)
    private int id;

    @Column(unique = true)
    private String email;
    private  String name;
    private  String age;
    private String mobileNumber;

    @Column(name="country_name")
    private String country;

    public User(){

    }

    public User(int id, String name, String age,String mobileNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber=mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
