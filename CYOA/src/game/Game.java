package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game {
	//Initialize
	
	JFrame window;
	Container con;
	JPanel titlePanel, startPanel, mainPanel, choicePanel;
	JLabel titleLabel;
	JButton startButton,choice1,choice2,choice3;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman",Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN,28);
	
	TitleHandler tHandler = new TitleHandler();
	
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
		startButton.addActionListener(tHandler);
		
		
		titlePanel.add(titleLabel);
		startPanel.add(startButton);
		
		con.add(titlePanel);
		con.add(startPanel);

	}
	public void createGameScreen() {
		//Make title and start button invisible
		titlePanel.setVisible(false);
		startPanel.setVisible(false);
		
		//Main Text Area
		mainPanel = new JPanel();
		mainPanel.setBounds(100, 100, 600, 250);
		mainPanel.setBackground(Color.blue);
		con.add(mainPanel);
		
		mainTextArea = new JTextArea("Test");
		mainTextArea.setBounds(100,100,600,250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainPanel.add(mainTextArea);
		
		//choice panel
		choicePanel = new JPanel();
		choicePanel.setBounds(250,350,300,150);
		choicePanel.setBackground(Color.red);
		choicePanel.setLayout(new GridLayout(3,1));
		con.add(choicePanel);
		

		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFocusPainted(false);
		choice1.setFont(normalFont);
		choicePanel.add(choice1);
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		
		choicePanel.add(choice2);
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choicePanel.add(choice3);
		
	}
	
	public class TitleHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			createGameScreen();
		}
		
	}
}
