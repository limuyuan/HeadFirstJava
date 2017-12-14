import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiceService implements Service {
	/**
	 *
	 */
	private static final long serialVersionUID = -7115641175143824945L;
	JLabel label;
	JComboBox<String> numOfDice;

	@Override
	public JPanel getGuiPanel() {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JButton button = new JButton("Roll 'em!");
		String[] choices = {"1", "2", "3", "4", "5"};
		numOfDice = new JComboBox<String>(choices);

		label = new JLabel("dice values here");
		button.addActionListener(new RollEmListener());
		panel.add(numOfDice);
		panel.add(button);
		panel.add(label);
		return panel;
	}

	public class RollEmListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ev) {
			// TODO Auto-generated method stub
			String diceOutput = "";
			String selection = (String) numOfDice.getSelectedItem();
			int numOfDiceToRoll = Integer.parseInt(selection);
			for (int i = 0; i < numOfDiceToRoll; i++) {
				int r = (int) ((Math.random() * 6) + 1);
				diceOutput += (" " + r);
			}
			label.setText(diceOutput);
		}

	}

}
