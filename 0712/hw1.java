package Hw.hw1;

import java.util.Scanner;
import java.math.*;

public class hw1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= k; i++) {

            sum += Math.pow(i, 2);
        }

        System.out.println(sum);
    }
}
