package com.cymon.pygmalion.repositories.dto;

public class AgesByFrequency {
    private int age;
    private long frequency;

    public AgesByFrequency(int age, long frequency) {
        this.age = age;
        this.frequency = frequency;
    }

    public int getAge() {
        return age;
    }

    public long getFrequency() {
        return frequency;
    }
}
