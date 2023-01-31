package com.itproger.arrays;

import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {

        int array[] = new int[4];

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("George");
        names.add("John");

        names.add(1, "Alex");

        for (String string : names) {
            System.out.println(string);
        }
    }
}
