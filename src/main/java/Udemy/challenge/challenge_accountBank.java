package Udemy.challenge;
import java.util.Scanner;
public class challenge_accountBank {
    private int num;
    private String customerName;
    private String customerEmail;
    private String number;
    private String customerPhone;
    private double balance;
    private double deposit;
    private double withdrawal;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone (String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    public void setDeposit (double deposit){
        this.deposit = deposit;
    }

    public void setWithdrawal (double withdrawal){
        this.withdrawal = withdrawal;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public String getNumber (String number){
        return number;
    }

    public void display() {
        System.out.println("Welcome " + getCustomerName());
        System.out.println("1. Check balance\n2. Deposit\n3. Withdrawal\n4. out");

    }

    public void menu (int num) {
        this.num = num;
    }

    public int getMenu() {
        return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        challenge_accountBank bank = new challenge_accountBank();
        System.out.print("enter your name: ");
        bank.setCustomerName(input.nextLine());
        System.out.print("enter your email: ");
        bank.setCustomerEmail(input.next());
        System.out.print("enter your phone number: ");
        bank.setCustomerPhone(input.next());
        while(bank.getMenu() != 4){
            bank.display();
            bank.menu(input.nextInt());

            switch (bank.getMenu()){
                case 1:
                    System.out.println(bank.getBalance());
                    break;
                case 2:
                    System.out.println("enter your deposit: ");
                    bank.setDeposit(input.nextDouble());
                    bank.setBalance(bank.getBalance()+bank.getDeposit());
                    break;
                case 3:
                    System.out.print("enter your withdrawal: ");
                    bank.setWithdrawal(input.nextDouble());
                    bank.setBalance(bank.getBalance()-bank.getWithdrawal());
                case 4:
                    break;
                default:
                    System.out.println("input invalid");
            }
        }
    }
}
