package basic.java;

import java.util.Scanner;

import static basic.java.CountDigits.countDigits;

public class RotateNumber {
    public static int rotate(int n, int r) {
        int digits = countDigits(n);
        r = r % digits;
        if (r < 0) r += 5;
        while (r != 0) {
            n = (n / 10) + ((n % 10) * ((int) Math.pow(10, digits - 1)));
            r--;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of rotations: ");
        int r = sc.nextInt();

        System.out.println("Rotated number is: " + rotate(n, r));
    }
}
