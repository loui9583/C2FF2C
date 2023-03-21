package com.example.c2ff2c;

public class Degree {

    private double startDegree;


    public double getStartDegree() {
        return startDegree;
    }

    public void setStartDegree(double startDegree) {
        this.startDegree = startDegree;
    }

    public double getC2F(){
       return (startDegree * 1.8) + 32;
    }


    public double getF2C(){
        return  (startDegree - 32) / 1.8;
    }

}
