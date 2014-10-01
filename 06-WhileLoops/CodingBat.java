public class CodingBat {
    //took about 7 minutes
    public String frontTimes(String str, int n) {
	String s = "";
	if (str.length() > 3) {
	    s = str.substring(0,3);
	} else {
	    s = str;
	}
	String answer = "";
	while (n > 0) {
	    answer = answer + s;
	    n = n - 1;
	}
	return answer;
    }
    //took about 5 minutes
    public String stringBits(String str) {
	String result = "";
	int index = 0;
	while (index < str.length()) {
	    result = result + str.substring(index, index + 1);
	    index = index + 2;
	}
	return result;
    }
    //took about 15 minutes
    public String stringYak(String str) {
	int index = 0;
	StringBuffer s = new StringBuffer(str);
	while (index < s.length() - 2) {
	    if ((s.substring(index, index + 1)).equals("y") == true) {
		if ((s.substring(index + 2, index + 3)).equals("k") == true) {
		    s.delete(index, index + 3);
		}
	    }
	index = index +1;
    }
	str = s.toString();
	return str;
    }
    //took about 7 minutes
    public int stringMatch(String a, String b) {
	int i = 0;
	int result = 0;
	while (i < a.length() - 1 && i < b.length() - 1) {
	    if((a.substring(i, i + 2)).equals(b.substring(i, i + 2))) {
		result = result + 1;
	    } 
	    i = i + 1;
	}
	return result;
    }
}
