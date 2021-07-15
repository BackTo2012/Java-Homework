import java.io.*;
import java.util.*;
public class Sample2_2{
  
  public static int maxCommDiv(int m,int n){
    int commDiv;
    if(m<n)
      commDiv = m;
    else
      commDiv = n;

    while(m%commDiv!=0 || n%commDiv!=0){
      commDiv--; 
    }
    return commDiv; 
  }

  public static int maxCommMul(int m,int n){
    int commMul;
    if(m>n)
      commMul = m;
    else
      commMul = n;

    while(commMul%m!=0 || commMul%n!=0){
      commMul++; 
    }
    return commMul; 
  }


  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int m,n;
      int maxDiv,maxMul;
      
      System.out.print("输入整数m:");
      m = sc.nextInt();
      System.out.print("输入整数n:");
      n = sc.nextInt();
      maxMul = maxCommMul(m,n);
      maxDiv = maxCommDiv(m,n);
      System.out.println("整数 "+m+","+n+" 最大公约数是"+maxDiv+"，最小公倍数是"+maxMul);

  }
}