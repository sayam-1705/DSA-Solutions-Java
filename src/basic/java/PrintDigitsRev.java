package basic.java;

import java.util.Scanner;

public class PrintDigitsRev {
    public static void printDigitsInReverse(int n) {
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printDigitsInReverse(n);
    }
}
