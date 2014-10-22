import java.util.*;
import java.io.*;

public class Mage extends BaseChar {

    Random thing = new Random();

    
    public Mage(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	 super(h,m,a,d,s,ac,c,n,w);
    }
    public String spell(BaseChar other, String userInput){
	while (this.getMP() > 0) {
		int accuracy = this.getACC();
		String message;
		if(userInput == "spell1" && accuracy > 20 ) {
	    		other.setHP(other.getHP() - 10);
	    		this.setMP(this.getMP() - 20);
	    		message = this + " shot a fireball at " + other;	   
		}else if(userInput == "spell2" && accuracy > 0) {
	    		other.setHP(other.getHP() - 10);
	    		this.setMP(this.getMP() - 30);
	    		message = this + " electrified " + other;
		}else if(userInput == "spell3" && accuracy > 20) {
	    		other.setHP(other.getHP() - 20);
	    		this.setMP(this.getMP() - 40);
	    		message = this + " froze " + other;
		} else{
	    		this.setMP(this.getMP()-30);
	    		message = "The spell fizzled and died";
		}
		accuracy = r.nextInt(10) + accuracy - 5;
		return message;
	}
	return "";
    }	

}