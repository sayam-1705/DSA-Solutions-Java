package basic.java;

import java.util.Scanner;

import static basic.java.PrimeCheck.isPrime;

public class PrintPrime {
    public static void printPrime(int l, int u) {
        for (int i = l; i <= u; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int lower = sc.nextInt();
        System.out.println("Enter upper limit: ");
        int upper = sc.nextInt();

        printPrime(lower, upper);
    }
}
