package cap03;

public class InsertionSort {

	public static void insertionSort(char[] a) {
		int n = a.length;

		for (int i = 1; i < n; i++) {
			char cur = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > cur)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
	}

	public static void main(String[] args) {
		char[] input = new char[] { 'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F' };

		insertionSort(input);

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}
}
