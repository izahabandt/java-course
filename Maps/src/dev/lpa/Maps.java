package dev.lpa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(1111, "John");
        employees.put(2222, "George");
        employees.put(3333, "Kramer");
        employees.put(4444, null);//you can have only one null as a key, multiple nulls as a value


        employees.put(4444, "Jerry"); //overrides Newman
        // employees.replace(1111, "Morty");
        // employees.putIfAbsent(1111, "Morty");
        // employees.remove(1111, "Morty");

        //employees.keySet(); returns all keys

        //  System.out.println(employees.containsKey(22222));

        for(Integer employeeId : employees.keySet()){
        System.out.println(employeeId);
        }

        for(Integer employeeId : employees.keySet()) {//to check what id Kramer has
            if ("Kramer".equals(employees.get(employeeId))) {
                System.out.println("Kramer's employee ID is " + employeeId);

            }

        Map<Integer, String> employees2 = new LinkedHashMap<>();// ordered map

        employees2.put(1111, "John");
        employees2.put(2222, "George");
        employees2.put(3333, "Kramer");
        employees2.put(4444, null);

                System.out.println(employees2);
            }

        //    Map<Integer, String> employees2 = new TreeMap<>();// map ordered by the key
        }
    }

        // System.out.println(employees);// hashMap doesn't guarantee order, doesn't have duplicate keys, but can duplicate values

        //System.out.println(employees.containsKey(1111));
        //System.out.println(employees.containsValue("John"));


