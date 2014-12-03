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

    public String set (String word, int index) {
	String result;
	if (index > super.showList().length) {
	    result = "ARRAY OUT OF BOUNDS";
	} else {
	    result = "The original element was: " +  super.remove(index);
	    add(word);
	}
	return result;
    }
}
