import java.io.*;
import java.util.*;

public class TwoD {

    public static void main(String[] args) {
	//declaration for an array composed of an array of ints
	int[][] a;
	//this array of arrays can store up to 15 ints
	a = new int[5][3];
	System.out.println(a.length);
	System.out.println(a[2].length);
	System.out.println(a[2][2]);

	for (int i = 0; i < a.length; i++){
	    System.out.println("row " + i + " has length " + a[i].length);
	    for (int j = 0; j < a[i].length; j++) {
	        System.out.print(a[i][j] + ",");
	    }
	    System.out.println();
	}
    }
}
