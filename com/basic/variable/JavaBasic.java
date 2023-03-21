package com.basic.variable;

import java.util.Arrays;

public class JavaBasic {

    public static float PI = 3.14f;   // Đây là biến static
    int n;                            // Đây là biến instance
    public void Bien () {
        char c = 'c';                 // Đây là biến local
    }
    // end variable
    public static void main(String[] args) {
        // start datatype
        // primitive datatype
        byte byte1 = 0; // -128 -> 127
        short short1 = 0; // -32,768 -> 32,767
        int int1 = 0; // -2,147,483,648 -> 2,147,483,647
        long long1 = 0L; // -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,807
        float float1 = 0.0f; // lưu 6 -> 7 số thập phân
        double double1 = 0.0d; // lưu tới 15 số thập phân
        boolean boolean1 = false; // true or false
        char char1 = '\u0000';// chứa 1 kí tự ascii value


        String[] cars = { "Honda", "BMW", "Ford", "Mazda" };
        int[] myNum = { 40, 30, 20, 10 };
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };// mảng 2 chiều 3 hàng 3 cột và được gắn giá trị
        int arr2[][] = new int[3][3]; // mảng 2 chiều 3 hàng 3 cột
        int []nums = new int [5]; // khai báo mảng số nguyên có 5 phần tử và có giá trị mặc định là 0
        System.out.println(nums[0]); // 0
        System.out.println(cars[0]); // Honda
        myNum[0] = 50;
        System.out.println("Phần tử của mảng sau khi thay đổi là: " + myNum[0]); // 50
        // để lấy độ dài của mảng ta sử dụng thuộc tính length
        System.out.println("Độ dài của mảng cars là: " + cars.length); // 4

        // sử dụng vòng lặp for
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // sử dụng forEach
        for (String car : cars) {
            System.out.println(car);
        }
        // so sánh for với forEach: phương thức foreach dễ viết hơn, nó không yêu cầu bộ đếm (sử dụng thuộc tính length) và nó dễ đọc hơn.
        // có nhiều phương thức sắp xếp mảng có sẵn
        Arrays.sort(myNum); // sử dụng phương thức sort
        for(int i: myNum){
            System.out.print(i + " "); // 10 20 30 50
        }
        // sao chép mảng sử dụng hàm arraycopy có sẵn, ngoài ra còn nhều phương thức khác
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f',
                'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));// caffein

        // end working array

        // start if else
        boolean condition = true;

        boolean condition1, condition2, condition3;
        condition1 = condition2 = condition3 = true;
        if (condition1) {
            // khối lệnh này được thực thi
            // nếu condition1 là true
        } else if (condition2) {
            // khối lệnh này được thực thi
            // nếu condition2 là true
        }  else if (condition3) {
            // khối lệnh này được thực thi
            // nếu condition3 là true
        }else {
            // khối lệnh này được thực thi
            // nếu tất cả những điều kiện trên là false
        }
        // end if else
       // Start switch case
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        } // 20 30 Not in 10, 20 or 30

    }
}
