package Hw.hw1;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("平均值：" + aver(a, b, c)
                + " \n累加和：" + sum(a, b, c)
                + " \n最大值：" + max(a, b, c)
                + " \n最小值：" + min(a, b, c));

    }

    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static int aver(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static int max(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int min(int a, int b, int c) {
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
