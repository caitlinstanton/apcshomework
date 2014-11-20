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

    public void addWordHForward(String w,int row, int col){
	boolean possible;
	int r = row, c = col;
	//checks to make sure row and col can fit in board
	if (r <= board.length && col <= board[1].length) {
	    possible = true;
	    if (possible == true) {
		for (int i = 0; i < w.length(); i++){
		    //checks to see whether or not a word has already been printed there
		    //stops if a letter is already at the selected position
		    if (board[r][c+i] != '.'){
			possible = false;
			break;
		    }
		}
	    }
	    if (possible = true) {
		for (int i = 0; i < w.length() ; i++) {
		    board[r][c+i] = w.charAt(i);
		}
	    }
	}
    }

    public void addWordHBackward(String w, int row, int col){
	//just flips the word given and prints it using the addWordHForward() method
	String newWord = new StringBuilder(w).reverse().toString();
	addWordHForward(newWord, row, col);
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordHForward("hello",3,5);
	w.addWordHForward("look",7,8);
	w.addWordHBackward("world",10,4);
				
	System.out.println(w);
    }
}
