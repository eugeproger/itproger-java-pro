package com.itproger.arrays;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        int array[] = new int[4];

        ArrayList<Integer> arrayDynamic = new ArrayList<>();
        arrayDynamic.add(56);
        arrayDynamic.add(6);
        arrayDynamic.add(5);
        arrayDynamic.add(7);
        arrayDynamic.add(435);
        arrayDynamic.add(8);

        //arrayDynamic.clear();

        arrayDynamic.remove(1);

        System.out.println("Size = " + arrayDynamic.size());

        for(Integer integer : arrayDynamic) {
            System.out.println(integer);
        }
    }
}
