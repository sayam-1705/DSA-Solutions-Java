package basic.java;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of test cases: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter number to check: ");
            int n = sc.nextInt();

            if (n <= 1 || !isPrime(n)) {
                System.out.println(n + "is not a prime number");
            } else {
                System.out.println(n + "is a prime number");
            }

//            int count = 0;
//            for (int j = 1; j <= n; j++) {
//                if (n % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                System.out.println(n + " is a prime number");
//            } else {
//                System.out.println(n + " is not a prime number");
//            }
        }
    }
}
