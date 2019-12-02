package _11_whack_a_mole;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date start = new Date();
	int r = new Random().nextInt();
	int molesWhacked = 0;
	int misses = 0;
	static WhackAMole wam = new WhackAMole();
	
	public static void main(String[] args) {
		wam.setup();
	}
	
	void setup() {
		r = new Random().nextInt(15);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(450, 150);
		frame.add(panel);
		for (int i = 0; i < 15; i++) {
			JButton button1 = new JButton();
			panel.add(button1);
			button1.addActionListener(this);
			button1.setText("");
			if (r == i) {
			button1.setText("mole");
		}
		}
		
		
	}

	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	void check() {
		
		if (misses == 5) {
			JOptionPane.showMessageDialog(null, "You have lost the game! Try again");
			frame.setVisible(false);
		}
		else if (molesWhacked == 10) {
			endGame(start, molesWhacked);
			frame.setVisible(false);
		}
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date(molesWhacked);
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("mole")) {
			molesWhacked = molesWhacked + 1;
		}
		else {
			speak("Missed!");
			misses = misses + 1;
		}
		
		check();
		frame.remove(panel);
		panel = new JPanel();
		frame.add(panel);
		setup();
	}
	
}
