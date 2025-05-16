package basic.java;

import java.util.Scanner;

public class InverseOfNumber {
    public static int inverse(int n) {
        int num = 1, sum = 0;
        while (n != 0) {
            sum += num * ((int) Math.pow(10, (n % 10) - 1));
            n /= 10;
            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Inverse of " + n + " is: " + inverse(n));
    }
}
