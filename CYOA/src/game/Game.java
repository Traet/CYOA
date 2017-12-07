package game;

import java.awt.*;
import javax.swing.*;

public class Game {
	
	JFrame window;

	public static void main(String[] args) {
		//test 1
		new Game();
	}
	
	public Game() {
		window = new JFrame();
		window.setSize(800,700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		JLabel welcome = new JLabel("CYOA");
		welcome.setForeground(Color.white);
		welcome.setBounds(50,100, 100,30);  
		window.add(welcome);
		window.setLayout(null);
		window.setVisible(true);
	}
}
