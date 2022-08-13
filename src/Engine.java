import javax.swing.*;
import java.awt.*;

public class Engine extends JPanel {
//    public Engine() {
//
//    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        draw_poligon(g, 340, 630, 167, 850, 374, 638, true);
    }

    private void draw_poligon(Graphics g, int x1, int x2, int x3, int y1, int y2, int y3, boolean fill) {
        int[] x_points = {x1, x2, x3};
        int[] y_points = {y1, y2, y3};

        if (fill) {
            g.fillPolygon(y_points, x_points, 3);
        } else if (!fill) {
            g.drawPolygon(y_points, x_points, 3);
        }
    }
}
