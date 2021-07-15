package Hw.hw1;

public class hw2 {
    public static void main(String[] args) {
        int day=100%7;
        day+=2;
        switch (day){
            case 1:System.out.println("100天后是星期一");break;
            case 2:System.out.println("100天后是星期二");break;
            case 3:System.out.println("100天后是星期三");break;
            case 4:System.out.println("100天后是星期四");break;
            case 5:System.out.println("100天后是星期五");break;
            case 6:System.out.println("100天后是星期六");break;
            case 7:System.out.println("100天后是星期七");break;
        }
    }
}
