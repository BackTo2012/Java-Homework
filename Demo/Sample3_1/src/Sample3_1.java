
public class Sample3_1
{
	public static void main(String args[])
	{
		Fx fx1,fx2,fx3;
		
		fx1 = new Fx();
		System.out.println("x=267 fx(267)="+fx1.fx(267));
		
		fx2 = new Fx(100.0,72);
		System.out.println("x=72 fx(72)="+fx2.fx());
		
		fx3 = new Fx();
		System.out.println("x=134 fx(134)="+fx3.fx(134));

	}
}
