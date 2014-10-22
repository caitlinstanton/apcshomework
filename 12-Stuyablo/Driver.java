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

	System.out.println("Welcome, young traveler! What is your name?");
	name = in.nextLine();

	Mage mage = new Mage(100, 100, 100, 100, 100, 100, 100, name, "staff");
	Monster monster = new Monster(100, 100, 100, 100, 100, 100, 3, "Evil Travelining Salesman", "misc. body parts");

	System.out.print("Hello " + mage + "! Enter the world of GENERIC RPG FANTASY LAND");
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
	
	System.out.print("Well, there are a lot of trees. I mean, it's a forest. Go ahead, start walking.");

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
	

	System.out.print("What?!?!?!?! A strange traveler in the woods?!?!?!?! FIGHT HIM?!?!?! Get to it, " + mage + "!");
        enter = in.nextLine();
	System.out.print("You and your opponent have 100 HP, but you are a mage?!?!?!? And have 100 mana?!?! Yeah! Type '1' to cast a fireball that will do 15-25 damage and cost 20 mana (but may miss), '2' to cast a lightning bolt that will do 15-25 damage and cost 30 mana (but never miss), and '3' to cast a big ol' snowball that will do 25-35 damage and cost 40 mana (but may miss). Press enter to complete your turn without casting a spell. If your mana dips below 50, you will regain 10 mana per turn. HIT ENTER TO BEGIN!!!");
	enter = in.nextLine();

	while (mage.getHP() > 0 && monster.getHP() > 0) {
	    spell = in.nextLine();
	    for (i=1;i<3;i=i+1) {
		try{
		    Thread.sleep(333);
		} catch(Exception e){}
		System.out.print(".");
	    }
	    try{
		Thread.sleep(333);
	    } catch(Exception e){}
	    System.out.println(".");
	    try{
		Thread.sleep(333);
	    } catch(Exception e){}
	    System.out.println(mage.spell(monster, spell));
	    if (mage.getMP() < 0) {
		mage.setMP(0); 
	    }
	    if (monster.getHP() < 0) {
		monster.setHP(0); 
	    }
	    System.out.println(monster + " has " + monster.getHP() + " HP.");
	    if (monster.getHP() <= 0) {
	    System.out.println("You won!");
	    break;
	    }
	    System.out.println(mage +  " has " + mage.getMP() +  " MP.");
	    for (i=1;i<3;i=i+1) {
		try{
		    Thread.sleep(333);
		} catch(Exception e){}
		System.out.print(".");
	    }
	    try{
		Thread.sleep(333);
	    } catch(Exception e){}
	    System.out.println(".");
	    try{
		Thread.sleep(333);
	    } catch(Exception e){}
	    int  m = rand.nextInt(3);
	    String mattack = Integer.toString(m);
	    if (mattack.equals("0") && monster.getACC() > 20) {
	        monster.claws(mage); 
	    }
	    if (mattack.equals("1") && monster.getACC() > 20) {
	        monster.teeth(mage); 
	    }
	    if (mattack.equals("2") && monster.getACC() > 40) {
	        monster.wrath(mage);
	    }
	    if (mage.getHP() < 0) {
		mage.setHP(0); 
	    }
	    System.out.println(mage + " has  " + mage.getHP() + " HP.");
	    if (mage.getHP() <= 0) {
	    System.out.println("You lost!");
	    break;
	    }
	    for (i=1;i<3;i=i+1) {
		try{
		    Thread.sleep(333);
		} catch(Exception e){}
		System.out.print(".");
	    }
	    try{
		Thread.sleep(333);
	    } catch(Exception e){}
	    System.out.println(".");
	    try{
		Thread.sleep(333);
	    } catch(Exception e){}
	    if (mage.getMP() < 50) {
		mage.increaseMP(10);
		System.out.println(mage + " gained 10 MP." + mage + " now has " + mage.getMP() + " MP.");
	    }
	    if (mage.isPoisoned()) {
		mage.setHP(mage.getHP() - 5);
		if (mage.getHP() < 0) {
		mage.setHP(0); 
		}
		System.out.println(mage + " is poisoned! " + mage + " lost 5 HP! " + mage + " now has " + mage.getHP() + " HP.");
		if (mage.getHP() <= 0) {
		    System.out.println("You lost!");
		    break;
		}
	    }
	}
    }
}
