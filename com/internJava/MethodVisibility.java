package com.internJava;

public class MethodVisibility  {
    public static void main(String[] args) {
        MethodVisibility1 methodVisibility1 = new MethodVisibility1();
        methodVisibility1.getName("tuan"); // hello tuan
        methodVisibility1.getAddress("Hanoi"); // Address Hanoi
        methodVisibility1.getHomeTown("thanh hoa"); // Hometown thanh hoa
//        methodVisibility1.getAge("tuan", 18); Compile Time Error



    }
}
