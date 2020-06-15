
public class ArrayEx1 {
	public static boolean firstLast6(int[] arr){
		int arrayFirst = arr[0];
		int arrayLast = arr[arr.length - 1];

		boolean six = false; 
		
		if (arrayFirst == 6 || arrayLast == 6)
			six = true;

		return six;
	}
	public static void main(String[] arg){
		int[] ar1 = new int[]{4, 2, 7, 2, 6};
		int[] ar2 = new int[]{2, 7, 2, 45, 6, 14};
		int[] ar3 = new int[]{6, 28};
		
		System.out.println(firstLast6(ar1));
		System.out.println(firstLast6(ar2));
		System.out.println(firstLast6(ar3));
	}
}
