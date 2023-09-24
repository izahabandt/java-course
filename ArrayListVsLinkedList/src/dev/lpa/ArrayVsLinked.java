package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinked {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");

        String[] names = new String[4];
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");
    }
}
