package com.objectOriented;

public class Car extends Vehicle {
    private String modelName = "Mustang";
    int weight = 1000;
    String name;
    String engine;
    String color;

    public Car(String name, String engine, String color) {
        this.name = name;
        this.engine = engine;
        this.color = color;
    }

    public Car() {
    }


    public static void main(String[] args) {
        Car volvo = new Car("volvo", "v8", "blue");
        Car audi = new Car("audi", "v8", "blue");
        Car toyota = new Car("toyota", "v8", "blue");
        System.out.println(volvo.weight ); // 1000

        int a = 1000; // a được lưu trong bộ nhớ stack
        int [] b = {1, 2, 3, 4, 5};
        int []c = new int [4];
        c = b;
        System.out.println(c[0]); // 1
        c[0] = 10;
        System.out.println(b[0]); // 10

        // kế thừa
        Car myCar = new Car();
        myCar.honk();// Tuut, tuut!
        System.out.println(myCar.brand + " " + myCar.modelName); // Ford Mustang


        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound(); // The pig says: wee wee
        myPig.sleep(); // Zzz
    }
}
