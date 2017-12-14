import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MiniMusicService implements Service {
	/**
	 *
	 */
	private static final long serialVersionUID = -7420141739123192024L;
	MyDrawPanel myPanel;
	@Override
	public JPanel getGuiPanel() {
		JPanel mainPanel = new JPanel();
		myPanel = new MyDrawPanel();
		JButton playItButton = new JButton("Play it");
		playItButton.addActionListener(new PlayItListener());
		mainPanel.add(myPanel);
		mainPanel.add(playItButton);
		return mainPanel;
	}

	public class MyDrawPanel extends JPanel implements ControllerEventListener {
		/**
		 *
		 */
		private static final long serialVersionUID = 6250820978011583631L;
		boolean msg = false;

		@Override
		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();

		}

		public Dimension getPreferedSize() {
			return new Dimension(300, 300);
		}

		public void paintComponent(Graphics g) {
			if (msg){
				Graphics2D g2 = (Graphics2D) g;

				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);

				g.setColor(new Color(r, gr, b));
				int ht = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);

				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random()* 40) + 10);

				g.fillRect(x, y, ht, width);
				msg = false;
			}
		}
	}

	public class PlayItListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ev) {
			try {
				Sequencer sequencer = MidiSystem.getSequencer();
				sequencer.open();

				sequencer.addControllerEventListener(myPanel, new int[] {127});
				Sequence seq = new Sequence(Sequence.PPQ, 4);
				Track track = seq.createTrack();

				for (int i = 0; i < 100; i += 4) {
					int rNum = (int) ((Math.random() * 50) + 1);
					if (rNum < 38) {
						track.add(makeEvent(144, 1, rNum, 100, i));
						track.add(makeEvent(176, 1, 127, 0, i));
						track.add(makeEvent(128, 1, rNum, 100, i + 2));
					}
				}

				sequencer.setSequence(seq);
				sequencer.start();
				sequencer.setTempoInBPM(220);
			} catch(Exception ex) {
				ex.printStackTrace();
			}

		}

	}

	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch(Exception e) { }
		return event;
	}
}
