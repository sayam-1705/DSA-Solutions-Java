package pattern.java;

import java.util.Scanner;

public class PatternThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                val = (val * (i - j)) / (j + 1);
            }
            System.out.println();
        }
    }
}
