package datastructure;


import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    //use_array_list arraylist naming convention

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(25);
        arrayList.add(56);
        arrayList.add(25);
        arrayList.add(12);
        arrayList.add(10);
        arrayList.add(21);
        arrayList.add(9);
        System.out.println((arrayList));

        arrayList.remove(3); // remove elements


        for(Object num : arrayList){ // this is for each loop
            System.out.println((num));

            Iterator iterator = arrayList.iterator(); // use Iterator
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
    }



    }


}



