
public class ArrayEx1 {
	public static void firstLast6(int[] arr1, int[] arr2, int[] arr3){
		int array1First = arr1[0];
		int array1Last = arr1[arr1.length - 1];
		int array2First = arr2[0];
		int array2Last = arr2[arr2.length - 1];
		int array3First = arr3[0];
		int array3Last = arr3[arr3.length - 1];
		boolean six1 = false; 
		boolean six2 = false;
		boolean six3 = false;
		
		if (array1First == 6 || array1Last == 6)
			six1 = true;
			System.out.println(six1);
		
		if (array2First == 6 || array2Last == 6)
			six2 = true;
			System.out.println(six2);
		
		if (array3First == 6 || array3Last == 6)
			six3 = true;
			System.out.println(six3);
		
	}
	public static void main(String[] arg){
		int[] ar1 = new int[]{4, 2, 7, 2, 6};
		int[] ar2 = new int[]{2, 7, 2, 45, 6, 14};
		int[] ar3 = new int[]{6, 28};
		
		firstLast6(ar1, ar2, ar3);
	}
}
