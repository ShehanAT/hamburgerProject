package shehan;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe Burger", "White", "Bacon",5.67);
        super.addHambugerAddition1("Water", 1.20);
        super.addHambugerAddition2("bun", 1.30);
    }

    @Override
    public void addHambugerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }

    @Override
    public void addHambugerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }

    @Override
    public void addHambugerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }

    @Override
    public void addHambugerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }
}
