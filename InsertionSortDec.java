public class InsertionSortDec {
	public static void main(String[] args) {
		int array[] = new int[]{31, 41, 59, 26, 41, 58};
		System.out.println("Unsorted: " + java.util.Arrays.toString(array));
		insertionSortInc(array);
		System.out.println("Sorted: " + java.util.Arrays.toString(array));
	}

	public static void insertionSortInc(int array[]) {
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}
}
