package shehan;

public class Main {


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","White","Sausage",5.00);
        hamburger.addHambugerAddition1("water",5.00);
        hamburger.addHambugerAddition2("pop",4.00);
        hamburger.addHambugerAddition3("google", 6.0);
        double price = hamburger.itemizeHamburger();
        System.out.println("The total price for " +hamburger.getName()+" Hamburger is "+ price);

        HealthyBurger db = new HealthyBurger("Bacon", 5.60);
        double price2 = db.itemizeHamburger();
        db.addHambugerAddition3("Should not do this", 4.00);
        System.out.println(db.itemizeHamburger());

    }
}
