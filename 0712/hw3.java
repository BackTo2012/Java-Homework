package Hw.hw1;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);
    }
}
