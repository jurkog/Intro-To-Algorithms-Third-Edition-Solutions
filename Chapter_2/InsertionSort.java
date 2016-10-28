import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arrayToSort[] = new int[]{3,5,6,76,7,345,123,6,57,90,2123,434,45};
		System.out.println("Unsorted: " + Arrays.toString(arrayToSort)); 
		insertionSort(arrayToSort);
		System.out.println("Sorted: " + Arrays.toString(arrayToSort));
	}

	public static void insertionSort(int array[]) {
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while (i >= 0 && array[i] > key) {
				array[i+1] = array[i];
				i--; 
			}
			array[i+1] = key;
		}
	}
}
