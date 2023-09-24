public class Hamburger {


    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + this.addition1Name + " for an extra "
                + this.addition1Price);
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + this.addition2Name + " for an extra "
                + this.addition2Price);
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + this.addition3Name + " for an extra "
                + this.addition3Price);
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + this.addition2Name + " for an extra "
                + this.addition2Price);
    }

    public double itemizeHamburger(){
        double totalPrice = price + this.addition1Price+ this.addition2Price + this.addition3Price + this.addition4Price;
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name +
                " " + addition2Name + " " + addition3Name + " " + addition4Name + ". " + totalPrice + " in total. ");
        return totalPrice;
    }
}
