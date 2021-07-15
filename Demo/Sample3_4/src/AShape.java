
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hz2020
 */
public class AShape {
	protected int X;
	protected int Y;
	protected Color bColor = Color.ORANGE;
	protected Color fColor = Color.CYAN;
	
	public AShape(){
	}
	
	public AShape(int x,int y){
		X = x;
		Y = y;
	}	
	
	public int getX(){
		return X;
	}

	public void setX(int value){
		X = value;
	}	
	
	public int getY(){
		return Y;
	}

	public void setY(int value){
		Y = value;
	}
	
	public void setBcolor(Color color){
		bColor = color;
	}
		
	public void setFcolor(Color color){
		fColor = color;
	}	
		
	public void draw(Graphics g){
	}
	
}
