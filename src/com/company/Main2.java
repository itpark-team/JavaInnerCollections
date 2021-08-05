package com.company;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(15);
        arr.add(18);

        //arr.add(0,999);

        arr.remove(1);

        int size =  arr.size();
        for (int i = 0; i < size; i++) {
            System.out.println(arr.get(i));
        }
    }
}
