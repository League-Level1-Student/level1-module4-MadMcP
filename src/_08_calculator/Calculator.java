package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame frame = new JFrame();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	void setup() {
	frame.setVisible(true);
	frame.setSize(500, 750);
	frame.add(text1);
	frame.add(text2);
	frame.add(button1);
	frame.add(button2);
	frame.add(button3);
	frame.add(button4);
	frame.pack();
	button1.addActionListener(this);
	button1.setText("add");
	button1.setSize(10, 20);
	button2.addActionListener(this);
	button2.setText("sub");
	button2.setSize(10, 20);
	button3.addActionListener(this);
	button3.setText("mul");
	button3.setSize(10, 20);
	button4.addActionListener(this);
	button4.setText("div");
	button4.setSize(10, 20);
	}
	
	int add(int number1, int number2) {
		int number3 = number1 + number2;
		return number3;
	}
	
	int sub(int number1, int number2) {
		int number3 = number1 - number2;
		return number3;
	}
	
	int mul(int number1, int number2) {
		int number3 = number1 + number2;
		for (int i = number2; i > 0; i--) {
			number3 = number3 + number2;
		}
		return number3;
	}
	
	int div(int number1, int number2) {
		int number3 = 0;
		for (int i = number1; i >= 0; i = i - number2) {
			number3 = number3 + 1;
		}
		return number3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
