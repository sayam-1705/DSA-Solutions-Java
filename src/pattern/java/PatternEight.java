package pattern.java;

import java.util.Scanner;

public class PatternEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            System.out.println("*\t");
        }
    }
}
