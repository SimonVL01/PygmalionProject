package com.cymon.pygmalion.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class Interest {

//State

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String interest;

    private int interestlevel;

//Category

    public Interest(String interest ,int interestlevel) {
        this.interest = interest;
        this.interestlevel = interestlevel;
    }

//Getters & Setters

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public int getInterestlevel() {
        return interestlevel;
    }

    public void setInterestlevel(int interestlevel) {
        interestlevel = interestlevel;
    }

    public int getId() {
        return id;
    }
}
