package game;

import java.awt.*;
import javax.swing.*;

public class Game {
	
	JFrame window;
	Container con;
	JPanel titlePanel, startPanel;
	JLabel titleLabel;
	JButton startButton;
	Font titleFont = new Font("Times New Roman",Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN,28);
	
	public static void main(String[] args) {
		
		new Game();
	}
	
	public Game() {
		window = new JFrame("Game");
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		
		titlePanel = new JPanel();
		titlePanel.setBounds(100,100,600,150); //(x,y, width, heigh) starts at 100,100
		titlePanel.setBackground(Color.BLACK);
		titleLabel = new JLabel("UTS CYOA");
		titleLabel.setBackground(Color.black);
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(titleFont);
		
		startPanel = new JPanel();
		startPanel.setBounds(300,400,200,100);
		startPanel.setBackground(Color.BLACK);
		
		startButton = new JButton("START");
		startButton.setFocusPainted(false);
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		
		
		titlePanel.add(titleLabel);
		startPanel.add(startButton);
		
		con.add(titlePanel);
		con.add(startPanel);

	}
}
