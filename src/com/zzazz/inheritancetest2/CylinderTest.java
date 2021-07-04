package com.zzazz.inheritancetest2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(23);
        double mianji = cylinder.findVolume();
        System.out.println(mianji);
    }
}
