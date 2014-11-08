public class Sarray {
    private int[] data;
    private int lastIndex;

    public Sarray(int n) {
	data = new int[n];
	lastIndex = 0;
    }

    public String toString() {
	String ans = "";
	for (int i = 0; i < data.length; i++) {
	    ans = ans + data[i] + ", ";
	}
	return ans;
    }

    public void expand() {
	if (lastIndex >= data.length) {
	    int[] ans = new int[data.length + 1];
	    for (int i = 0; i < data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }
    
    public boolean add(int i) {
	expand();
	data[data.length - 1] = i;
	lastIndex = lastIndex + 1;
	return true;
	/*
	if (size() < data.length) {
	    data[size() + 1] = i;
	    lastIndex = lastIndex + 1;
	    return true;
	} else {
	    expand(data);
	    data[size() + 1] = i;
	    lastIndex = lastIndex + 1;
	    return true;
	}
	*/
    }

    public void add(int val, int index) {
	expand();
	for (int i = lastIndex; i > 0; i--){
	    if (i > index) {
		data[i] = data[i - 1];
	    } else if (i == index) {
		data[i] = val;
		lastIndex = lastIndex + 1;
	    }
	}
    }

    public int get(int index) {
	return(data[index]);
    }

    public int set(int val, int index) {
	int original = data[index];
	data[index] = val;
	return original;
    }

    public int size() {
	//	lastIndex = lastIndex + 1;
	return lastIndex;
    }

    public int remove(int index) {
	int original = data[index];
	int[] ans = new int[data.length - 1];
	for (int i = 0; i < lastIndex; i++) {
	    if (i != index){
		ans[i] = data[i];
	    }
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
	/*
	int[] ans = new int[data.length - 1];
	for (int i = 1; i < ans.length + 1; i++) {
	    if (i != index) {
		ans[i-1] = data[i];
	    }
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
	*/
    }
}