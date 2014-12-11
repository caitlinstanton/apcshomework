import java.util.*;
import java.io.*;

public class Mage extends BaseChar implements Comparable{

    Random thing = new Random();
    
    public Mage(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	 super(h,m,a,d,s,ac,c,n,w);
    }
	
	/*
	public int getVal(String a, Mage[] m) {
		int val = 0;
		int tmp = 0;
		for (int i = 0; i < longest(m); i++) {
			tmp = a.charAt(i) - b.charAt(i);
			val = val + tmp
		}
		return val;
	}
	*/
	
	public int compareTo (Object other) {
		Mage o = (Mage)other;
		return this.toString().compareTo(o.toString());
	}
			
	public String printList(Mage[] a) {
		String ans = "";
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				ans = ans + a[i].toString();
			} else {
				ans = ans + a[i].toString() + ", ";
			}
		}
		return ans;
	}
	
    public String spell(Monster other, String userInput){
	if(userInput.equals( "1") && thing.nextInt(this.getACC()) > 20 ) {
	    if ((this.getMP() - 20) < 0) {
		return("Not enough mana!");
	    } else {
		int damage = 15 + thing.nextInt(11);
		other.setHP(other.getHP() -  damage);
		this.setMP(this.getMP() - 20);
		return(this + " shot a fireball at " + other + ". " + other + " lost " + damage + "  HP." );
	    }
	}else if(userInput.equals("2") && thing.nextInt(this.getACC()) > 0) {
	    if ((this.getMP() - 30) < 0) {
		return("Not enough mana!");
	    } else {
	        int damage = 15 + thing.nextInt(11);
		other.setHP(other.getHP() - damage);
		this.setMP(this.getMP() - 30);
		return(this + " electrified " + other + ". " + other + " lost " + damage + "  HP.");
	    }
	}else if(userInput.equals("3") && thing.nextInt(this.getACC()) > 20) {
	    if ((this.getMP() - 40) < 0) {
		return("Not enough mana!");
	    } else {
		int damage = 25 + thing.nextInt(11);
		other.setHP(other.getHP() - damage);
	    this.setMP(this.getMP() - 40);
	    return(this + " froze " + other + ". " + other + " lost " + damage + " HP.");
	    }
	} else {
	    if (userInput.equals("1")) {
		this.setMP(this.getMP()-20);
		return "The spell fizzled and died";
	    }
	    if (userInput.equals("2")) {
	        this.setMP(this.getMP()-30);
		return "The spell fizzled and died";
	    }
	    if (userInput.equals("3")) {
		this.setMP(this.getMP()-40);
		return "The spell fizzled and died";
	    }
	    if (userInput.equals("")) {
		return this.toString() + " did nothing.";
	    }
	    if (this.getMP() < 0) {
		this.setMP(0); 
	    }
	    return "";
	}
    }	
} 
