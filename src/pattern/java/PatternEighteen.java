package pattern.java;

import java.util.Scanner;

public class PatternEighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                for (int j = 1; j <= rows; j++) System.out.print("*\t");
            } else if (i <= ((rows / 2) + 1)) {
                for (int j = 1; j <= rows; j++) {
                    if (j == i || j == (rows - i + 1)) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    if (j > (rows - i) && j <= i) System.out.print("*\t");
                    else System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
