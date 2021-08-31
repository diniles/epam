package JavaFundamentals;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Welcome here " + name);
    }
}
