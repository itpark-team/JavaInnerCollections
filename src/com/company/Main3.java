package com.company;

import java.util.HashMap;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Иван",15);
        students.put("Коля",18);
        students.put("Михал",44);
        Integer resultPut = students.putIfAbsent("Иван1",45);

        System.out.println(resultPut);


        System.out.println(students.get("Иван1"));
        students.remove("Иван");
        System.out.println(students.containsKey("Иван"));

        /*Object[] keys = students.keySet().toArray();

        for (int i = 0; i < keys.length; i++) {
            System.out.println((String) keys[i]);
        }*/
    }
}
