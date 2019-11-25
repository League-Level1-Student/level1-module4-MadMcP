package _08_calculator;

import javax.swing.JOptionPane;

public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		JOptionPane.showMessageDialog(null, "Division does not give remainders. Check with multiplication. If results do not match, subtract the result of multiplying from the one from dividing to find the remainder.");
		c.setup();
	}
}
