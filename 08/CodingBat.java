public class CodingBat{
    
    //helper function
    public String line(String c, int h){
	String s = "";
	for (int i = 0; i < h; i++){
	    s = s + c;
	}
	return s;
    }

    public String frame(int r, int c){
	String result = "";
	for (int i = 0; i < r; i ++){
	    if(i == 0 || i == r - 1){
		result = result + line("*", c);
	    } else {
		result = result + line("*", 1);
		result = result + line(" ", c - 2);
		result = result + line("*", 1);
	    }
	    result = result + "\n";
	}
	return result;
    }

    public String stringSplosion(String str){
	String result = "";
	for (int index  = 0; index <= str.length(); index++){
	    result = result + str.substring(0, index);
	}
	return result;
    }

    public String stringX(String str){
	String result = "";
	for (int index = 0; index < str.length(); index++){
	    if(!(index != 0 && index < (str.length()-1) && str.substring(index, index + 1).equals("x"))){
		result = result + str.charAt(index);
	    }
	}
	return result;
    }

}