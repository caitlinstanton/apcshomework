import java.util.Scanner;
import java.io.*;  

public class Driver {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name;
	String enter; 
	int i; 

	System.out.println("Welcome, young traveler! What is your name?");
	name = in.nextLine();

	Mage m = new Mage();
	Monster e = new Monster();

	System.out.print("Hello " + name + "! Enter the world of GENERIC RPG FANTASY LAND");
	for (i=1;i<3;i=i+1) {
	try{
	    Thread.sleep(1000);
	} catch(Exception f){}
	System.out.print(".");
	}
        try{
	    Thread.sleep(1000);
	} catch(Exception f){}
	System.out.println(".");
	try{
	    Thread.sleep(1000);
	} catch(Exception f){}
	System.out.print("You wake up in a forest. (Hint: The 'enter' button is your friend.)");
	enter = in.nextLine();
        for (i=1;i<4;i=i+1) {
	try{
	    Thread.sleep(1000);
	} catch(Exception f){}
	System.out.print(".");
	}
	try{
	    Thread.sleep(1000);
	} catch(Exception f){}
	System.out.print("Well, there are a lot of trees. I mean, it's a forest.");

	enter = in.nextLine();
        for (i=1;i<4;i=i+1) {
	try{
	    Thread.sleep(1000);
	} catch(Exception f){}
	System.out.print(".");
	}
	try{
	    Thread.sleep(1000);
	} catch(Exception f){}

	System.out.println("What?!?!?!?! A strange traveler in the woods?!?!?!?! FIGHT HIM?!?!?! Get to it, " + name + "!");
        enter = in.nextLine();
    }
}
