package first.java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = sc.next();
        String revStr = new StringBuilder(str).reverse().toString();
        if (str.equals(revStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
