package pattern.java;

import java.util.Scanner;

public class PatternSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int val = 0;
            for (int j = 1; j <= ((2 * rows) - 1); j++) {
                if (j <= i) {
                    System.out.print((++val) + "\t");
                } else if (j >= (((2 * rows)) - i) && i == rows) {
                    System.out.print((--val) + "\t");
                } else if (j >= (((2 * rows)) - i)) {
                    System.out.print((val--) + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
