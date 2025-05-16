package basic.java;

import java.util.Scanner;

import static basic.java.CountDigits.countDigits;

public class PrintDigits {
    public static void digitsInNumber(int n) {
        int digits = countDigits(n);

        while (digits != 0) {
//            if (n == 0) {
//                System.out.println(0);
//            } else {
//                System.out.println((int) (n / Math.pow(10, digits - 1)));
//            }
            System.out.println((int) (n / Math.pow(10, digits - 1)));
            n %= (int) Math.pow(10, digits - 1);
            digits--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        digitsInNumber(n);
    }
}
