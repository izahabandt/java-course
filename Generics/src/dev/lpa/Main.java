package dev.lpa;

public class Main {

    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();

        Printer<Double> doublePprinter = new Printer<>(23.5);
        doublePprinter.print();

        Printer<String> stringPprinter = new Printer<>("twenty three");
        stringPprinter.print();

        shout("aa", "aaaa");
    }

    private static <T, V> void shout (T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!!!!!");
        System.out.println(otherThingToShout + "!!!!!!!");
    }
}


