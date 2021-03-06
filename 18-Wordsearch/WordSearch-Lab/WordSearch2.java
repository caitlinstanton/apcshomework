/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
				
    }
    public WordSearch(){
        this(20,30);
    }

    public String toString(){
	String s = "";
       	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean checkHorizontal(String w, int row, int col) {
	boolean possible = true;
	int r = row, c = col;
	if (col + w.length() > board[0].length) {
	    return false;
	}
	if (row > board.length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    c++;
	}
	return true;
    }

    public void addWordHForward(String w,int row, int col){
	int r = row, c = col;
	if (checkHorizontal(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
    }

    public void addWordHBackward(String w, int row, int col){
	//just flips the word given and prints it using the addWordHForward() method
	String newWord = new StringBuilder(w).reverse().toString();
	addWordHForward(newWord, row, col);
    }

    public boolean checkVertical(String w, int row, int col) {
	boolean possible = true;
	int r = row, c = col;
	if (row + w.length() > board.length) {
	    return false;
	}
	if (col > board[0].length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    r++;
	}
	return true;
    }

     public void addWordVForward(String w,int row, int col){
	int r = row, c = col;
	if (checkVertical(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r+i][c] = w.charAt(i);
	    }
	}
     }

    public void addWordVBackward(String w, int row, int col){
	//just flips the word given and prints it using the addWordHForward() method
	String newWord = new StringBuilder(w).reverse().toString();
	addWordVForward(newWord, row, col);
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordHForward("hello",3,5);
	w.addWordHForward("hello",400,5);
	w.addWordHForward("hello",3,655);

	w.addWordHBackward("world",10,4);
	w.addWordHBackward("world",100,4);
	w.addWordHBackward("world",10,400);

	w.addWordVForward("look",17,8);
	w.addWordVForward("look",700,8);
	w.addWordVForward("look",7,800);

	w.addWordVBackward("great",15,4);
	w.addWordVBackward("great",150,4);
	w.addWordVBackward("great",10,04);
				
	System.out.println(w);
    }
}
