package com.company;

import java.util.HashSet;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        boolean addResult;

        HashSet<Integer> numbers = new HashSet<>();

        for (int k = 0; k < 10; k++) {
            do {
                number = random.nextInt(100);
                addResult = numbers.add(number);
            }while (addResult == false);
        }

        /*Object[] numbersInInt = numbers.toArray();

        for (int i = 0; i < numbersInInt.length; i++) {
            System.out.println((int)numbersInInt[i]);
        }*/
    }
}
