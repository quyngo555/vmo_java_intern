package com.advance.functional;

public class Main {
    public static String getStr(String input, StringProcessor processor){
        return processor.process(input);
    }

    public static void main(String[] args) {
        // In ra chữ hoa
        System.out.println(getStr("Hello VMO!", new StringProcessor() {
            @Override
            public String process(String input) {
                return input.toUpperCase();
            }
        }));
        // In ra chữ thường
        System.out.println(getStr("Hello VMO!", new StringProcessor() {
            @Override
            public String process(String input) {
                return input.toLowerCase();
            }
        }));

        // Lambda Expressions
        System.out.println(getStr("Hello VMO!", input -> {
            String temp =  input + " Welcome!!!";
            return temp.toLowerCase();
        }));
    }
}
