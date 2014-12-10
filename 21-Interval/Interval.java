import java.util.*;
import java.io.*;

public class Interval implements Comparable{

    private int low;
    private int high;
    private static Random r = new Random();
    private static int numIntervals = 0;

    //static variables help by keeping track of something throughout the class

    //If you want to craete your own Interval
    public Interval(int l, int h) {
	low = l;
	high = h;
    }

    //If you want your own Interval created for you;
    public Interval() {
	int l = r.nextInt(100);
	//add 1 to make sure that h will be greater than 0 (in case l is greater than 0)
	int h = l + 1 + r.nextInt(100);

	/* ANOTHER WAY TO CREATE LOW/HIGH
	  int h = r.nextInt(100);
	  int l = 1 + r.nextInt(h);
	*/

	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public String toString() {
	//String result = "Interval " + numIntervals + ": " + "[" + low + ", " + high + "]";
	String result = "[" + low + ", " + high + "]";
	return result;
    }

	public int getLow() {
		return low;
	}
	
	public int getHigh() {
		return high;
	}
	
	public int compareTo(Object other) {
	    //casts other to the appropriate type and stores it in a local
	    //variable for convenience; specifies Object as an Interval, o
	    Interval o = (Interval)other;
	    
	    /* HOMEWORK CODE
	    int result = 0;
	    int aLow = this.getLow();
	    int bLow = other.getLow();
	    int aHigh = this.getHigh();
	    int bHigh = other.getHigh();
	    if (aLow == bLow && aHigh == bHigh) {
		result = 0;
	    } else if (aLow < bLow || aHigh < bHigh) {
			result = -10;
	    } else if (aLow > bLow || aHigh > bHigh) {
			result = 10;
	    }
	    return result;
	    */
	    
	    if (this.low == o.low) {
		return this.high - o.high;
	    } else {
		return this.low - o.low;
	    }

	    /* Checks the width of the Interval
	    return (this.high - this.low) - (o.high - o.low);
	    */
	    }
    
    public static void printStuff() {
	System.out.println("Stuff");
    }
    
    public static void main (String[] args) {
	
	/*
	ival.printStuff(); //normal calling of an instance
	printStuff(); //since printStuff is static, we can call it without an instance
	Interval.printStuff(); //we can also call it off a class

	Interval[] a = new Interval[10];
	for (int i = 0; i < 10; i++) {
	    a[i]= new Interval();
	}
	System.out.println(Arrays.toString(a));
	*/
	
	Interval a = new Interval();
	Interval b = new Interval();
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(a.compareTo(b));

	//String[] can be sorted because it has a built-in compareTo routine
	//items can only be sorted with a compareTo method
	String [] sa = {"hello", "frog", "absolute", "zoo", "bagel"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));

	int [] ia = {5, 3, 9, 17, -3, 40, 89, 12};
	System.out.println(Arrays.toString(ia));
	Arrays.sort(ia);
	System.out.println(Arrays.toString(ia));
    }

    //Interface: a specification that lists methods
    //A class that implements an interface must define ALL of the methods in the interface
    //You can only extend one class, but you can implement multiple interfaces
    //Structure-
    
    /*
    interface name {
       method signature;
       method signature;
    }

    where method signature is public/private, and has a name and (parameters)
    */

    //there is a built-in interface called comparable in java
    /*
      interface Comparable {
         public int compareTo (object other);
      }
     */
}
