/* superclass of Warrior and Mage */
public class Basechar {

    
    private String name;
    private int level;
    private int health;

    /*
    public Basechar () {
	name = "object";
	level = 1;
	health = 20;
    }

    // private int health=20;

    public void displayDetails() {
	System.out.println(name);
	System.out.println(level);
	System.out.println(health);
    }
    */

    public int getHealth() {
	return health;
    }

    public void setHealth(int i){
	health = i;
    }
}
