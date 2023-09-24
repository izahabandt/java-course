package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jerry");
        names.add("George");
        names.add("Kramer");
        names.add("Elaine");
//        names.add(3, "John");
//
//        System.out.println(names);
//        System.out.println(names.get(3));
//
//        names.remove(1);
//        names.remove("John");//removes the first one that it finds
//        System.out.println(names);
//
//        System.out.println(names.size());
//        System.out.println(names.contains("George"));
//        System.out.println(names.isEmpty());
//
//        names.clear();
//        System.out.println(names);

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        Collections.shuffle(names);

        System.out.println(names);

        Collections.reverse(names);

        System.out.println(names);

        String[] namesArray = names.toArray(new String[0]);//gives an array of objects

        System.out.println(Arrays.toString(namesArray));

        String[] cars = {"Toyota", "Honda", "Chevrolet", "Chrysler"};

        List<String> carsList = Arrays.asList(cars);//nie mozemy dodawac ani odejmowac, zeby moc, robi sie tak jak nizej:
        List<String> carsList = new ArrayList<>(Arrays.asList(cars));
    }
}
