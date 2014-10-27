import java.util.*;
import java.io.*;

public class Arrays {

    public int[] intArray() {
	int[] Array100 = new int[100];
	for (int i = 0; i < 100; i++) {
	    Random r = new Random();
	    int value = r.nextInt(150 - 75) + 75;
	    Array100[i] = value;
	}
	return Array100;
    }

}
