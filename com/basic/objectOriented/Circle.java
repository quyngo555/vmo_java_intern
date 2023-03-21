package com.basic.objectOriented;

public class Circle extends Shape{
    int a, b, c;
    @Override
    public void nhap() {

    }

    @Override
    public void inKq() {
        System.out.println("circle");
    }

    public Circle() {
    }

    public Circle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
