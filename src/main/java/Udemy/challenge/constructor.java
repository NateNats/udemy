package Udemy.challenge;
public class constructor {
    private String name;
    private int credit_limit;
    private String email;

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    constructor(String name, int credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    constructor() {
        this("nicolaus", 1000000, "nicolaus111@gmail.com");
    }

    constructor (String name, String email) {
        this(name, 500000, email);
    }

    void display () {
        System.out.println("Name: " + this.name + "\nCredit limit: " + this.credit_limit +
                 "\nemail: " + this.email);

    }

    public static void main(String[] args) {
        constructor cons = new constructor();
        cons.display();
        constructor cons2 = new constructor("Nicolaus", 200000, "niconiconi");
        cons2.display();
        constructor cons3 = new constructor("Nate", "ninaninu");
        cons3.display();
    }
}
