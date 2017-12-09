package game;

import java.util.Scanner;
import java.util.Arrays;
import players.Character;

public class Intro_Selection {

//branch 'Albert' of https://github.com/Traet/CYOA.git
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello there! \n");
		
		System.out.println("Pick a class! Use a number to refer to your selection, i.e. 1 = Normie, 2 = Baller, etc.");
		String[] classes = {"Normie", "Baller", "3rd Floor Man", "SHOW Enthusiast", "DECA Dude"};
		System.out.println(Arrays.toString(classes));
		int myclass_num = scan.nextInt();
		
		while ((myclass_num > 5) || (myclass_num < 1)){
			System.out.println("Pick a valid class.");
			myclass_num = scan.nextInt();
		}
		
		System.out.println("Select an aspiration! Again, use numbers to refer to your choice.");
		String[] asps = {"Wharton", "Harvard", "UofT", "McGill", "Uninspired"};
		System.out.println(Arrays.toString(asps));
		int myasp_num = scan.nextInt();
		
		while ((myasp_num > 5) || (myasp_num < 1)){
			System.out.println("Pick a valid aspiration.");
			myasp_num = scan.nextInt();
		}
		
		String myclass = classes[myclass_num - 1];
		String myasp = asps[myasp_num - 1];
		
		Character player = new Character();
		player.setMyclass(myclass);
		player.setAspiration(myasp);
				
		switch (myclass) {
		case "Normie": 
			player.setStats(1, 1, 1);
			break;
		case "Baller":
			player.setStats(3, 0, 0);
			break;
		case "3rd Floor Man":
			player.setStats(0, 3, 0);
			break;
		case "SHOW Enthusiast":
			player.setStats(1, 0, 2);
			break;
		case "DECA Dude":
			player.setStats(0, 2, 1);
			break;
		}
		
		player.whomst();
					
		
		/*String firstchar_myclass = myclass.substring(0,1);
		String rest_myclass = myclass.substring(1, myclass.length());
		myclass = firstchar_myclass.toUpperCase() + rest_myclass;
		
		List<String> classes_list = Arrays.asList(classes);
		
		while (!(classes_list.contains(myclass))) {
			System.out.println("Pick a valid class.");
			myclass = scan.nextLine();
		} 
		System.out.println("You\'re a " + myclass + "!");*/
		
		scan.close();

	}	

	static boolean test(int mystat, int minstat) {
		boolean outcome = (mystat >= minstat) ? true : false;
		return outcome;
	}

}
