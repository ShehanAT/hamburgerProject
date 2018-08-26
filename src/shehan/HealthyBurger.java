package shehan;

public class HealthyBurger extends Hamburger{
    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger(String meatType, double price){
        super("Healthy Burger", "Brown Rye", meatType, price);
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();//calls hamburger.itemizeHamburger(), since all additions = null only base price is returned to health.itemtize
        if(this.healthyAddition1Name != null){
            hamburgerPrice += healthyAddition1Price;
            System.out.println("Added " + healthyAddition1Name + " for an extra "+ healthyAddition1Price);
        }
        if(this.healthyAddition2Name != null){
            hamburgerPrice += healthyAddition2Price;
            System.out.println("Added " + healthyAddition2Name + " for an extra " + healthyAddition2Price);
        }

        return hamburgerPrice;
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;

    }

}
