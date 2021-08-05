package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 6};
        //int[] temp = Arrays.copyOfRange(arr,1,arr.length);

        int[] temp = Arrays.copyOf(arr, 4);
        temp[temp.length - 1] = 1;

        Arrays.sort(temp);
        int index = Arrays.binarySearch(temp, 4);

        int[] temp2 = temp.clone();
        temp2[0]=999;

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

        System.out.println(index);

        System.out.println("====");

        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i]);
        }
    }
}
