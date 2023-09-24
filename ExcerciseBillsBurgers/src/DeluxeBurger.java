public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("DeluxeBurger", "Bacon and Cheese", 19.10, "Sezame Bun");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    public void addHamburgerAddition1(String name, double price){
        System.out.println("No additional items can be added");
    }
    public void addHamburgerAddition2(String name, double price){
        System.out.println("No additional items can be added");
    }

    public void addHamburgerAddition3(String name, double price){
        System.out.println("No additional items can be added");
    }

    public void addHamburgerAddition4(String name, double price){
        System.out.println("No additional items can be added");
    }
}
