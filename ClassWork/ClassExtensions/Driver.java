public class Driver {

    public static void main(String[] args){
	/*
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getHealth());

	System.out.println(m.getManna());
	*/
	
	Basechar b1, b2;
	Warrior w1, w2;
	Mage m1, m2;

	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage();
	
	m2 = m1;
	/* Can't convert instance of subclass to instance of superclass
           m2 = b1; */
	/* Can't covert instance of one subclass to instance of another subclass
	   m2 = w1; */

	// Instances of a superclass may become instances of a subclass
	b2 = m1;
	b2 = m2;
	b2 = new Warrior();
    }


}
