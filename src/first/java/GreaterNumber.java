package first.java;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Greater number is: " + (Math.max(num1, num2)));
    }
}
