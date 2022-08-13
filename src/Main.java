import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        JFrame frame = new JFrame();
        frame.setSize(1280, 720);
        frame.setResizable(false);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Vindigio 2");
        frame.add(new Engine());
        frame.setVisible(true);

        Timer timer;
        timer = new Timer(0, e -> {
            frame.repaint();
        });
        timer.setRepeats(true);
        // Aprox. 60 FPS
        timer.setDelay(17);
        timer.start();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
