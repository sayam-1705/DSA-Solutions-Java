package pattern.java;

import java.util.Scanner;

public class PatternFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print it's multiplication table: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }
}
