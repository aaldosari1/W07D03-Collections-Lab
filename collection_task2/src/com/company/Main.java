package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.offer("George");
        queue1.offer("Jim");
        queue1.offer("John");
        queue1.offer("Blake");
        queue1.offer("Kevin");
        queue1.offer("Michael");

        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");

        Iterator<String> iterator1 = queue1.iterator();
        Iterator<String> iterator2 = queue2.iterator();

        System.out.println("The union between the two PriorityQueues is:");
        for (String element : queue1) { //source https://www.w3resource.com/java-exercises/collection/java-collection-priority-queue-exercise-7.php
            System.out.println(element);
        }
        for (String element : queue2) {

            if (!queue1.contains(element))
                System.out.println(element);
        }

        System.out.println("\nThe Difference 'queue2-queue1'  is: ");
        for (String element : queue2) {

            if (!(queue1.contains(element)))
                System.out.println(element);
        }

        System.out.println("\nThe Difference 'queue1-queue2'  is: ");
        for (String element : queue1) {

            if (!(queue2.contains(element)))
                System.out.println(element);
        }

        System.out.println("\nThe intersection between the two PriorityQueues is:");
        for (String element : queue1) {

            if (queue2.contains(element))
                System.out.println(element);
        }

    }

}

