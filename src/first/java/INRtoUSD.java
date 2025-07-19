package first.java;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in INR: ");
        int snr = sc.nextInt();
        System.out.println("Equivalent currency in USD: " + (snr * 0.0116));
    }
}
