package pattern.java;

import java.util.Scanner;

public class PatternSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            if (i == rows / 2) {
                for (int j = 0; j < rows; j++) System.out.print("*\t");
            } else {
                for (int j = 0; j < rows / 2; j++) System.out.print("\t");
                if (i <= rows / 2) {
                    for (int j = 0; j <= i; j++) System.out.print("*\t");
                } else {
                    for (int j = 0; j < (rows - i); j++) System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
