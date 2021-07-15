

public class Sample2_4
{
	
	public static void main(String[] argc)
	{
		int num,num1,num2,num3;		
		
		for(num=100;num<=999;num++)
		{
			num1=num/100;
			num2=(num-num1*100)/10;
			num3=num-num1*100-num2*10;
			if((num1*num1*num1+num2*num2*num2+num3*num3*num3)==num)
			{
				System.out.println(num+"="+num1+" "+num2+" "+num3);	
			}
		}

	}
	

}

