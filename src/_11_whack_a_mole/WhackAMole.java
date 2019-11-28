package _11_whack_a_mole;

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
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	JButton button13 = new JButton();
	JButton button14 = new JButton();
	JButton button15 = new JButton();
	Date start = new Date();
	int r = new Random().nextInt(15);
	int molesWhacked = 0;
	int misses = 0;
	
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(450, 150);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		if (r == 0) {
			button15.setText("mole");
		}
		else if (r == 1) {
			button1.setText("mole");
		}
		else if (r == 2) {
			button2.setText("mole");
		}
		else if (r == 3) {
			button3.setText("mole");
		}
		else if (r == 4) {
			button4.setText("mole");
		}
		else if (r == 5) {
			button5.setText("mole");
		}
		else if (r == 6) {
			button6.setText("mole");
		}
		else if (r == 7) {
			button7.setText("mole");
		}
		else if (r == 8) {
			button8.setText("mole");
		}
		else if (r == 9) {
			button9.setText("mole");
		}
		else if (r == 10) {
			button10.setText("mole");
		}
		else if (r == 11) {
			button11.setText("mole");
		}
		else if (r == 12) {
			button12.setText("mole");
		}
		else if (r == 13) {
			button13.setText("mole");
		}
		else if (r == 14) {
			button14.setText("mole");
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
		
		if (misses ==5) {
			JOptionPane.showMessageDialog(null, "You have lost the game! Try again");
		}
		else if (molesWhacked == 10) {
			endGame(start, molesWhacked);
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
		if(e.getSource() == button1 && r == 1) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button1 && r != 1) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button2 && r == 2) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button2 && r != 2) {
			speak("Missed");
			misses = misses + 1;
			misses = misses + 1;
		}
		
		if(e.getSource() == button3 && r == 3) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button3 && r != 3) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button4 && r == 4) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button4 && r != 4) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button5 && r == 5) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button5 && r != 5) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button6 && r == 6) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button6 && r != 6) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button7 && r == 7) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button7 && r != 7) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button8 && r == 8) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button8 && r != 8) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button9 && r == 9) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button9 && r != 9) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button10 && r == 10) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button10 && r != 10) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button11 && r == 11) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button11 && r != 11) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button12 && r == 12) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button12 && r != 12) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button13 && r == 13) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button13 && r != 13) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button14 && r == 14) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button14 && r != 14) {
			speak("Missed");
			misses = misses + 1;
		}
		
		if(e.getSource() == button15 && r == 0) {
			molesWhacked = molesWhacked + 1;
		}
		else if(e.getSource() == button15 && r != 0) {
			speak("Missed");
			misses = misses + 1;
		}
		check();
		frame.removeAll();
		setup();
	}
	
}
