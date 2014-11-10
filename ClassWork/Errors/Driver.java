public class Driver{
    public static void main(String[] args) {
	/*
	int[] a = new int[5];
	int[44] = 73;
	int x = 10;
	10/0;
	*/
	Eexample ee = new Eexample();
	try {
	    ee.etest(55);
	    System.out.println("OK");
	} catch (Exception e) {
	    System.out.println("Error-we got: " + e);
	}
	System.out.println("After the exception");
    }
}
