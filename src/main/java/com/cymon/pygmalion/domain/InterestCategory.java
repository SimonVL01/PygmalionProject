package com.cymon.pygmalion.domain;

import javax.persistence.Entity;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Entity
public class InterestCategory {

//State

    private String name;

    private int InterestLevel;

//Constructor

    public InterestCategory(String name, int interestLevel) {
        this.name = name;
        InterestLevel = interestLevel;
    }

//Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInterestLevel() {
        return InterestLevel;
    }

    public void setInterestLevel(int interestLevel) {
        InterestLevel = interestLevel;
    }
}
