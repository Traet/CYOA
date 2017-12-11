package game;

public class Character {
	String name;
	int brain;
	Character(String n,int i){
		name = n;
		brain = i;
	}
	void display(){System.out.println("Name:"+name+" Brains:" + brain);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jock a = new Jock("John");
		a.display();
		
	}

}
class Jock extends Character{

	Jock(String name) {
		super(name, 1);
	}
}
