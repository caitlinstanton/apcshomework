import java.io.*;
import java.util.*;

//ArrayList is a class similar to that of Sarray
//It had get, set, add, expand, remove, etc. methods
//But the list is underneath the ArrayList object, allowing it to store
//variables of more than one type (which is error prone).

public class Driver {
    public static void main(String[] args) {
	
	//This limits the ArrayList object to holding a list that can
	//only contain strings
	//This line also declares the ArrayList object
	ArrayList <String> al;
	//While this line instantiates the ArrayList
        al = new ArrayList<String>();
	
	System.out.println(al);
	al.add("hello");
	System.out.println(al);
	al.add("world");
	System.out.println(al);
	al.add("33");
	System.out.println(al);
    }

}
