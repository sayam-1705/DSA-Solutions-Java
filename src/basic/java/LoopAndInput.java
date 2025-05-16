package basic.java;

import java.util.Scanner;

public class LoopAndInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your name: ");
        String s = sc.nextLine();

        System.out.println(s + " is counting...");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
