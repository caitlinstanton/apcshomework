import java.util.Random;

public class Monster extends BaseChar {

    Random thing = new Random();

    public Monster(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	 super(h,m,a,d,s,ac,c,n,w);
    }

    public void claws(BaseChar other){
	if (thing.nextInt(10) <= 8) {
	    int damage = 10 + thing.nextInt(11);
	    other.setHP(other.getHP() - damage);
	    System.out.println(this + " swiped at " + other + ". " + other + " lost "+ damage+ " HP.");
	    }
	else {
	    System.out.println("Claws did not reach target...");
	}
    }

    public void teeth(BaseChar other) {
	if (thing.nextInt(10) < 8) {
	    int damage = 15 + thing.nextInt(11);
	    other.setHP(other.getHP() - damage);
	    System.out.println(this + " savagely bit "+ other + ". " + other + " lost "+ damage+ " HP.");
	    }
	else {
	    System.out.println(other + " was out of biting reach...");
	}
    }
	
    public void wrath(BaseChar other) {
	if (thing.nextInt(10) < 7) {
	    int damage = 10 + thing.nextInt(11);
	    other.setHP(other.getHP() - damage);
	    System.out.println(this + " howled into the moonlight, summoniong a great evil upon " + other + ". " + other + " lost "+ damage+ " HP.");
		if (thing.nextInt(2)== 1) {
			System.out.println(other + " was poisoned!");
			other.makePoisoned();
		    }
	    }
	else {
	    System.out.println(other+ " blinded " + this + " with their beauty... attack missed.");
	}
    }
}
