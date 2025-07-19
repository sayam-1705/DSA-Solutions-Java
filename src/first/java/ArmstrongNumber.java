package first.java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int num = sc.nextInt();
        int sum = 0, dupNum = num;
        while(dupNum != 0) {
            int dig = dupNum % 10;
            dupNum /= 10;
            sum += (int) Math.pow(dig, 3);
        }
        if(num == sum ) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
