public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Graham bun");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = super.itemizeHamburger() + this.healthyExtra1Price+ this.healthyExtra2Price;
        System.out.println("One order of Healthy Burger on Graham Bun with "+ healthyExtra1Name + " " +
                healthyExtra2Name + ". " + totalPrice + " in total. ");
        return totalPrice;
    }
}
