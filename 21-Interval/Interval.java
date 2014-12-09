import java.util.*;
import java.io.*;

public class Interval {

    private int low;
    private int high;
    private Random r = new Random();
    private static int numIntervals = 0;

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

    //compareTo routine
    //compares two intervals
    //one with lower low is less; if lows are equal, one with lower high is less
    //equal = 0
    //first interval less than = -1
    //first interval greater than =  1
    public static void printStuff() {
	System.out.println("Stuff");
    }
    
    public static void main (String[] args) {
	
	Interval ival = new Interval();
	ival.printStuff(); //normal calling of an instance
	printStuff(); //since printStuff is static, we can call it without an instance
	Interval.printStuff(); //we can also call it off a class

	Interval[] a = new Interval[10];
	for (int i = 0; i < 10; i++) {
	    a[i]= new Interval();
	}
	System.out.println(Arrays.toString(a));
    }

}
