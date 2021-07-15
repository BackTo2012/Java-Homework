
public class Fx
{
	private double x;
	private double a = 100.0;
	
	public Fx()
	{
	}
	
	public Fx(double a)
	{
		this.a = a;
	}
	
	public Fx(double a,double x) 
	{
		this(a);
		this.x = x;
	}
	
	public double fx()
	{
		if(x>=a)
			return 1.0;
		else
			return -1.0;
		
	}
	
	public double fx(double x)
	{
		this.x = x;
		return fx();
	}
		
}
