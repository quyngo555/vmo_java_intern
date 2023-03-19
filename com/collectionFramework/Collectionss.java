package com.collectionFramework;

import java.util.*;


public class Collectionss {
    public static void Main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        // Adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);
        // Adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");
        System.out.println(arr[0]); // 1
        System.out.println(v.elementAt(0)); //1
        System.out.println(h.get(1));// geeks

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

        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr1 = hs.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        /*
        * Very helpful
          Geeks
          For
          Is*/

        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr2 = lhs.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }


    public static void addAll(List<String> items, String fruits, String bat, String ball) {
    }
}
