import java.util.Scanner;
import java.util.Random;
import java.io.*;  

public class Driver {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Random r = new Random();
	String name;
	String enter; 
	String spell;
	int i; 
	
	int h = 100;
	int mp = 80;
	int a = 0;
	int d = 0;
	int s = 0;
	int ac = 0;
	int c = 0;
	String n = "STEVE";
	String w = "air";
	
	System.out.println("Welcome, young traveler! What is your name?");
	name = in.nextLine();

	Mage m = new Mage(h, mp, a, d, s, ac, c, n, w);
	Monster e = new Monster(h, mp, a, d, s, ac, c, n, w);

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

	while (e.getHP() > 0){
		System.out.println("How will you defeat this creature???");
		System.out.println("Which spell will you use? Type out spell1, spell2, or spell3 to select");
		spell = in.nextLine();
		System.out.println(m.spell(e, spell));
		System.out.println("Your MP is: " + m.getMP());
		System.out.println("Your attacker's HP is: " + e.getHP());
	}
    }
}
