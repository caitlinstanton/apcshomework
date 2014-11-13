import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++){
	    ai.add(r.nextInt(8));
	}
	System.out.println("Before checking for duplicates:");
	System.out.println(ai);
	int c = 0;
	while (c < ai.size() - 1){
	    if (ai.get(c) == ai.get(c + 1)){
		ai.remove(c + 1);
	    } else {
		c++;
	    }
	}
	System.out.println("After checking for duplicates:");
	System.out.println(ai);
    }
}