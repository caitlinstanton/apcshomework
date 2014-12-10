import java.util.*;
import java.io.*;

public class Interval {

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
	
	public int compareTo(Interval other) {
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

		/*
		  if (this.low == other.low) {
		     return this.high - other.high;
		  } else {
		     return this.low - other.low;
		  }
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
    }

}
