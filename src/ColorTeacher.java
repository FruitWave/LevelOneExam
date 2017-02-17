import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JButton yellow;
	private JButton red;
	private JButton blue;
	private JButton green;

	// creators^
	public static void main(String[] args) {
		ColorTeacher techNexus = new ColorTeacher();
		techNexus.startGUI();

	}

	void startGUI() {
		frame = new JFrame();
		panel = new JPanel();
		yellow = new JButton();
		red = new JButton();
		blue = new JButton();
		green = new JButton();
		// JComponent initializer^
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		red.setBackground(Color.red);
		red.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		green.setBackground(Color.green);
		green.setOpaque(true);
		// background setters^
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		// add ActionListeners^
		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		// adders^
		frame.setVisible(true);
		frame.pack();
		// finishers^
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("click");
		if (e.getSource().equals(yellow)) {
			System.out.println("yellow");
			//speak("BOOTS ");
			speak("yellow");
		} else if (e.getSource().equals(red)) {
			//speak("AND CATS AND");
			speak("red");
		} else if (e.getSource().equals(blue)) {
			//speak(" BOOTS AND");
			speak("blue");
		} else if (e.getSource().equals(green)) {
			//speak(" CATS");
			speak("green");
		}
	}
}
