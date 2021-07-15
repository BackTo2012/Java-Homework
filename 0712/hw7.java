package Hw.hw1;

import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double MianJi = Math.PI * Math.pow(R, 2);
        double ZhouChang = 2 * Math.PI * R;

        System.out.println("圆的面积为：" + MianJi
                + "\n圆的周长为：" + ZhouChang);

    }
}
