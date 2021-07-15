
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author hz2020
 */
public class Sample3_4 extends Frame {

    private ARectangle[] r = {
        new ARectangle(25, 105, 90, 90, Color.WHITE, new Color(255, 204, 102)),
        new ARectangle(200, 55, 50, 50, Color.WHITE, Color.GREEN),
        new ARectangle(200, 130, 50, 50, Color.WHITE, new Color(51, 102, 204)),
        new ARectangle(325, 105, 90, 90, Color.WHITE, new Color(255, 204, 102)),
        new ARectangle(250, 230, 100, 30, Color.WHITE, new Color(51, 153, 255)),
        new ARectangle(100, 230, 100, 30, Color.WHITE, new Color(51, 153, 255))
    };

    private AArc[] a = {
        new AArc(160, 125 + 30, 20, Color.WHITE, new Color(102, 0, 102)),
        new AArc(225, 175 + 30, 20, Color.WHITE, new Color(102, 0, 102)),
        new AArc(290, 125 + 30, 20, Color.WHITE, new Color(102, 0, 102)),
        new AArc(390, 210 + 30, 20, Color.WHITE, new Color(255, 255, 204)),
        new AArc(60, 210 + 30, 20, Color.WHITE, new Color(255, 255, 204))
    };

    public Sample3_4() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        System.out.println("Starting RectAndArcApp...");
        Sample3_4 mainFrame = new Sample3_4();
        mainFrame.setSize(450, 400);
        mainFrame.setTitle("RectAndArcApp");
        mainFrame.setBackground(Color.BLUE);
        mainFrame.setVisible(true);
    }

    public void paint(Graphics g) {

        for (int i = 0; i < r.length; i++) {
            r[i].draw(g);
        }

        for (int j = 0; j < a.length; j++) {
            a[j].draw(g);
        }

    }

}
