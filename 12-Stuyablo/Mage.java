import java.util.*;
import java.io.*;

public class Mage extends Basechar {

    Random thing = new Random();
    Scanner userInput = new Scanner(System.in);
    
    public String spell(Basechar other){
	if(userInput == "spell1" && r.nextInt(this.getACC()) > 20 ) {
	    other.setHP(other.getHP() - 10);
	    this.setMP(this.getMP() - 20);
	    return(this + " shot a fireball at " + other);
	   
	}else if(userInput == "spell2" && r.nextInt(this.getACC()) > 0) {
	    other.setHP(other.getHP - 10);
	    this.setMP(this.getMP - 30);
	    return(this + " electrified " + other);
	}else if(userInput == "spell3" && r.nextInt(this.getACC()) > 20) {
	    other.setHP(other.getHP() - 20);
	    this.setMP(this.getMP() - 40);
	    return(this + " froze " + other);
	} else{
	    this.setMP(this.getMP()-30);
	    return "The spell fizzled and died";
	}
	

}
