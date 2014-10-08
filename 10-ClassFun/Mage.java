
public class Mage extends Basechar{
    //private int manna = 200;
    private String name;
    private int mana;
    
    public Mage () {
	name = "Sage";
	mana = 100;
    }

    // private int health=20;

    public void displayDetails() {
	System.out.println(name);
	System.out.println(mana);
	System.out.println(health);
    }

    public int getManna(){
	return mana;
    }
}
