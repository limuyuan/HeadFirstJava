import javax.swing.*;
import java.awt.*;

public class TextField {

  public static void main(String[] args) {
    TextField gui = new TextField();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);

    frame.getContentPane().add(BorderLayout.EAST, panel);

    JTextField field1 = new JTextField(20);
    JTextField field2 = new JTextField("Your name");

    panel.add(field1);
    panel.add(field2);


    System.out.println(field2.getText());
    field1.setText("Morris");
    System.out.println(field1.getText());
    //field1.selectAll();

    field2.requestFocus();


    frame.setSize(500, 500);
    frame.setVisible(true);

  }
}
