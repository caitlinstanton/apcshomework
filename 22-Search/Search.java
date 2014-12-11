import java.util.*;
import java.io.*;

public class Search implements Comparable{

    private ArrayList<Integer> ai;
    ai = new ArrayList<Integer>();
    private Random rnd = new Random();
    
    public Search() {
	for (int i = 0; i < 20; i++) {
	    int tmp = rnd.nextint(1000);
	    ai.add(tmp);
	}
    }

    public Comparable lSearch(int num) {
	for (int i = 0; i < ai.size(); i++) {
	    if (ai.get(i).compareTo(num) == 0) {
		
    }

    public int bSearch() {

    }

    public rbSearch() {

    }

    public void static main (String[] args) {
	
