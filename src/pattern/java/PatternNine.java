package pattern.java;

import java.util.Scanner;

public class PatternNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == j || (i + j) == (rows - 1)) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
