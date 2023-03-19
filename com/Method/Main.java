package com.Method;

public class Main {
    public static void main(String[] args) {
        // Static field sample
        // b is static field, not need to create instance before accessing
        System.out.println(MethodVisibility.b); // hello world
        MethodVisibility methodVisibility = new MethodVisibility();
        // a is not field, need to create instance before accessing
        System.out.println(methodVisibility.a);// hello
        // Static field sample end

        // Call to public method
        methodVisibility = new MethodVisibility();
        methodVisibility.getName("tuan"); // hello tuan
        methodVisibility.getAddress("Hanoi"); // Address Hanoi
        methodVisibility.getHomeTown("thanh hoa"); // Hometown thanh hoa
        // getAge is private, can not call
//        methodVisibility1.getAge("tuan", 18); Compile Time Error
    }
}
