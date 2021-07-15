
class Sample2_6 
{
	
	public static void main(String args[])
	{
		System.out.println("计算方法1");
		Ball ball1=new Ball(10,20);	
		System.out.println("Volume="+ball1.volume());

		System.out.println("计算方法2");
		Ball ball2=new Ball();	
		System.out.println("Volume="+ball1.volume(10,20));		

	}
}
