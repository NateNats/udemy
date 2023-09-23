package BillsBurger2;

public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger("Basic", "Sausage", 3.56, "WHite Roll");
        burger.displayBase();
        burger.addHamburgerAddition1("tomato", 0.27);
        burger.addHamburgerAddition2("lettuce", 0.75);
        burger.addHamburgerAddition3("cheese", 1.13);
        System.out.printf("Total burger price is %.2f%n%n", burger.getTotalprice());

        HealthyBurger healthy = new HealthyBurger("Bacon", 5.67);
        healthy.displayBase();
        healthy.addHamburgerAddition1("Egg", 5.43);
        healthy.addHealthyAddition1("Lentils", 4.31);
        System.out.printf("Total burger price is %.2f%n%n", healthy.getTotalprice());

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.displayBase();
        deluxe.addHamburgerAddition1("Should not do this", 50);
        System.out.printf("Total burger price is %.2f%n%n", deluxe.getTotalprice());
    }
}
