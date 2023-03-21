package com.basic.objectOriented;

public abstract class Shape {
    String tenHinh;
    int soCanh;
    public abstract void nhap();
    public void inKq(){
        System.out.println("shape");
    };

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }
}
