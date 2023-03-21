package com.basic.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //list interface: arrayList, LinkedList, Vector
        //arraylist
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) // add element to al
            al.add(i);
        System.out.println(al);//[1, 2, 3, 4,5]
        // Remove element at index 3
        al.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(al);//[1 2 3 5]

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");//  1 2 3 5

        // Declaring the LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);
        // Printing elements
        System.out.println(ll);//[1, 2, 3, 4, 5]

        // Remove element at index 3
        ll.remove(3);

        // Displaying the List
        // after deletion
        System.out.println(ll);//[1, 2, 3, 5]

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");//1 2 3 5

        Vector<Integer> v = new Vector(); // khởi tạo vector, có các method tương tự arraylist
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");
        // end list interface

        //queues interface
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");
        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");//Geeks For Geeks Geeks
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");//Geeks For Geeks
        }

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());// 10

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());//10

        // Printing the top element again
        System.out.println(pQueue.peek());//15

        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);//[10, 20, 30, 40, 50]

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);//[291, 564, 24, 14]


        // set interface: HashSet, linkeHashSet, treeSet
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");
        Iterator<String> itr1 = hs.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");


        Iterator<String> itr2 = lhs.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        Set<String> set = new TreeSet<>(); // treeSet cũng có các method tương tự để thêm , sửa dữ liệu
        // end set interface

        // Creating an empty HashMap
        System.out.println();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        Set<String> keys = hm.keySet();
        keys.forEach(key ->{
            System.out.println(key + ": " + hm.get(key));
        });

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
