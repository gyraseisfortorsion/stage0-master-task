package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x==0 && y==0) System.out.println("zero");
        if (x>0){
            if (y>0)  System.out.println("first");
            else System.out.println("second");
        }
        else{
            if (y>0)  System.out.println("fourth");
            else System.out.println("third");
        }
    }

}

