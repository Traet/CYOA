package game;

import java.awt.*;
import javax.swing.*;

public class Game {
	
	JFrame window;

	public static void main(String[] args) {
		
		new Game();
	}
	
	public Game() {
		window = new JFrame();
		window.setSize(800,700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		
		JLabel welcome = new JLabel("CYOA");
		welcome.setFont(new Font("Serif", Font.PLAIN, 30));
		welcome.setForeground(Color.white);
		welcome.setBounds(350,100, 500,100);  
		
		JButton start = new JButton("Start");
		start.setFont(new Font("Serif", Font.PLAIN, 20));
		start.setOpaque(true);
//		start.setForeground(Color.white);
		start.setBounds(350,400, 100,30);
		
		window.add(welcome);window.add(start);
		window.setLayout(null);
		window.setVisible(true);
	}
}
