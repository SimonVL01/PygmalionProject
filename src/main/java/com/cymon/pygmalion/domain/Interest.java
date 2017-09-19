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

    private int Interestlevel;

//Category

    public Interest(int Interestlevel) {
        this.Interestlevel = Interestlevel;
    }

//Getters & Setters

    public int getInterestlevel() {
        return Interestlevel;
    }

    public void setInterestlevel(int interestlevel) {
        Interestlevel = interestlevel;
    }
}
