package com.Method;

public class MethodVisibility {

    String a = "hello";
    static String b = "hello world";
    public void getName(String name){
        System.out.print("hello " + name);
    }
    private void getAge(int name, int age){
        System.out.println(name + " is "  + age + " old.");
    }
    void getHomeTown(String homeTown){
        System.out.println("Hometown: " + homeTown);
    }
    protected void getAddress(String address){
        System.out.println("Address: " + address);
    }
}
