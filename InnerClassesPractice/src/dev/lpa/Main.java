package dev.lpa;

public class Main {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.heyThere();

        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.whatsUp();
    }
}
