package basic.java;

import java.util.Scanner;

public class GCDandLCM {
    public static int gcd(int a, int b) {
//        int l = Math.max(a, b);
//        for (int i = l; i > 1; i--) {
//            if (a % i == 0 && b % i == 0) return i;
//        }
//        return 1;

        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
