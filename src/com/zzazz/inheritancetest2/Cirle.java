package com.zzazz.inheritancetest2;

public class Cirle {
    private double radius;

    public Cirle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
