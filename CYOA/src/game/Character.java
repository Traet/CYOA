package game;

public class Character {
	
	private String name;
	private int athl;
	private int brain;
	private int art;
	
	Character(String a, int b, int c, int d) {
		this.setPlayer(a, b, c, d);
	}
	
	public void setPlayer(String a, int b, int c, int d) {
		this.name = a;
		this.athl = b;
		this.brain = c;
		this.art = d;
	}
	
	public void setName(String a) {
		this.name = a;
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
		System.out.println("This is " + name + ". His/her athleticism, brains, and art stats are " + athl + ", " + brain + ", and " + art + ", respectively.");
	}
	
}
