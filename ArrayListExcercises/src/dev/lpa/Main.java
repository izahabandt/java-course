package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> colorsArrayList = new ArrayList<>();
        colorsArrayList.add("green");
        colorsArrayList.add("blue");
        colorsArrayList.add("yellow");
        colorsArrayList.add("red");
        colorsArrayList.add(0, "pink");
        colorsArrayList.set(3, "pink");

        System.out.println(colorsArrayList);

        colorsArrayList.remove(3);

        System.out.println(colorsArrayList);

        if (colorsArrayList.contains("red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

        Collections.sort(colorsArrayList);
        System.out.println(colorsArrayList);

//        for (String color : colorsArrayList){
//            System.out.println(color);
//        }
    }
}
