package com.company;

import java.util.LinkedList;

public class Main5 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(15);
        numbers.add(18);
        numbers.add(21);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
