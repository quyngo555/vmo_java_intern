package com.basic.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }
    public static void printOnlyIntegerClassorSuperClass(
            List<? super Integer> list)
    {
        System.out.println(list);
    }

    private static void printlist(List<?> list)
    {

        System.out.println(list);
    }
    public static void main(String[] args) {
        // generic
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
//        list.add(true); các kiểu khác ngoài Integer không hợp lệ
        String[] names = new String[] { "Dat", "Khoa", "Tin" };
        // truyền array names vào trong MyArrayGeneric để gắn mảng vào trong nó
        MyArrayGeneric<String> myArrayGeneric = new MyArrayGeneric<String>(names);
        // ta có thể dổi thành các kiểu khác như Double, Integer, ...

        System.out.println("First name: " + myArrayGeneric.getFirstElement());//First name: Dat
        System.out.println("Last name: " + myArrayGeneric.getLastElement());//Last name: Tin
        //end generic

        // Generics with Wildcards
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1)); // Total sum is:22.0

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        // printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list2));// Total sum is:15.299999999999999


        // Lower Bounded Integer List
        List<Integer> list3 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list3); // [4, 5, 6, 7]

        // Number list
        List<Number> list4 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list4);//

        //Unbounded Wildcard
        // Integer List
        List<Integer> list5 = Arrays.asList(1, 2, 3);

        // Double list
        List<Double> list6 = Arrays.asList(1.1, 2.2, 3.3);

        printlist(list5); // [1, 2, 3]

        printlist(list6); // [1.1, 2.2, 3.3]
        // end generic wildcard
    }
}
