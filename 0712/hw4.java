package Hw.hw1;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        double s = Math.sqrt(Math.pow((x1 - y1), 2) + Math.pow((x2 - y2), 2));
        System.out.println(s);
    }
}
