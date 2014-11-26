import java.util.*;
import java.io.*;

/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board, key;
    private ArrayList<String> words;
    private ArrayList<String> wordsInPuzzle;
    private Random rnd;
    
    public WordSearch(int r, int c){
	rnd = new Random();
	words = new ArrayList<String>();

	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e ) {
	    System.out.println("Can't open wordlist");
	    System.exit(0);
	}

	while (sc.hasNext()) {
	    words.add(sc.next());
	}
	
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

    //Code from in-class
    public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
	int r = row, c = col;
				
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + deltaRow;
	    c = c + deltaCol;
	}

	r = row;
	c = col;

	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + deltaRow;
	    c=c+deltaCol;
	}
	return true;
    }

    //Code from in-class
    //Adds words at different orientations automatically
     public boolean addWord(String w) {
	int row = rnd.nextInt(board.length);
	int col = rnd.nextInt(board[0].length);
	int deltaRow = -1 + rnd.nextInt(3);
	int deltaCol = -1 + rnd.nextInt(3);
	if (deltaRow == deltaCol && deltaCol == 0)
	    return false;
	return addWordHelper(w,row,col,deltaRow,deltaCol);
    }

    //MY CODE
    /*
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

    public boolean addWordHForward(String w,int row, int col){
	int r = row, c = col;
	boolean possible = false;
	if (checkHorizontal(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		c++;
	    }
	    possible = true;
	}
	return possible;
    }

    public boolean addWordHBackward(String w, int row, int col){
	//just flips the word given and prints it using the addWordHForward() method
	String newWord = new StringBuilder(w).reverse().toString();
	addWordHForward(newWord, row, col);
	return (addWordHForward(newWord, row, col));
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

     public boolean addWordVForward(String w,int row, int col){
	int r = row, c = col;
	boolean possible = false;
	if (checkVertical(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		r++;
	    }
	    possible = true;
	}
	return possible;
     }

    public boolean addWordVBackward(String w, int row, int col){
	//just flips the word given and prints it using the addWordHForward() method
	String newWord = new StringBuilder(w).reverse().toString();
	addWordVForward(newWord, row, col);
	return(addWordVForward(newWord, row, col));
    }

    public boolean checkDiagonalDR(String w, int row, int col) {
	boolean possible = true;
	int r = row, c = col;
	if (row + w.length() > board.length) {
	    return false;
	}
	if (col + w.length() > board[0].length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    r++;
	    c++;
	}
	return true;
    }

    public boolean addDiagonalDR(String w, int row, int col) {
    	boolean possible = false;
	int r = row, c = col;
	if (checkDiagonalDR(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		r++;
		c++;
	    }
	    possible = true;
	}
	return possible;
    }

    public boolean checkDiagonalDL(String w, int row, int col) {
bg	boolean possible = true;
	int r = row, c = col;
	if (row + w.length() > board.length) {
	    return false;
	}
	if (col - w.length() > board[0].length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    r++;
	    c--;
	}
	return true;
    }

    public boolean addDiagonalDL(String w, int row, int col) {
	int r = row, c = col;
	boolean possible = false;
	if (checkDiagonalDL(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		r++;
		c--;
	    }
	    possible = true;
	}
	return possible;
    }

     public boolean checkDiagonalUR(String w, int row, int col) {
	boolean possible = true;
	int r = row, c = col;
	if (row - w.length() > board.length) {
	    return false;
	}
	if (col + w.length() > board[0].length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    r--;
	    c++;
	}
	return true;
    }

    public boolean addDiagonalUR(String w, int row, int col) {
	int r = row, c = col;
	boolean possible = false;
	if (checkDiagonalUR(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		r--;
		c++;
	    }
	    possible = true;
	}
	return possible;
    }

    public boolean checkDiagonalUL(String w, int row, int col) {
	boolean possible = true;
	int r = row, c = col;
	if (row - w.length() > board.length) {
	    return false;
	}
	if (col - w.length() > board[0].length) {
	    return false;
	}
	for (int i = 0; i < w.length(); i++) {
	    if (board[r][c] != '.') {
		if (board[r][c] != w.charAt(i)) {
		    return false;
		}
	    }
	    r--;
	    c--;
	}
	return true;
    }

    public boolean addDiagonalUL(String w, int row, int col) {
	int r = row, c = col;
	boolean possible = false;
	if (checkDiagonalUL(w, r, c) == true) {
	    for (int i = 0; i < w.length() ; i++) {
		board[r][c] = w.charAt(i);
		r--;
		c--;
	    }
	    possible = true;
	}
	return possible;
    }

    public void fillBoard() {
	Random r = new Random();
	for (int i = 0; i < board.length; i++) {
	    for (int c = 0; c < board[0].length; c++) {
		if (board[i][c] == '.') {
		    board[i][c] = (char)(r.nextInt(26) + 'a');
		}
	    }
	}
    }

    public boolean addWord(String w){
	Random r = new Random();
	int randRow = r.nextInt(board.length);
	int randCol = r.nextInt(board[0].length);
	int method = r.nextInt(8);
	Scanner sc = null;
       	boolean possible = false;
	if (method == 0){
	    addWordHForward(w, randRow, randCol);
	    possible = true;
	} else if (method == 1) {
	    addWordHBackward(w, randRow, randCol);
	    possible = true;
	} else if (method == 2) {
	    addWordVForward(w, randRow, randCol);
	    possible = true;
	} else if (method == 3) {
	    addWordVBackward(w, randRow, randCol);
	    possible = true;
	} else if (method == 4) {
	    addDiagonalDR(w, randRow, randCol);
	    possible = true;
	} else if (method == 5) {
	    addDiagonalDL(w, randRow, randCol);
	    possible = true;
	} else if (method == 6) {
	    addDiagonalUR(w, randRow, randCol);
	    possible = true;
	} else if (method == 7) {
	    addDiagonalUL(w, randRow, randCol);
	    possible = true;
	} else {
	    possible = false;
	}
    return possible;
    }

    public void makeList() {
	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("NOPE");
	    System.exit(0);
	}
	while (sc.hasNext()){
	    String s = sc.next();
	    words.add(s.toLowerCase());
	}
    }

    public void makeBoard() {
	makeList();
	for (int i = 0; i < words.size(); i++){
	    String s = words.get(i);
	    int tries = 0;
	    boolean possible = false;
	    while (tries < 8 && !possible) {
		possible = addWord(s);
		tries = tries + 1;
	    }
	}
	fillBoard();
    }
    */
    //END OF MY CODE
    
    private void makeKey(){
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		key[i][j] = board[i][j];
	    }
	}
    }
    
    public void buildPuzzle(int numwords) {
	numwords = 10;
	/*
	  loop
	    take a random word out of wordlist
	    try to add it to the puzzle
	*/
	wordsInPuzzle = new ArrayList<String>();
	while (numwords > 0){
	    int wordIndex = rnd.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if (addWord(word)) {
		numwords--;
		words.remove(wordIndex);
		wordsInPuzzle.add(word);
	    }
	}
	makeKey();
	/*fill in rest of the board*/
       	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		if(board[i][j] == '.') {
		    /* method 2
		    String letters = "abcdefghijklmnopqrstuvwxyz";
		    char letter = letters.charAt(rnd.nextInt(letters.length()));
		    board[i][j] = letter;
		    */

		    //method 1
		    int offset = rnd.nextInt(26);
		    board[i][j] = (char)((int) 'a' + offset);
		}
	    }
	}
    }

    public String getWIP() {
	return wordsInPuzzle.toString();
    }

    public String getKey() {
	String s = "";
       	for (int i = 0; i < key.length; i++) {
	    for (int j = 0; j < key[i].length; j++) {
		s = s + key[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//	w.buildPuzzle(10);
	//w.makeBoard();
	//      	w.fillBoard();
	//	System.out.println(w);
	System.out.println(w);
	w.buildPuzzle(400);
	System.out.println(w);
	System.out.println(w.getWIP());
	System.out.println(w.getKey());
    }
}
