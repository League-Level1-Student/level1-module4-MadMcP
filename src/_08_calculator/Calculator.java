package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(text1);
	panel.add(text2);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
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
		int number3 = number1 * number2;
		return number3;
	}
	
	int div(int number1, int number2) {
		int number3 = number1 / number2;
		return number3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 Object buttonPressed = e.getSource();
		 int number1 = Integer.parseInt(text1.getText());
		 int number2 = Integer.parseInt(text2.getText());
		 int answer;
		if(buttonPressed == button1) {
			 answer = add(number1, number2);
			 System.out.println(answer);
		}
		
		else if(buttonPressed == button2) {
			answer = sub(number1, number2);
			System.out.println(answer);
		}
		
		else if(buttonPressed == button3) {
			answer = mul(number1, number2);
			System.out.println(answer);
		
		}
		
		else if(buttonPressed == button4) {
			answer = div(number1, number2);
			System.out.println(answer);
		}
		
	}
}
