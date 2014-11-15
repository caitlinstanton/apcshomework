import java.util.*;
import java.io.*;

public class Randomize {

    //RANDOMIZING AN OBJECT OF ARRAYLIST
    public ArrayList Randomize(ArrayList<Integer> ai) {
	ArrayList<Integer> newlist = new ArrayList<Integer>();
	for (int c = 0; c < 10; c++) {
	    Random i = new Random();
	    int index = i.nextInt(ai.size());
	    int val = ai.get(index);
	    newlist.add(val);
	    ai.remove(index);
	}
	return newlist;
    }


   public String toString(int[] n) {
	String ans = "";
	for (int c = 0; c < n.length; c++) {
	    if (c < n.length - 1){
		ans = ans + n[c] + ", ";
	    } else {
		ans = ans + n[c];
	    }
	}
	return ans;
    }


    //RANDOMIZING AN ARRAY
    public String Randomize(int[] intlist) {
	int[] newlist = new int[intlist.length];
	boolean used;
	Random i = new Random();
	for (int c = 0; c < intlist.length; c++) {
	    used = false;
	    while(used == false){
		int rand = i.nextInt(intlist.length);
		if (intlist[rand] != -10) {
		    newlist[c] = intlist[rand];
		    intlist[rand] = -10;
		    used = true;
		}
	    }
	}
	return toString(newlist);
    }

    public static void main(String[] args) {
	Randomize thing = new Randomize();
	ArrayList<Integer> ai = new ArrayList<Integer>();
	int[] intlist = new int[10];
        for (int i = 0; i < 10; i++) {
	    ai.add(i);
	    intlist[i] = i;
	}
	System.out.println("Before ArrayList was randomized: " + ai);
	System.out.println("After ArrayList was randomized: " +thing.Randomize(ai));
	System.out.println(" ");
	System.out.println("Before array was randomized: " + thing.toString(intlist));
	System.out.println("After array was randomized: " + thing.Randomize(intlist));
    }
}