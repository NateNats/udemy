package ComputerFactory;

public class Main {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch", "Asus",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("2208", "Dell",
                2, 6, "v2.44");
        PersonalComputer MyPC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        MyPC.pressUp();
//        MyPC.getMonitor().drawPixelAt(10, 10, "Blue");
//        MyPC.getMotherboard().loadProgram("NetBeans");
//        MyPC.getComputerCase().pressPowerButton();
    }
}
