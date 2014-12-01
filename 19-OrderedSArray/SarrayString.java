public class SarrayString {
    public String[] data;
    public int lastIndex;

    public SarrayString() {
	data = new String[5];
	lastIndex = 0;
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
	for (int i = 0; i < lastIndex; i++) {
	    if (i != index){
		ans[i] = data[i];
	    }
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
    }
}
