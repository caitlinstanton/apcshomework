public class Greeter {
    
    //instance variables are almost always private
    //We access them with their accessor methods (get and set)
    public String greeting = new String("Hello world!");

    public void setGreeting(String s){
	greeting = s;
    }

    //"String" is the return type that is, the type of data that we
    //will send back using the return statement.
    //"Void" is a special return type whcih means we won't be
    //returning any value.
    public String getGreeting() {
	return greeting;
    }

    public void greet(){
	//String greeting = new String("Sup!");
	System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println("I'm out!");
    }
}
