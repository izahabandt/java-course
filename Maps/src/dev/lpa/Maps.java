package dev.lpa;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(1111, "John");
        employees.put(2222, "George");
        employees.put(3333, "Kramer");
        employees.put(4444, "Newman");


        employees.put(4444, "Jerry"); //overrides Newman
        // employees.replace(1111, "Morty");
        // employees.putIfAbsent(1111, "Morty");
        // employees.remove(1111, "Morty");

        System.out.println(employees);// hashMap doesn't guarantee order, doesn't have duplicate keys, but can duplicate values

        System.out.println(employees.containsKey(1111));
        System.out.println(employees.containsValue("John"));
    }
}
