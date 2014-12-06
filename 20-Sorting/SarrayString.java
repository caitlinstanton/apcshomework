import java.util.*;
import java.io.*;

public class SarrayString {
    public String[] data;
    private int lastIndex;

    public SarrayString() {
	lastIndex = 0;
	data = new String[5];
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Now you get to create an array of strings:");
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("How many elements do you want to start with?");
	int n = scan.nextInt();
	if (n > 0) {
	    data = new String[n];
	} else {
	    System.out.println("Invalid entry");
	    System.exit(0);
	}
	System.out.println("");
	System.out.println("Now it's time to add some string elements!");
	System.out.println("");
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {}
	int i = 0;
	String val;
	while (i < n) {
		System.out.println("What string do you want to add?");
		val = scan.next();
		set(val,i);
		i++;
		System.out.println("");
    }
	System.out.println("Here's your array");
	System.out.println(toString());
	System.out.println("");
	System.out.println("Now it's time to sort it!");
	try {
	    Thread.sleep(3000);
		System.out.println("");
	} catch (Exception e) {}
	System.out.println("Which method do you want to use: insertion, selection, or bubble?");
	while (scan.hasNext()) {
		String sort = scan.next();
		if (sort.equals("insertion")) {
			System.out.println("");
			System.out.println("Here's your array arranged using the insertion sort method");
			iSort();
			System.out.println(toString());
			break;
		} else if (sort.equals("selection")) {
			System.out.println("");
			System.out.println("Here's your array arranged using the selection sort method");
			sSort();
			System.out.println(toString());
			break;
		} else if (sort.equals("bubble")) {
			System.out.println("");
			System.out.println("Here's your array arranged using the bubble sort method");
			bSort();
			System.out.println(toString());
			break;
		} else {
			System.out.println("Invalid entry.");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {}
			System.out.println("Which method do you want to use: insertion, selection, or bubble?");
		}
	}
	}

    public String toString() {
	String ans = "";
	for (int i = 0; i < data.length; i++) {
	    if (i < data.length - 1) {
		ans = ans + data[i] + ", ";
	    } else {
		ans = ans + data[i];
	    }
	}
	return ans;
    }

    public void expand() {
	if (lastIndex >= data.length) {
	    String[] ans = new String[data.length + 1];
	    for (int i = 0; i < data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }
    
    public String[] showList() {
	return data;
    }

    public boolean add(String i) {
	expand();
	data[lastIndex] = i;
	lastIndex = lastIndex + 1;
	return true;
    }

    public void add(String val, int index) {
	for (int i = lastIndex; i > 0; i--){
	    if (i > index) {
		data[i] = data[i - 1];
	    } else if (i == index) {
		data[i] = val;
		lastIndex = lastIndex + 1;
	    }
	}
    }

    public String get(int index) {
	return(data[index]);
    }

    public String set(String val, int index) {
	String original = data[index];
	data[index] = val;
	return original;
    }

    public int size() {
	return lastIndex;
    }

    public String remove(int index) {
	String original = data[index];
	String[] ans = new String[data.length - 1];
	int i = 0;
	//places all elements before the requested index in the new array
	for (i = i; i < index; i++) {
	    ans[i] = data[i];
	}
	//skip requested index, essentially removing it from the array
	//places all elements after the requested index in the array
	for (i = i; i < ans.length; i++) {
	    ans[i] = data[i+1];
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
    }

    public void iSort() {
	for (int n = 1; n < data.length; n++) {
	    String newVal = data[n];
	    int i;
	    for (i = n - 1; i > -1 && data[i].compareTo(newVal) > 0; i--) {
       	/* ANOTHER METHOD
            for (i = n; i > 0 && newVal.compareTo(data[i-1]) >= 0; i--){
                data[i] = data[i-1];
	    }
	*/
		data[i+1] = data[i];
	    }
	    data[i+1] = newVal;
	}
    }

    public void sSort() {
	String s1;
	String s2;
	String minVal;
	for (int i = 0; i < data.length; i++) {
	    int index = i;
	    minVal = data[i];
	    for (int n = i + 1; n < data.length; n++) {
		if (minVal.compareTo(data[n]) > 0) {
		    minVal = data[n];
		    index = n;
		}
	    }
	    s1 = data[i];
	    s2 = minVal;
	    data[i] = s2;
	    data[index] = s1;
	}
    }

    public void bSort() {
	    String larger;
	    String smaller;
		for (int i = 0; i < data.length - 1; i++) {
			for (int n = 0; n < data.length - 1; n++) {
				if(data[n].compareTo(data[n+1]) > 0) {
					larger = data[n];
					smaller = data[n+1];
					data[n] = smaller;
					data[n+1] = larger;
				}
			}
		}
	}
}
