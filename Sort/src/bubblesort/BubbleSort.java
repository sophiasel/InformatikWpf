package bubblesort;

public class BubbleSort {

	public static void main(String[] args) {

		new BubbleSort();
	}

	public BubbleSort() {

		int speicher;

		int[] zahlen = { 3, 6, 1, 4, 2, 9, 5, 7, 8 };

		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					speicher = zahlen[i + 1];
					zahlen[i + 1] = zahlen[i];
					zahlen[i] = speicher;
				}
			}
		}

		for (int z = 0; z < zahlen.length; z++) {
			System.out.print(zahlen[z]);
			if (z != zahlen.length) {
				System.out.print("; ");
			}
		}

	}

}
