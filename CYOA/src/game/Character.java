package game;

public class Character {
	
	public String name;
	public int athl;
	public int brain;
	public int art;
	public String myclass;
	
	Character(String e, String a, int b, int c, int d) {
		this.setPlayer(e, a, b, c, d);
	}
	
	public void setPlayer(String e, String a, int b, int c, int d) {
		this.myclass = e;
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
		System.out.println("This is " + name + ", a " + myclass + ". His/her athleticism, brain, and art stats are " + athl + ", " + brain + ", and " + art + ", respectively.");
	}
	
}
