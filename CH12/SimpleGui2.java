import java.awt.*;
import javax.swing.*;

public class SimpleGui2 {


  public static void main(String[] args) {
  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  MyDrawPanel drawPanel = new MyDrawPanel();

  frame.getContentPane().add(drawPanel);
  frame.setSize(300, 300);
  frame.setVisible(true);
  //frame.repaint();
  }
}



class MyDrawPanel extends JPanel {
  public void paintComponent(Graphics g) {

    //g.setColor(Color.orange);
    //g.fillRect(20, 50, 100, 100);

    //Image image = new ImageIcon("photo.jpg").getImage();
    //g.drawImage(image, 30, 45, this);

    g.fillRect(0, 0, this.getWidth(), this.getHeight());

    int red = (int) (Math.random() * 255);
    int green = (int) (Math.random() * 255);
    int blue = (int) (Math.random() * 255);

    Color randomColor = new Color(red, green, blue);
    g.setColor(randomColor);
    g.fillOval(70, 70, 100, 100);


  }
}
