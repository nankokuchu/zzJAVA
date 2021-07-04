package com.zzzazz.inheritancetest;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }


    public Kids() {
    }

    public void printAge(){
        System.out.println(yearsOld);
    }
}
