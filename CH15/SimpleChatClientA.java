import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SimpleChatClientA {
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public void go() {
		//make gui and register a listener with the send button
		//call the setUpNetworkig() method
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetWorking();
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

	private void setUpNetWorking() {
		//make a Socket, then make a PrintWriter
		//assign the PrintWriter to writer instance variable
		try {
			sock = new Socket("127.0.0.1", 28023);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		} catch (IOException ex) {
			// IOException: handle exception
			ex.printStackTrace();
		}
	}

	public class SendButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ev) {
			//get the text from the text field and
			//send it to the server using the writer (a PrintWriter)
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch (Exception ex) {
				// Exception: handle exception
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}

	}

	public static void main(String[] args) {
		new SimpleChatClientA().go();
	}
}
