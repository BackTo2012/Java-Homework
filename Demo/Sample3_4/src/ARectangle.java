
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hz2020
 */
public class ARectangle extends AShape {
	protected int width;
	protected int height;	
	public ARectangle(){
	}
	public ARectangle(int x,int y,int width,int height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public ARectangle(int x,int y,int width,int height,Color b,Color f){
		this(x,y,width,height);
		bColor = b;
		fColor = f;
	}	
	@Override
	public void draw(Graphics g){
		g.setColor(bColor);
		g.drawRect(X,Y,width,height);
		g.setColor(fColor);
		g.fillRect(X+1,Y+1,width-1,height-1);
	}		
}
