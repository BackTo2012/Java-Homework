public class Point{
   private double ox,oy;

   public Point(){
   } 
   
   public Point(double ox,double oy){
      this.ox = ox;
      this.oy = oy;
   } 
   
   public double getX(){
      return ox;
   }

   public double getY(){
      return oy;
   }

   public void setX(double x){
      ox = x;
   }

   public void setY(double y){
      oy = y;
   }
}