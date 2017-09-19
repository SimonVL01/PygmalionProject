package com.cymon.pygmalion.domain;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class Brand {

//State

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    //@Column(nullable = false)
    private String fullname;

    private String companyname;

    private String companyurl;

    @OneToMany
    private List<User> targetAudience;

//Constructors

    public Brand(String fullname, String companyname, String companyurl) {
        this.fullname = fullname;
        this.companyname = companyname;
        this.companyurl = companyurl;
    }

    public Brand() {}

    //Getters & Setters

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    public String getCompanyName() {
        return companyname;
    }

    public void setCompanyName(String companyName) {
        this.companyname = companyName;
    }

    public String getCompanyUrl() {
        return companyurl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyurl = companyUrl;
    }

    public User getTargetAudience(int indexNumber) {

        return targetAudience.get(indexNumber);
    }

    public User updateTargetAudience(int indexNumber, User u) {

        return targetAudience.set(indexNumber, u);
    }

    public void setTargetAudience(User targetUser) {
        targetAudience.add(targetUser);
    }

    public Integer getId() {
        return Id;
    }

}
