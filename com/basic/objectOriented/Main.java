package com.basic.objectOriented;

public class Main {
    public static void main(String[] args) {
        Rectangular hcn = new Rectangular();
        hcn.soCanh = 4;
        hcn.tenHinh = "Hinh Chu Nhat";
        hcn.b = 7;
        // hcn.a cannot access field private
        hcn.paint();

        Shape circle = new Circle();
        circle.inKq();

    }
}
