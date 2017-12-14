import java.awt.*;
import javax.swing.*;

public class Anime {

  public static int x, y;
  static {
    x = 0;
    y = 0;
  }

  public static void main(String[] args) {
    Anime anime = new Anime();
    anime.go();

  }

  public void go() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    MyDrawPanel drawPanel = new MyDrawPanel();

    frame.getContentPane().add(drawPanel);
    frame.setSize(1000, 1000);
    frame.setVisible(true);


    for (x = 0; x < 700; x++) {
      y = x;
      drawPanel.repaint();
      try {
        Thread.sleep(1);
      } catch(InterruptedException iex) {
        iex.printStackTrace();
      }

      //System.out.println("x "+ x + " y "+y);
    }

  }

  class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
      g.setColor(Color.white);
      g.fillRect(0, 0, this.getWidth(), this.getHeight());

      g.setColor(Color.red);
      g.fillOval(x, y, 100, 100);
    }
  } //close inner class
}
