package dev.lpa;

public class Main {

    public static void main(String[] args) {
        even_or_odd(0);

    }

    public static String even_or_odd(int number) {
//        String isEven = number%2==0 ? "Even" : "Odd";
//        System.out.println(isEven);
        return number%2==0 ? "Even" : "Odd";
    }

}


