package Interface;

import java.util.Scanner;
import java.util.Stack;

public class Exercise {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan String: ");
        String masukan = sc.next();

        for (int i = 0; i < masukan.length(); i++){
            stack.push(masukan.charAt(i));
        }

        for (int i = 0; i < masukan.length(); i++){
            System.out.print(stack.pop());
        }
    }
}
