package _99_extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
		
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JTextField text  = new JTextField(20);
	
	void setup(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		label.setText("What has to be broken before you can use it?");
		button1.setText("Submit");
		button2.setText("Hint");
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		PracticeTest a = new PracticeTest();
		a.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			if(text.getText().equalsIgnoreCase("an egg") || text.getText().equalsIgnoreCase("egg")) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Incorrect! The answer was: an egg");
			}
		}
		else {
			System.out.println("What food item is usually cracked open to cook?");
		}
	}
}
