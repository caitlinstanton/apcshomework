public class StringStuff {

    public String nonStart(String a, String b) {
	String first = a.substring(1);
	String second = b.substring(1);
	return first +second;
    }
    
    public String makeABBA(String a, String b) {
	return a + b + b + a;
    }

    public int diff21(int n) {
	if (n < 21){
	    int under21 = 21 - n;
	    return under21;
	} else {
	    int over21 = n - 21;
	    int overResult = over21 * 2;
	    return overResult;
	}
    }
}
