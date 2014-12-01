public class Driver{

    public static void main(String[] args) {
	OrderedSuperArray w = new OrderedSuperArray();
	w.add("apple");
	w.add("banana");
	w.add("zebra");
	w.add("goldfish");
	w.add("internet");
	w.add("computer");
	w.add("xylophone");
	w.add("mouse");
	w.add("claustrophobia");
	//	System.out.println(w);
	//	w.set("giraffe",1);
	//System.out.println(w);
	System.out.println(w.get(1));
    }
}
