package game;

import players.*;
import players.Character;

public class Testing_Space {

	public static void main(String[] args) {
		
		Character Steve = new Character("Harvard", "Memester", 2, 2, 2);
		Steve.whomst();
		
		DECA_Dude Joe = new DECA_Dude("Wharton");
		Joe.whomst();

	}

}
