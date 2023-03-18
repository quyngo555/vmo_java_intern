package com.internJava;

public class MethodVisibility1 {

    String a = "hello";
    static String b = "hello world";
    public void getName(String name){
        System.out.print("hello " + name);
    }
    private void getAge(int name, int age){
        System.out.println(name + " is "  + age + " old.");
    }
    void getHomeTown(String homeTown){
        System.out.println("Hometown " + homeTown);
    }
    protected void getAddress(String address){
        System.out.println("Address " + address);
    }

    public static void main(String[] args) {
        System.out.println(MethodVisibility1.b); // hello world
        MethodVisibility1 methodVisibility1 = new MethodVisibility1();
        System.out.println(methodVisibility1.a);// hello
    }
}
