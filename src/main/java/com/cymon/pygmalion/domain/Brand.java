package com.cymon.pygmalion.domain;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class Brand {

//State

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String image;

    //@Column(nullable = false)
    private String fullname;

    private String companyname;

    private String companyurl;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private List<User> targetAudience = new ArrayList<>();

//Constructors

    public Brand(String fullname, String image, String companyname, String companyurl, List<User> targetAudience) {
        this.fullname = fullname;
        this.image = image;
        this.companyname = companyname;
        this.companyurl = companyurl;
        this.targetAudience = targetAudience;
    }

    public Brand() {}

    //Getters & Setters

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyName) {
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

    public List<User> getTargetAudience() {

        return targetAudience;
    }

    public User updateTargetAudience(int indexNumber, User u) {

        return targetAudience.set(indexNumber, u);
    }

    public void setTargetAudience(User targetUser) {
        targetAudience.add(targetUser);
    }

    public Integer getId() {
        return id;
    }

}
