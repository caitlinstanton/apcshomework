import java.util.*;

public class Arraystuff {
    private int[] a;
    private Random rnd;

    /*
    by making a variable final, we can't change the value
    after initial assignment
    public final int final_example = 123;
    */
    public Arraystuff(int n) {
	rnd = new Random();
	a = new int[100];
	for (int i = 0; i < a.length; i++){
	    a[i] = rnd.nextInt(150 - 75) + 75;
	}
    }

    public Arraystuff() {
	this(100);
    }

    public String toString(){
	String s = "";
	//length for arrays is a variable with a final value
	for (int i = 0; i < a.length; i++){
	    if (i < a.length - 1) {
		s = s + a[i] + ", ";
	    } else {
		s = s + a[i];
	    }
	}
	/*
	this is invalid because the var is final final_example = 123
	s = s + final_example;
	*/
	return s;
    }

    public int find(int n) {
    	int value = -1;
    	for (int i = 0; i < a.length; i++){
	    if(a[i] == n){
		value = i;
	    }
	}
	return value;
    }
    
    public int find2(int n) {
	for (int i = 0; i < a.length; i++){
	    if(a[i] == n){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(){
	int value = a[0];
	for (int i = 1; i < a.length; i++){
	    if (value < a[i]){
		value = a[i];
	    }
	}
	return value;
    }

    //I literally had no idea how to do this problem
    //This is a solution I found off of the Internet and understand, but I definitely couldn't have gotten it myself
    //in a reasonable time frame.
    public int maxMirror(int[] nums) {
	int length = nums.length;
	int mirrorMax = 0;
	for (int start = 0; start < length; start++) {
	    int counter = 0;
	    for (int end = length - 1; start + counter != length && end > -1; end--) {
		if (nums[start + counter] == nums[end]) {
		    counter++;
		}
		else {
		    if (counter > 0) {
			mirrorMax = Math.max(counter, mirrorMax);
			counter = 0;
		    }
		}
	    }
	    mirrorMax = Math.max(counter, mirrorMax);
	}
	return mirrorMax;
    }
    
    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	//	System.out.println(as);
	//	System.out.println(as.find(134));
	//	System.out.println(as.find(906));
	//	System.out.println(as.maxVal());
	System.out.println(as.freq(17));
    }
    
}
