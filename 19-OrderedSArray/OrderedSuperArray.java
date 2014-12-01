public class OrderedSuperArray extends SarrayString {

    public boolean add(String word) {
	if (size() >= super.size()) {
	    super.expand();
	}
	if (size() == 0) {
	    super.add(word);
	} else if (word.compareTo(get(size() - 1)) > 0) {
	    add(word,size());
	} else {
	    for (int i = 0; i < size(); i++) {
		if (word.compareTo(get(i)) < 0) {
		    add (word, i);
		    break;
		}
	    }
	}
	return true;
    }

    public void set (String word, int index) {
        this.remove(index);
	this.add(word);
    }
    
    public String remove(int index) {
	String original = this.data[index];
	String[] ans = new String[data.length - 1];
	for (int i = 0; i < lastIndex; i++) {
	    if (i != index){
		ans[i] = this.data[i];
	    }
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
    }
    
}
