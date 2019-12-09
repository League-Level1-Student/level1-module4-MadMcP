package _12_slot_machine;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	int r1 = new Random().nextInt(3);
	int r2 = new Random().nextInt(3);
	int r3 = new Random().nextInt(3);
	
	void setup() throws MalformedURLException{
		button = new JButton();
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(1250, 500));
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
		if (r1 == 0) {
			panel.add(createLabelImage("Cherries.jpeg"));
		}
		else if (r1 == 1) {
			panel.add(createLabelImage("Orange.jpeg"));
		}
		else if (r1 == 2) {
			panel.add(createLabelImage("Lemon.jpeg"));
		}
		if (r2 == 0) {
			panel.add(createLabelImage("Cherries.jpeg"));
		}
		else if (r2 == 1) {
			panel.add(createLabelImage("Orange.jpeg"));
		}
		else if (r2 == 2) {
			panel.add(createLabelImage("Lemon.jpeg"));
		}
		if (r3 == 0) {
			panel.add(createLabelImage("Cherries.jpeg"));
		}
		else if (r3 == 1) {
			panel.add(createLabelImage("Orange.jpeg"));
		}
		else if (r3 == 2) {
			panel.add(createLabelImage("Lemon.jpeg"));
		}
		frame.pack();
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	void check() {
		System.out.println(r1 + ", " + r2 + ", " + r3);
		if(r1 == r2 && r2 == r3) {
			System.out.println("YOU WIN!!!");
		}
		else {
			System.out.println("-YOU LOSE-");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.remove(panel);
		if (r1 == 0 || r2 == 0 || r3 == 0) {
		try {
			panel.remove(createLabelImage("Cherries.jpeg"));
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		if (r1 == 1 || r2 == 1 || r3 == 1) {
			try {
				panel.remove(createLabelImage("Orange.jpeg"));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (r1 == 2 || r2 == 2 || r3 == 2) {
			try {
				panel.remove(createLabelImage("Lemon.jpeg"));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		r1 = new Random().nextInt(3);
		r2 = new Random().nextInt(3);
		r3 = new Random().nextInt(3);
		panel = new JPanel();
		frame.add(panel);
		try {
			setup();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		check();
	}
	
}
