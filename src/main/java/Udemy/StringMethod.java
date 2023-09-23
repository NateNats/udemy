package Udemy;

public class StringMethod {

    public static void main(String[] args) {
        String newDate = "27";
        newDate = newDate.concat("/");
        newDate = newDate.concat("01");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2004");

        System.out.println("NewDate = " + newDate);

        String date = "27/01/2004";
        int dateIndex = date.indexOf("27");
        int monthIndex = date.indexOf("01");
        int yearIndex = date.indexOf("2004");

        System.out.printf("yearIndex = %d%n", yearIndex);
        System.out.printf("monthIndex = %d%n", monthIndex);
        System.out.printf("DateIndex = %d%n", dateIndex);
        System.out.printf("birth date = %s%n", newDate.substring(0));

        String date2 = String.join("/", "27", "01", "2004");
        System.out.printf("date2 = %s%n", date2);

        int a = 2000;
        System.out.println(String.format("harga barang = %d", a));
    }
}
