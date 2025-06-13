package pattern.java;

import java.util.Scanner;

public class PatternTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i < ((rows / 2) + 1)) {
                for (int j = 1; j <= rows; j++) {
                    if (j == 1 || j == rows) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    if (j == 1 || j == rows || j == (rows - i + 1) || j == i) System.out.print("*\t");
                    else System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
