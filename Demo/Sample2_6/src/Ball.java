

public class Ball
{
	private double R1, R2;
	private double V0;
	
	public Ball()
	{
	}
	
	public Ball(double r1, double r2)
	{
		R1=r1;
		R2=r2;
	}
	
	public double volume()
	{
		double v1,v2;
		v1=R1*R1*R1*Math.PI*4.0/3.0;
		v2=R2*R2*R2*Math.PI*4.0/3.0;
		V0=v2-v1;
		return V0;
	}

	public double volume(double r1, double r2)
	{
		R1=r1;
		R2=r2;
		return volume();	
	}
}
