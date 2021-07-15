
import java.util.Scanner;
public class Sample2_5
{
	public static void main(String[] argc)
	{
		Scanner kb=new Scanner(System.in);
		double a;
		double x,x0,x1;
		
		a=kb.nextDouble();
		x0=a/2;
		x1=1.0/2.0*(x0+a/x0);		
		while(Math.abs(x1-x0)>0.00001)
		{
			x0=x1;
			x1=1.0/2.0*(x0+a/x0);	
		}
		
		x=x1;
		System.out.println("sqrt("+a+")="+x+"  Math.sqrt("+a+")="+Math.sqrt(a));
		
	}
}


