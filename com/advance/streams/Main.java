package com.advance.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5, 4, 3, 2);
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream()
                .filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);
        List<Integer> show = number.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(show);

        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        Set<Integer> squareSet = numbers.stream()
                .map(x->x*x)
                .collect(Collectors.toSet());
        System.out.println(squareSet);
        int even = number.stream()
                .filter(x->x%2==0)
                .reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }
}
