package game;

public class Character {
	
	public int athl;
	public int brain;
	public int art;
	public String myclass;
	public String aspiration;
	
	Character(){
		
	}
	
	Character(String a, String e, int b, int c, int d) {
		this.setPlayer(a, e, b, c, d);
	}
	
	public void setPlayer(String a, String e, int b, int c, int d) {
		this.myclass = e;
		this.aspiration = a;
		this.athl = b;
		this.brain = c;
		this.art = d;
	}
	
	public void setAspiration(String a) {
		this.aspiration = a;
	}
	
	public void setAthl(int b) {
		this.athl = b;
	}
	
	public void setBrain(int c) {
		this.brain = c;
	}
	
	public void setArt(int d) {
		this.art = d;
	}
	
	void whomst() {
		System.out.println("This is a " + aspiration + " " + myclass + ". His/her athleticism, brain, and art stats are " + athl + ", " + brain + ", and " + art + ", respectively.");
	}
	
}
