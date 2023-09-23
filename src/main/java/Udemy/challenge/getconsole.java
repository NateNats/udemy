package Udemy.challenge;

public class getconsole {

    public static void main(String[] args) {
        String currentYear = "2023";
        int yearInt = Integer.parseInt(currentYear);

        getInputConsole(yearInt);
    }

    public static String getInputConsole (int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Welcome to the course.");
        String year = System.console().readLine("what were you born? ");

        int age = currentYear - Integer.parseInt(year);

        return "Hi " + name + ", you are " + age + " year old";
    }
}
