
public class CISC3315Hw1p4 {
	public static void main (String[] args) {
		for (int i : range(5, 9)) {
		    System.out.print(i + " ");
		}

		System.out.println();

		for (int i : range(3)) {
		    System.out.print(i + " ");
		}
	}
	public static int[] range(int from, int to ) {
		int [] ints = new int[to - from ];
		
		for(int i =0 ; i < ints.length; i ++) {
			ints[i] =i + from;
			
		}
		return ints;
	}
	public static int[] range(int to) {
		return range(0, to);
	}
}
	

