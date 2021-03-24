package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        Queue<String> queue = new LinkedList<>();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        queue.add("Six");

        queue.poll(); // use pool

        for (String name : queue) { // for each loop
            System.out.println(name);
        }
        Iterator iterator = queue.iterator(); // use iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

