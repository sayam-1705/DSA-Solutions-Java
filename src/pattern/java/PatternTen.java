package pattern.java;

import java.util.Scanner;

public class PatternTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int spaces = ((rows / 2) - 1);

        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                for (int j = 1; j <= rows; j++) {
                    if (j == ((rows + 1) / 2)) System.out.print("*\t");
                    else System.out.print("\t");
                }
            } else {
                for (int k = 1; k <= spaces; k++) System.out.print("\t");
                System.out.print("*\t");
                for (int k = 1; k <= (rows - ((2 * spaces) + 2)); k++) System.out.print("\t");
                System.out.print("*\t");
//                System.out.print(spaces + " " + "1" + " " + (rows - ((2 * spaces) + 2)) + " " + "1");
                if (i < ((rows + 1) / 2)) {
                    spaces--;
                } else {
                    spaces++;
                }
            }
            System.out.println();
        }
    }
}