public class Array {
    
    public int[] frontPiece(int[] nums) {
	if (nums.length >= 2) {
	    int[] frontArray2 = new int[2];
	    for (int i = 0; i < 2; i++) {
		frontArray2[i] = nums[i];
	    }
	    return frontArray2;
	} else if (nums.length == 1) {
	    int[] frontArray1 = new int[1];
	    for (int i = 0; i < 1; i++) {
		frontArray1[i] = nums [i];
	    }
	    return frontArray1;
	} else {
	    int[] frontArray0 = new int[0];
	    return frontArray0;
	}
    }

    public int sum13(int[] nums) {
	int total = 0;
	for (int i = 0; i < nums.length; i++) {
	    int value = nums[i];
	    if (value != 13) {
		if (i == 0) {
		    total = total + value;
		} else if (nums[i - 1] != 13) {
		    total = total + value;
		}
	    }
	}
	return total;
    }

}