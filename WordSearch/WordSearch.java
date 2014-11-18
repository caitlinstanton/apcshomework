/**
 * Creates a word puzzle
 *
 */

public class WordSearch {
    
    private char[][] board;

    public WordSeard (int r, int c) {
	board = new char[r][c];
    }

    public WordSearch(){
        this(30,20);
    }

    public String toString(){
	String ans = "";
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; board[i].length; j++){
		board[i][j] = '.';
		ans = ans + board[i][j];
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
}
