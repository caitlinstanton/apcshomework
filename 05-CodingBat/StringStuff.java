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
    
    //9-24-14 Coding Bat Lab Assignment
	//Ethan Cheng and Caitlin Stanton
	//EVERYTHING IS WORKING :D

	public boolean lastDigit(int a, int b, int c) {
  		int aLastDigit = a % 10;
  		int bLastDigit = b % 10;
  		int cLastDigit = c % 10;
  		return (aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit);
	}

	public boolean nearHundred(int n) {
  		return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
	}

	public boolean mixStart(String str) {
  		if (str.length() >= 3) {
    			if (str.substring(1,3).equals("ix") == true) {
      				return true;
    			}
    			else {
      				return false;
    			}
  		}
  		else {
    			return false;
  		}
	}

	public int teaParty(int tea, int candy) {
  		if (tea >= 5 && candy >= 5){
    			if (tea + candy >= 3 * candy || tea + candy >= 3 * tea) {
      				return 2;
    			}
    			return 1;
  		}
  		else {
    			return 0;
  		}
	}

}
