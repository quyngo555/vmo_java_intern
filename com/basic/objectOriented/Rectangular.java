package com.basic.objectOriented;

public class Rectangular extends Shape implements Color{
    private int a;
    protected int b;
    @Override
    public void nhap() {

    }

    @Override
    public void inKq() {

    }

    public Rectangular(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangular() {
    }

    @Override
    public void paint() {
        System.out.println("Shape is painted red");
    }
}
