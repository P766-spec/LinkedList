package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class LLUsingCollectionFrameworks {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ->");

        }
        System.out.println("null");

        //list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);  // to remove an index positioned  string/element
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        Collections.reverse(list2);
        System.out.println(list2);
     }
}
