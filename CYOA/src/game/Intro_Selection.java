package game;

import java.util.*;

public class Intro_Selection {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?" );
		String username = scan.nextLine();
		
		String firstchar_username = username.substring(0,1);
		String rest_username = username.substring(1, username.length());
		username = firstchar_username.toUpperCase() + rest_username;
		System.out.println("Oh, hi " + username + "!\n");
		
		System.out.println("Pick a class! Use number to refer to your selection, i.e. 1 = Normie, 2 = Baller, etc.");
		String[] classes = {"Normie", "Baller", "3rd Floor Man", "SHOW Enthusiast", "DECA Man"};
		System.out.println(Arrays.toString(classes));
		int myclass_num = scan.nextInt();
		
		while ((myclass_num > 5) || (myclass_num < 1)){
			System.out.println("Pick a valid class.");
			myclass_num = scan.nextInt();
		}
		
		String myclass = classes[myclass_num - 1];
		System.out.println("You\'re a " + myclass + "!");
		
		scan.close();

	}	

	static boolean test(int mystat, int minstat) {
		boolean outcome = (mystat >= minstat) ? true : false;
		return outcome;
	}

}
