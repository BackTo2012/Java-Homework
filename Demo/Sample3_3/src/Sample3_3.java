
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Sample3_3 extends Frame {
    private Circle  circle1 = new Circle(20,220,200);
    private Circle  circle2 = new Circle(60,220,200);
    private Circle  circle3 = new Circle(140,220,200);
    private Circle  circle4 = new Circle(160,220,200);

    public Sample3_3() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        circle1.draw(g);
        g.setColor(Color.GREEN);
        circle2.draw(g);
        g.setColor(Color.CYAN);
        circle3.draw(g);        
        g.setColor(Color.ORANGE);
        circle4.draw(g);        
    }


    public static void main(String args[]) {
        System.out.println("Starting Sample3_2...");
        Sample3_3 mainFrame = new Sample3_3();
        mainFrame.setSize(400, 400);
        mainFrame.setTitle("Sample3_3");
        mainFrame.setVisible(true);
    }
}
