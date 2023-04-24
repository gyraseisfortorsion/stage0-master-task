package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }

    public String getDescription(){
        String hasF="";
        String res;
        if (hasFur) hasF="a";
        else hasF="no";
        if (numberOfPaws>1){
            res="This animal is mostly "+color+". It has "+numberOfPaws+" paws and " + hasF + " fur.";
        }
        else res="This animal is mostly "+color+". It has "+numberOfPaws+" paw and " + hasF + " fur.";

        return res;
    }
}
