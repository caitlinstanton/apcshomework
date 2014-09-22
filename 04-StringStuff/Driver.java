public boolean mixStart(String str) {
    //String must include "_ix", so it has to be at least 3 characters
    if (str.length() < 3) return false;

    //Each string has to have "_ix", meaning that the characters
    //we're looking for ("ix") are located at indexes 1 and 2
    //Use substring() to take out those characters
    String checkIX = str.substring(1,3);

    //Check to see if the string has "ix" inside of it using .equals()
    return (checkIX.equals("ix"));
}

public String makeOutWord(String out, String word) {
    //Created a variable for the value of the length of out
    int length = out.length();

    //Created a string for the first half of out, found with substring()
    String start = out.substring(0, (length / 2));

    //Created a string for the second half of out, found with substring()
    String end = out.substring((length / 2), length);

    //Connecting and returning the entire new string
    return start + word + end;
}

public String firstHalf(String str) {
    //Created a variable for the value of the length of the str
    int length = str.length();

    //Used substring() to return the first half of str
    //The index of the middle character is found by dividing the var length by 2
    return(str.substring(0, (length / 2)));
}


