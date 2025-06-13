package pattern.java;

import java.util.Scanner;

public class PatternFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int spaces = (rows / 2) + 1;
        int val = 0;

        for (int i = 0; i < rows; i++) {
            if (i <= rows / 2 && spaces > 0) {
                val = i;
                --spaces;
                for (int j = 0; j < spaces; j++) System.out.print(" \t");
            } else {
                val = rows - i - 1;
                ++spaces;
                for (int j = 0; j < spaces; j++) System.out.print(" \t");
            }
            printValue(rows, spaces, val);
            System.out.println();
        }
    }

    private static void printValue(int rows, int spaces, int val) {
        for (int j = 0; j < (rows - (2 * (spaces))); j++) {
            if (j <= (rows - (2 * (spaces))) / 2) {
                System.out.print((++val) + "\t");
            } else {
                System.out.print((--val) + "\t");
            }
        }
    }
}
