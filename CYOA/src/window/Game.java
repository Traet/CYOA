package window;

import java.awt.*;
import javax.swing.JFrame;

public class Game {
	
	JFrame window;

	public static void main(String[] args) {
		
		new Game();
	}
	
	public Game() {
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
	}
}
