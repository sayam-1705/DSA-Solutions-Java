package pattern.java;

import java.util.Scanner;

public class PatternFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int spaces = (rows / 2) + 1;

        for (int i = 0; i < rows; i++) {
            if (i <= rows / 2 && spaces > 0) {
                --spaces;
                for (int j = 0; j < spaces; j++) System.out.print(" \t");
                for (int j = 0; j < (rows - (2 * (spaces))); j++) System.out.print("*\t");
//                System.out.print((--spaces) + " " + (rows - (2 * (spaces))));
            } else {
                ++spaces;
                for (int j = 0; j < spaces; j++) System.out.print(" \t");
                for (int j = 0; j < (rows - (2 * (spaces))); j++) System.out.print("*\t");
//                System.out.print((++spaces) + " " + (rows - (2 * (spaces))));
            }
            System.out.println();
        }
    }
}
