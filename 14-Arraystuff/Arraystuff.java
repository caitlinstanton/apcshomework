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
	return (value);
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

    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(134));
	System.out.println(as.find(906));
	System.out.println(as.maxVal());
    }
    
}
