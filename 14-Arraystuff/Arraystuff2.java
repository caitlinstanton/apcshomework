import java.util.*;

public class Arraystuff2 {
    private int[] a;
    private Random rnd;

    /*
    by making a variable final, we can't change the value
    after initial assignment
    public final int final_example = 123;
    */
    public Arraystuff2(int n) {
	rnd = new Random();
	a = new int[10];
	for (int i = 0; i < a.length; i++){
	    a[i] = rnd.nextInt(20 - 0) + 0;
	}
    }

    public Arraystuff2() {
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

    public int maxVal(int[] a){
	int value = a[0];
	for (int i = 1; i < a.length; i++){
	    if (value <= a[i]){
		value = a[i];
	    }
	}
	return value;
    }

    public int freq(int n) {
	int num = a[n];
	int retnum = 0;
	for (int i = 0;i<a.length;i++) {
	    if (a[i] == num) {
		retnum++;
	    }
	}
	return retnum;
    }
    
    public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++){
	    if(nums[i] == 6) {
		while(nums[i] != 7) {
		    i++;
		}
	    } else {
		sum = sum + nums[i];
	    }
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int number1 = 0;
	int number4 = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		number1 = number1 + 1;
	    }
	    if (nums[i] == 4) {
		number4 = number4 + 1;
	    }
	}
	return (number1 > number4);
    }

    public int[] tenRun(int[] nums) {
	int[] result = new int[nums.length];
	boolean multiple = false;
	int value = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 10 == 0) {
		multiple = true;
		value = nums[i];
		result[i] = nums[i];
	    } else if (nums[i] % 10 != 0 && multiple) {
		result[i] = value;
	    } else if (nums[i] % 10 != 0 && !multiple) {
		result[i] = nums[i];
	    }
	}
	return result;
    }

    public boolean tripleUp(int[] nums) {
    	for (int  i = 0; i < nums.length - 2; i++) {
		if (nums[i+1] - nums[i] ==1 && nums[i+2] - nums[i+1] ==1 ) {
			return true;
     		}
  	}
  	return false;
	}
	
public boolean canBalance(int[] nums) {
	for (int i = 0; i < nums.length; i++){
	    int frontTotal = 0;
	    int backTotal = 0;
	    for (int f = 0; f <= i; f++){
		frontTotal = frontTotal + nums[f];
	    }
	    for (int b = i + 1; b < nums.length; b++){
		backTotal = backTotal + nums[b];
	    }
	    if (frontTotal == backTotal){
		return true;
	    }
	}
	return false;
}

    public int[] seriesUp(int n) {
        int listLength = (n * (n + 1)) / 2;
	int[] result = new int[listLength];
	int position = 0;
	for (int i = 0;i <= n; i++){
	    for (int x = 1; x < i+1; x++){
		result[position] = x;
		position = position + 1;
	    }
	}
	return result;
    }

    public int mode() {
	int pos = 0;
	int index = 0;
	for (int i = 0; i < a.length; i++) {
	    if (freq(a[i]) > pos) {
		pos = freq(a[i]);
		index = 1;
	    }
	}
	System.out.println(a[index]);
	return pos;
    }

    public int fastMode() {
	
	for (int i = 0; i < A.length; i++) {
	    int value = A[i];
	    frequency[i] = freq(value);
	}
	return(maxVal(frequency));
    }
    
    public static void main(String[] args){
	Arraystuff2 as = new Arraystuff2();
	System.out.println(as);
	//	System.out.println(as.find(134));
	//	System.out.println(as.find(906));
	//	System.out.println(as.maxVal());
	System.out.println(as.mode());
    }
    
}
