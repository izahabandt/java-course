package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[2] = 3.5;
//        System.out.println(myDoubleArray[2]);
//
//        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("first = " + firstTen[0]);
//        int arrayLenght = firstTen.length;
//        System.out.println("length of array = " + arrayLenght);
//
//        int[] newArray;
//        newArray = new int[5];
//        for (int i = 0; i < newArray.length; i++){
//            newArray[i] = newArray.length - i;
//        }
//        for(int i =0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + "");
//        }
//        System.out.println();
//        for(int element : newArray){
//            System.out.print(element + "");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(newArray));
//        Object objectVariable = newArray;
//        if (objectVariable instanceof int[]){
//            System.out.println("objectVariable is really an int array");


            int[] arr = new int [3];
            arr[2]=5;
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr.length);
            System.out.println(Arrays.toString(arr));
        }
    }
//}
