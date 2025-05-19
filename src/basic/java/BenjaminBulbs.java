package basic.java;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs (toggles are same as the number of bulbs): ");
        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j % i == 0) {
//                    arr[j - 1] = arr[j - 1] == 0 ? 1 : 0;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 1) {
//                System.out.println(i + 1);
//            }
//        }

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
