public class Shapes {
	
    //took about 10 minutes
    public String tri1(int r) {
	String result = "";
	int row = r;
	int c = 1;
	while (row > 0){
	    int col = c;
	    while (col > 0){
		result = result + "*";
		col = col - 1;
	    }
	    result = result + "\n";
	    row = row - 1;
	    c = c + 1;
	}
	return result;
    }
    
    //took about 25 minutes
    public String tri2(int h) {
	int counter = h;
	int x = counter;
	int col = 1;
	String answer = "";
	while (counter > 0){
	    while (x > col) {
		answer = answer + " ";
	        x = x - 1;
	    }
	    x = h;
	    int nextCol = col;
	    while (col > 0) {
		answer = answer + "*";
		col = col - 1;
	    }
	    nextCol = nextCol + 1;
	    col = nextCol;
	    answer = answer + "\n";
	    counter = counter - 1;
	    }
	return answer;
    }

    public String tri3 (int h) {
	int row = h;
	int num;
	int star = 1;
	int starCounter;
	String result = "";
	while (row > 0){
	    for (num = (row * 2 - 2)/2; num > 0; num = num - 1) {
		result = result + " ";
	    }
	    for (starCounter = star; starCounter > 0; starCounter = starCounter - 1){
		result = result + "*";
	    }
	    for (num = (row * 2 - 2)/2; num > 0; num = num - 1){
		result = result + " ";
	    }
	    result = result + "\n";
	    row = row - 1;
	    star = star + 2;
	}
	return result;
    }
}
