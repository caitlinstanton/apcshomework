import java.util.*;
import java.io.*;

public class Search {

    private Comparable[] a;
    private int lastIndex;
	private Scanner scan = new Scanner(System.in);

    public Search() {
		System.out.println("How many elements do you want your array to have?");
		int i = scan.nextInt();
		a = new Comparable[i];
		lastIndex = 0;
    }

	public String toString() {
		String ans = "[";
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				ans = ans + a[i] + ", ";
			} else {
				ans = ans + a[i] + "]";
			}
		}
		return ans;
    }

    public void expand() {
		Comparable[] newList = new Comparable[a.length + 1];
		for (int index = 0; index < a.length; index++) {
			newList[index] = a[index];
		}
		a = newList;
    }

    public boolean add(Comparable item) {
		if (a[a.length - 1] != null){
			expand();
		}
		while (a[lastIndex] != null) {
			lastIndex++;
		}
		a[lastIndex] = item;
		lastIndex++;
		return true;
    }

    public void addItem(int index, Comparable item) {
		if (index > a.length - 1 || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (a[a.length - 1] != null){
			expand();
		}
		for (int i = a.length - 1; i > index; i--) {
			a[i] = a[i - 1];
		}
		a[index] = item;
	}

    public void sort() {
		Arrays.sort(a);
    }

    public int size() {
		return a.length;
    }

    public Comparable lsearch(Comparable val) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(val)) {
				return val;
			}
		}
		return null;
    }

    public Comparable bsearch(Comparable val) {
		sort();
		int low = 0;
		int high = a.length - 1;
		int mid = (low + high) / 2;
		while (low <= high) {
			if (val.compareTo(a[mid]) == 0) {
				return val;
			} else {
				if (val.compareTo(a[mid]) > 0) {
					low = mid + 1;
				} else {
					//basically if val.compareTo(a[mid]) < 0
					high = mid - 1;
				}
			}
			mid = (low + high) / 2;
		}
		return null;
    }

    public Comparable rbsearch(Comparable val, int low, int high) {
		int mid = (low + high) / 2;
		if (low <= high) {
			if (val.compareTo(a[mid]) == 0) {
				return val;
			} else {
				if (val.compareTo(a[mid]) > 0) {
					return rbsearch(val, mid + 1, high);
				} else {
					//basically if val.compareTo(a[mid]) < 0
					return rbsearch(val, low, mid - 1);
				}
			}
		} else {
			return null;
		}
    }

    public static void main(String[] args) {
		Search s = new Search();
		Random rnd = new Random(); 
		for (int i = 0; i < s.size(); i++) {
			s.add(rnd.nextInt(10));
		}
		System.out.println("Before sort:");
		System.out.println(s);
		System.out.println("After sort:");
		s.sort();
		System.out.println(s);
		System.out.println(s.lsearch(5));
		System.out.println(s.bsearch(5));
		System.out.println(s.rbsearch(5,0,s.size()));
    }
}