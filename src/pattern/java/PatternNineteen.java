package pattern.java;

import java.util.Scanner;

public class PatternNineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            if (i == 0) {
                for (int j = 0; j < rows; j++) {
                    if (j <= rows / 2 || j == rows - 1) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else if (i == rows - 1) {
                for (int j = 0; j < rows; j++) {
                    if (j == 0 || j >= rows / 2) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else if (i < rows / 2) {
                for (int j = 0; j < rows; j++) {
                    if (j == rows / 2 || j == rows - 1) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else if (i > rows / 2) {
                for (int j = 0; j < rows; j++) {
                    if (j == 0 || j == rows / 2) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else {
                for (int j = 0; j < rows; j++) System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
