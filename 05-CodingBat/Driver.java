public class Driver {
    
    public static void main(String[] args) {
	StringStuff stringThing = new StringStuff();
	System.out.println(stringThing.nonStart("Hello","World"));
	System.out.println("...should be 'elloorld'");
	System.out.println(stringThing.makeABBA("Hi","Caitlin"));
	System.out.println("...should be 'HiCaitlinCaitlinHi'");
	System.out.println(stringThing.diff21(4));
	System.out.println("...should be 17");
	System.out.println(stringThing.diff21(24));
	System.out.println("...should be 6");
    }
}