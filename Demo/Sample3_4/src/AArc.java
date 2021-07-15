
import java.awt.Color;
import java.awt.Graphics;

public class AArc extends AShape {
	protected int radius;
	public AArc(){
	}
	public AArc(int x,int y,int r){
		super(x,y);
		radius = r;
	}
	public AArc(int x,int y,int r,Color b,Color f){
		this(x,y,r);
		bColor = b;
		fColor = f;
	}		
	@Override
	public void draw(Graphics g){
		g.setColor(bColor);
		g.drawArc(X-radius,Y-radius,2*radius,2*radius,0,360);
		g.setColor(fColor);
		g.fillArc(X-radius+1,Y-radius+1,2*radius-1,2*radius-1,0,360);
	}
}
