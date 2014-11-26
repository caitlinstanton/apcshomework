public class OrderedSuperArray extends SarrayString {

    public boolean add(String i) {
	expand();
	for (int k = 0; k < data.length(); k++) {
	    for (int j = 0; j < data[i].length(); j++) {
		if ((i.charAt(j)).compareTo(data[k].charAt(j)) > 0) {
		    String[] ans = new String[data.length + 1];
		    for (int m = 0; m < ans.length(); m++) {
			if (m < j || m > j) {
			    ans[m] = data[m];
			}
			if (m == j) {
			    ans[m] = i;
			}
		    }
		}
		if ((i.charAt(j)).comapreTo(data[k].charAt(j))
	return true;
