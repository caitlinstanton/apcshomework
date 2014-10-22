import java.util.Scanner;
import java.util.Random;
import java.io.*;  

public class Driver {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Random r = new Random();
	String name;
	String enter; 
	int i; 
	
	int h = r.nextInt(13 - 7) + 7;
	int m = r.nextInt(13 - 7) + 7;
	int a = r.nextInt(13 - 7) + 7;
	int d = r.nextInt(13 - 7) + 7;
	int s = r.nextInt(13 - 7) + 7;
	int ac = r.nextInt(13 - 7) + 7;
	int c = r.nextInt(13 - 7) + 7;
	String n = "STEVE";
	String w = "air";
	
	System.out.println("Welcome, young traveler! What is your name?");
	name = in.nextLine();

	Mage m = new Mage(h, m, a, d, s, ac, c, n, w);
	Monster e = new Monster(h, m, a, d, s, ac, c, n, w);

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
