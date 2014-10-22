import java.util.Scanner;
import java.util.Random;
import java.io.*;  

public class Driver {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name;
	String enter; 
	String spell; 
	int i; 

	Random rand = new Random();
	int  m = rand.nextInt(3);
	String mattack = Integer.toString(m);

	System.out.println("Welcome, young traveler! What is your name?");
	name = in.nextLine();

	Mage mage = new Mage(100, 100, 100, 100, 100, 100, 100, name, "staff");
	Monster monster = new Monster(100, 100, 100, 100, 100, 100, 3, "Evil Travelining Salesman", "misc. body parts");

	System.out.print("Hello " + name + "! Enter the world of GENERIC RPG FANTASY LAND");
	for (i=1;i<3;i=i+1) {
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print(".");
	}
        try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.println(".");
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print("You wake up in a forest. (Hint: The 'enter' button is your friend.)");
	enter = in.nextLine();
        for (i=1;i<4;i=i+1) {
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print(".");
	}
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print("Well, there are a lot of trees. I mean, it's a forest.");

	enter = in.nextLine();
        for (i=1;i<4;i=i+1) {
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print(".");
	}
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}

	System.out.println("What?!?!?!?! A strange traveler in the woods?!?!?!?! FIGHT HIM?!?!?! Get to it, " + name + "!");
        enter = in.nextLine();
	System.out.print("You and your opponent have 100 HP, but you are a mage?!?!?!? And have 100 mana?!?! Yeah! Type 'spell1' to cast a fireball that will do 10 damage and cost 20 mana (but may miss), spell2 to cast a lightning bolt that will do 10 damage and cost 30 mana (but never miss), and spell3 to cast a big ol' snowball that will do 20 damage and cost 40 mana (but may miss).");
	enter = in.nextLine();

	while (mage.getHP() > 0 && monster.getHP() > 0) {
	    spell = in.nextLine();
	    System.out.println(mage.spell(monster, spell));
	    if (mattack.equals("0") && monster.getACC() > 20) {
	        monster.claws(mage); 
	    }
	    if (mattack.equals("1") && monster.getACC() > 20) {
	        monster.teeth(mage); 
	    }
	    if (mattack.equals("2") && monster.getACC() > 40) {
	        monster.wrath(mage);
	    }
	}
    }
}
