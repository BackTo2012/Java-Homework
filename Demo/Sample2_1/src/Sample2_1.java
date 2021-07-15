
import java.util.Scanner;
class Sample2_1 {
	
	public static void main(String[] argv){
		int ivar1,ivar2;
		double fvar1,fvar2;
		int isum;
		double fsum;
		
		Scanner sc=new Scanner(System.in);
		
		ivar1=sc.nextInt();
		ivar2=sc.nextInt();
		
		fvar1=sc.nextDouble();
		fvar2=sc.nextDouble();
		
		isum=ivar1+ivar2;
		fsum=fvar1+fvar2;
				
		System.out.println(isum);
		System.out.println(fsum);
			
	}
		
}
