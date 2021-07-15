 
import java.awt.*;
import java.awt.event.*;

class Sample3_2 extends Frame
{
	private Point A,B,C,D;
	
	public Sample3_2()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				System.exit(0);
			}
		});
		
		A = new Point(45,80);
		B = new Point(104,80);
		C = new Point(45,290);
		D = new Point();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		drawTriangle(g);
	}
	
	private void drawTriangle(Graphics g)
	{
		int[] xPoints,yPoints;
		
		xPoints = new int[3];
		xPoints[0] = (int)A.getX();
		xPoints[1] = (int)B.getX();
		xPoints[2] = (int)C.getX();
		
		yPoints = new int[3];
		yPoints[0] = (int)A.getY();
		yPoints[1] = (int)B.getY();
		yPoints[2] = (int)C.getY();		
		
		g.drawPolygon(xPoints, yPoints, 3);
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Starting Sample3_2...");
		Sample3_2 mainFrame = new Sample3_2();
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("Sample3_2");
		mainFrame.setVisible(true);
	}
	
}
