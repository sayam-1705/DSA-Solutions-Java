package first.java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter time (in years): ");
        float time = sc.nextFloat();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();

        int simpleInterest = (int)((principal * time * rate) / 100);
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
