public class Driver {
    
    public static void main(String[] args) {
	Array a = new Array();
	int[] nums = new int[4];
	nums[0] = 4;
	nums[1] = 3;
	nums[2] = 7;
	nums[3] = 1;
	System.out.println(a.frontPiece(nums));
	System.out.println(a.sum13(nums));
    }
}