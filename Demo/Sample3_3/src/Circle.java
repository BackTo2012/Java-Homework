
import java.awt.Graphics;

public class Circle {

    protected Point center;
    protected double radius = 0;

    public Circle() {
    }

    public Circle(double r, double x, double y) {
        center = new Point(x, y);
        radius = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        center = new Point(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public Point getTopLeft() {
        double x, y;
        x = center.getX() - radius;
        y = center.getY() - radius;
        return new Point(x, y);
    }

    public double getWidth() {
        return 2 * radius;
    }
    
    public void draw(Graphics g){
         Point p = getTopLeft();
         double width = getWidth();
         g.drawArc((int)p.getX(), (int)p.getY(), (int)width, (int)width, 0, 360);
     }      	

}
