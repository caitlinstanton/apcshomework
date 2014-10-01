public class Shapes {
    
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
}