package com.zzazz.inheritancetest2;


public class Cylinder extends Cirle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * length;
    }
}
