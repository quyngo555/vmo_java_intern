package com.collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);

        // Getting values from the tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA); // Value of A: 1

        // Removing elements from the tree map
        treeMap.remove("B");

        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));//
        }
        /*
        * Key: A, Value: 1
          Key: C, Value: 3*/
        // end treeMap
    }
}
