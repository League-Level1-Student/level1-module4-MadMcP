package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChuckleClicker implements ActionListener {
	
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}
	
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	void makeButtons(){
		JOptionPane.showMessageDialog(null, "Make Buttons");
		frame.setVisible(true);
		frame.add(button1);
		frame.add(button2);
		button1.setText("Joke");
		button1.setSize(10,20);
		button1.addActionListener(this);
		button2.setText("Punchline");
		button2.setSize(5,10);
		button2.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			JOptionPane.showMessageDialog(null, "Hi!");
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		else if (buttonPressed == button2) {
			JOptionPane.showMessageDialog(null, "Hi!");
			JOptionPane.showMessageDialog(null, "To get to the other side!");
		}
	}
}
