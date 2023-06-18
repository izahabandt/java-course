package dev.lpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<String> names =new HashSet<>();

        names.add("Jerry");
        names.add("George");
        names.add("Kramer");
        names.add("Elaine");

        System.out.println(names);
        System.out.println(names.contains("Elaine"));

//        names.isEmpty();
//        names.clear();
//        names.remove("Jerry");

        String [] namesArray = names.toArray(new String[0]);
        System.out.println(Arrays.toString(namesArray));

        String[] cars = {"Toyota", "Honda", "Chevrolet", "Chrysler"};
        Set<String> carsSet = new HashSet<>(Arrays.asList(cars));

        System.out.println(carsSet);
    }
}
