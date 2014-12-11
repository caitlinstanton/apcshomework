import java.util.*;
import java.io.*;  

public class Driver {
    public static void main(String[] args) {
	Mage mage = new Mage(100, 100, 100, 100, 100, 100, 100, "blah", "staff");
	Mage[] list = new Mage[8];
	list[0] = (new Mage(100, 100, 100, 100, 100, 100, 100, "dasher", "staff"));
	list[1] = (new Mage(100, 100, 100, 100, 100, 100, 100, "dancer", "staff"));
	list[2] = (new Mage(100, 100, 100, 100, 100, 100, 100, "prancer", "staff"));
	list[3] = (new Mage(100, 100, 100, 100, 100, 100, 100, "vixen", "staff"));
	list[4] = (new Mage(100, 100, 100, 100, 100, 100, 100, "comet", "staff"));
	list[5] = (new Mage(100, 100, 100, 100, 100, 100, 100, "cupid", "staff"));
	list[6] = (new Mage(100, 100, 100, 100, 100, 100, 100, "donner", "staff"));
	list[7] = (new Mage(100, 100, 100, 100, 100, 100, 100, "blitzen", "staff"));
	
	System.out.println("Before sort:");
	System.out.println(mage.printList(list));
	
	Arrays.sort(list);
	
	System.out.println(" ");
	System.out.println("After sort:");
	System.out.println(mage.printList(list));
    }
}
