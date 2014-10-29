package basic;

public class MergeSort {
	public static void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length - 1);
	}
	
	public static void mergesort(int[] array, int[] helper, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergesort(array, helper, low, middle); // [low, mid]
			mergesort(array, helper, middle + 1, high); // [mid + 1, high]
			merge(array, helper, low, middle, high); // Merge them
		}
	}
	
	public static void merge(int[] array, int[] helper, int low, int middle, int high) {
		for (int i = low; i <= high; i++) { // copy to helper array
			helper[i] = array[i];
		}
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		// Iterate through helper array. Copy them back to the original array.
		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else { // If right element is smaller than left element
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		// Copy the rest of the left side of the array into the target array
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
	}

	public static void main(String[] args) {
		int size = 10;
		int[] array = { 3, 4, 7, 1, 9, 2, 10, 8, 5, 6 };

		mergesort(array);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
