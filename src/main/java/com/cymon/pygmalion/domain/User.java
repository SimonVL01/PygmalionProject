package com.cymon.pygmalion.domain;

import javax.persistence.*;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class User {

//Object state

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    //@Column (nullable = false)
    private String firstname;

    //@Column (nullable = false)
    private String lastname;

    private int age;
    private String gender = "Not defined";

//Constructors

    public User(String firstName, String lastName, int age, String gender) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.age = age;
        this.gender = gender;
    }

    public User() {}

    //Getters & Setters

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public int getAgeGroup() {
        return age;
    }

    public void setAgeGroup(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "Male" || gender == "Female")
        this.gender = gender;
    }

    public Integer getId() {
        return Id;
    }
}
