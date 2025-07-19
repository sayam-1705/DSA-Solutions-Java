package first.java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh number of terms in the Fibonacci series: ");
        int a = 0, b = 1, c = a, n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
