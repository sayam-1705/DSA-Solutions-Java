package pattern.java;

import java.util.Scanner;

public class PatternSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int total = (rows + 1) / 2;
        int stars = total;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < stars; j++) System.out.print("*\t");
            for (int j = 0; j < ((2 * (total - stars)) + 1); j++) System.out.print("\t");
            for (int j = 0; j < stars; j++) System.out.print("*\t");
//            System.out.print(stars + " " + ((2 * (total - stars)) + 1) + " " + stars);
            if (i < rows / 2) {
                stars--;
            } else {
                stars++;
            }
            System.out.println();
        }
    }
}
