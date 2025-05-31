package pattern.java;

import java.util.Scanner;

public class PatternTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int a = 0, b = 1;
        int temp = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((a) + "\t");
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }
    }
}
