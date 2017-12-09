package game;

import players.Character;
import players.Normie;

public class Testing_Space {

	public static void main(String[] args) {
		
		Character Steve = new Character("Harvard", "Memester", 2, 2, 2);
		Steve.whomst();
		
		Normie Joe = new Normie("Wharton");
		Joe.whomst();

	}

}
