import java.util.*;
import java.io.*;

public class Randomize {

    //RANDOMIZING AN OBJECT OF ARRAYLIST
    /* by choosing a random element, removing it from the original arraylist, and 
       adding it to the end of the new arraylist */
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
    /* by choosing a random element, removing it from its original index, and 
       adding it to the end of the original arraylist */
    public ArrayList<Integer> shuffle2(ArrayList<Integer> a) {
	/* len = a.size();
	   1. choose a random element from 0 to len
	   2. remove it
	   3. add it to the end
	   4. subtract one from len
	   5. go back to one until len = 0
	*/
	Random rnd = new Random();
	for (int len = a.size(); len > 0; len--){
	    System.out.println("WEEE");
	    int i = rnd.nextInt(len);
	    int v = a.remove(i);
	    a.add(v);
	}
	return a;
    }

    public ArrayList<Integer> shuffle3(ArrayList<Integer> a) {
	/* len = a.size();
	   1. choose a random element from 0 to len
	   2. swap it with a[len - 1]
	   3. subtract one from len
	   4. go back to one until len = 0
	*/
	Random rnd = new Random();
	for (int len = a.size(); len > 0; len--){
	    System.out.println("WEEE");
	    int i = rnd.nextInt(len);
	    int temp = a.get(i);
	    a.set(i, len - 1);
	    a.set(len - 1, temp);
	}
	return a;
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
	System.out.println("Before ArrayList was randomized: " + ai);
	System.out.println("After ArrayList was randomized: " + thing.shuffle2(ai));
	System.out.println(" ");
       	System.out.println("Before ArrayList was randomized: " + ai);
	System.out.println("After ArrayList was randomized: " + thing.shuffle3(ai));
	System.out.println(" ");
	System.out.println("Before array was randomized: " + thing.toString(intlist));
	System.out.println("After array was randomized: " + thing.Randomize(intlist));
    }
}
