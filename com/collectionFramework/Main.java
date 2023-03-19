package com.collectionFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Traversing Lists and Custom Types
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Toyota", "Camry", 12000));
        vehicles.add(new Vehicle("Honda", "Camry", 12000));
        vehicles.add(new Vehicle("Mecedes", "AMG", 12000));
        for(Vehicle car: vehicles){
            System.out.print(car);
        }


        // linked hashset
        LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>();

        // using add() to initialize values
        // [1, 2, 3, 4]
        LHS.add(1);
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);

        // print LinkedHashSet
        System.out.println("LinkedHashSet: " + LHS); // LinkedHashSet: [1, 2, 3, 4]

        // Get the hashCode value
        // using hashCode() value
        System.out.println("HashCode value: "+ LHS.hashCode());// HashCode value: 10

        // creating an HashSet
        HashSet<Integer> arr
                = new HashSet<Integer>();

        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // print HashSet
        System.out.println("HashSet: "+ arr);// HashSet: [1, 2, 3, 4]

        // Get the hashCode value
        // using hashCode() value
        System.out.println("HashCode value: "+ arr.hashCode()); // HashCode value: 10

        //Collections method
        List<String> items = new ArrayList<>();
        // Adding elements (items) to the list
        items.add("Shoes");
        items.add("Toys");
        // Add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Ball");

        // Printing the list contents
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");// Shoes Toys Fruits Bat Ball
        }

        // Sorting according to default ordering
        // using sort() method
        Collections.sort(items);
        // Printing the elements
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println();// Ball Bat Fruits Shoes Toys

        // Sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());

        // Printing the reverse order
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " "); // Toys Shoes Fruits Bat Ball
        }

        //Comparable
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));

        Collections.sort(listStudents);
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

        // start hashMap
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.size()); // 4
        System.out.println(capitalCities);// {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
        System.out.println(capitalCities.get("England"));// London
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i); // usa, norway, england, germany
        }
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i); // Washington DC Oslo London Berlin
        }
        capitalCities.remove("England");
        System.out.println(capitalCities); // {USA=Washington DC, Norway=Oslo, Germany=Berlin}
        capitalCities.clear(); //
        System.out.println(capitalCities);// {}
        // end hashMap

        // linkedHashMap
        // Creating an empty LinkedHashMap
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        // Adding entries in Map
        // using put() method
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "www.geeksforgeeks.org");

        // Printing all entries inside Map
        System.out.println(lhm);// {one=practice.geeksforgeeks.org, two=code.geeksforgeeks.org, four=www.geeksforgeeks.org}
        // Getting and printing value for a specific key
        System.out.println("Getting value for key 'one': " + lhm.get("one")); // Getting value for key 'one': practice.geeksforgeeks.org
        // Getting size of Map using size() method
        System.out.println("Size of the map: " + lhm.size()); // Size of the map: 3
        // Checking whether Map is empty or not
        System.out.println("Is map empty? "+ lhm.isEmpty());// Is map empty? false
        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? " + lhm.containsKey("two"));//Contains key 'two'? true
        // Using containsKey() method to check for a value
        System.out.println(
                "Contains value 'practice.geeks"
                        + "forgeeks.org'? "
                        + lhm.containsValue("practice"
                        + ".geeksforgeeks.org")); // Contains value 'practice.geeksforgeeks.org'? true
        // Removing entry using remove() method
        System.out.println("delete element 'one': "+ lhm.remove("one"));// delete element 'one': practice.geeksforgeeks.org
        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : "+ lhm);// Mappings of LinkedHashMap : {two=code.geeksforgeeks.org, four=www.geeksforgeeks.org}
        // end linkedhashMap



    }
}
