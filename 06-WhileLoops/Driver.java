public class Driver {
    
    public static void main(String[] args) {
	CodingBat thing = new CodingBat();
	System.out.println(thing.frontTimes("hello", 4));
	System.out.println("...should be helhelhelhel");
	System.out.println(thing.stringBits("Caitlin"));
	System.out.println("...should be Ciln");
	System.out.println(thing.stringYak("Zyak Atyakc"));
	System.out.println("...should be Z Atc");
	System.out.println(thing.stringMatch("yyazbd", "yaazbd"));
	System.out.println("...should be 3");
    }
}