package com.cymon.pygmalion.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class User {

//Object state

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column (nullable = false)
    private String firstname;

    //@Column (nullable = false)
    private String lastname;

    private int age;
    private String gender = "Not defined";

//Dependencies

    @ManyToMany
    @JoinTable/*(
            name = "Interest",
            joinColumns = @JoinColumn(name = "Iinterest_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )*/
    private List<Interest> interest;

    @ManyToOne
    private User followed;

    @OneToMany(mappedBy = "followed")
    private List<User> follower;

    //@OneToMany
    //private List<WebDevice> webDevice;

//Constructors

    public User(String firstName, String lastName, int age, String gender) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.age = age;
        this.gender = gender;
        //this.webDevice = webDevice;
    }

    public User() {}

//Getters & Setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "Male" || gender == "Female")
        this.gender = gender;
    }

    public List<Interest> getInterest() {
        return interest;
    }

    public void setInterest(List<Interest> interest) {
        this.interest = interest;
    }

    public void addInterest(int i, Interest interest) {
        this.interest.add(interest);
    }

    public void deleteInterest(int i) {
        this.interest.remove(i);
    }

    public Integer getId() {
        return id;
    }

    /*public List<WebDevice> getWebDevice() {
        return webDevice;
    }*/

    /*public void setWebDevice(List<WebDevice> webDevice) {
        this.webDevice = webDevice;
    }*/

//Other Methods


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }
}