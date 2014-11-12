public class Driver{
    
    public static void main(String[] args) {
	Sarray m = new Sarray(3);
	System.out.println(m.add(2));
	System.out.println("The list is: " + m.toString());
	System.out.println("The size is: " + m.size());
	System.out.println("The value is: " + m.get(1));
	System.out.println("The error is: " + m.set(4,7));
	System.out.println("The list is: " + m.toString());
	System.out.println("The size is: " + m.size());
	System.out.println("The value was: " + m.remove(78));
	System.out.println("The list is: " + m.toString());
	System.out.println("The size is: " + m.size());
    }
}