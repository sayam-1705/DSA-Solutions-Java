package basic.java;

import java.util.Scanner;

public class PythagoreaTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three triplets: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("The triplet is Pythagorean");
        } else if ((a * a) + (c * c) == (b * b)) {
            System.out.println("The triplet is Pythagorean");
        } else if ((b * b) + (c * c) == (a * a)) {
            System.out.println("The triplet is Pythagorean");
        } else {
            System.out.println("The triplet is not Pythagorean");
        }
    }
}
