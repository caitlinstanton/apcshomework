public class Driver{
    
    public static void main(String[] args) {
	Sarray m = new Sarray(3);
	System.out.println(m.add(2));
	System.out.println("The list is: " + m.toString());
	System.out.println("The size is: " + m.size());
	System.out.println("The value is: " + m.get(1));
	System.out.println("The value was: " + m.set(4,2));
	System.out.println("The list is: " + m.toString());
	System.out.println("The size is: " + m.size());
	System.out.println("The value was: " + m.remove(2));
	System.out.println("The list is: " + m.toString());
	System.out.println("The size is: " + m.size());
    }
}