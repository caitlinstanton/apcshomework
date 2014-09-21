public class Driver {
    public static void main(String[] args){
	String s = "mike zamansky";
	int space = s.indexOf(' ');
	System.out.println("Index of the space: " +  space);
	String lastName = s.substring((s.indexOf(' '))+1);
	System.out.println("Last Name: " + lastName);
	String firstName = s.substring(0, (s.indexOf(' ')));
	System.out.println("First Name: " + firstName);
    }
}