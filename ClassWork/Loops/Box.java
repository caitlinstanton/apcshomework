public class Box {
    
    public String box(int r, int c) {
	String answer = "";
	int row = 0;
	int col;
	while (row < r) {
	    col = c;
	    while (col > 0) {
		answer = answer + "*";
		col = col - 1;
	    }
	    answer = answer + "\n";
	    row = row + 1;
	}
	return answer;
    }
}