import java.util.Arrays;

public class ArrayEx8 {
	public static int[] middleElements(int[] arr1, int[] arr2){
		int new0 = arr1[1];
		int new1 = arr2[1];
		int[] newArr = new int[]{new0, new1};
		
		return newArr;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{1, 2, 3};
		int[] array2 = new int[]{5, 5, 6};
		int[] array3 = new int[]{7, 7, 7};
		int[] array4 = new int[]{3, 8, 0};
		int[] array5 = new int[]{5, 2, 9};
		int[] array6 = new int[]{1, 4, 5};
		
		System.out.println(Arrays.toString(middleElements(array1, array2)));
		System.out.println(Arrays.toString(middleElements(array3, array4)));
		System.out.println(Arrays.toString(middleElements(array5, array6)));
	}
}
