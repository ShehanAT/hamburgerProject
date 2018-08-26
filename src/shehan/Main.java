package shehan;

public class Main {


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","White","Sausage",5.00);
        hamburger.addHambugerAddition1("water",5.00);
        hamburger.addHambugerAddition2("pop",4.00);
        hamburger.addHambugerAddition3("google", 6.0);
        double price = hamburger.itemizeHamburger();
        System.out.println("The total price for " +hamburger.getName()+" Hamburger is "+ price);

        HealthyBurger health = new HealthyBurger("Chicken",5);
        health.addHealthyAddition1("Chips",5.00);
        health.addHealthyAddition2("what", 7.00);
        double healthyPrice = health.itemizeHamburger();
        System.out.println("The total price for " + health.getName() + " Hamburger is " + healthyPrice);

    }
}
