public class Driver {
    
    public static void main(String[] args) {
	CodingBat thing = new CodingBat();
	System.out.println(thing.frame(5,4));

	System.out.println(thing.stringSplosion("Hello"));
	System.out.println("...should be HHeHelHellHello");

	System.out.println(thing.stringX("xxxllamasxxx"));
	System.out.println("...should be xllamasx");
    }
}