/*
import java.swing.*;
import java.awt.*;

public class GUI1 extends JFrame{

    public GUI1 () {
	setTitle("My first GUI");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//what happens when you close the window
    }
    
    public static void main(String[] args) {
	GUI1 f = new GUI1();
	f.setVisible(true);
    }

}
*/

import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame {

		public Gui1(){

				setTitle("My First Gui");
				setSize(600,400);
				setLocation(100,100);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		}
		public static void main(String[] args) {
			  Gui1 f = new Gui1();
				f.setVisible(true);
		}
}
