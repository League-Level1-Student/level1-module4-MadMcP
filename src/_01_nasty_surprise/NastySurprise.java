package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	public static void main(String[] args) {
		NastySurprise a = new NastySurprise();
		a.buttons();
	}
	
	public void buttons(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		button1.setText("Trick");
		button2.setText("Treat");
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)){
			showPictureFromTheInternet("https://cdn.royalcanin-weshare-online.io/pCJJPmYBaxEApS7LeAbn/v1/ed7h-how-to-buy-a-puppy-hero-dog");
		}
		else if (e.getSource().equals(button2)){
			showPictureFromTheInternet("https://i.ytimg.com/vi/a5xYjc_s0kI/maxresdefault.jpg");
		}
	}
}
