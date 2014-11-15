import java.util.*;
import java.io.*;

public class Randomize {
    public static void main(String[] args) {
	ArrayList<Integer> ai = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
	    ai.add(i);
	}
	System.out.println(ai);
	ArrayList<Integer> newlist = new ArrayList<Integer>();
	for (int c = 0; c < 10; c++) {
	    Random i = new Random();
	    int d = i.nextInt(ai.size());
	    int e = ai.get(d);
	    newlist.add(e);
	    ai.remove(d);
	}
	System.out.println(newlist);
    }
}