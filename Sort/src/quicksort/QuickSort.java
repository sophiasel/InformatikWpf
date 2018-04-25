package quicksort;

public class QuickSort {
	//
	private int[] zahlen = { 3, 4, 2, 3, 5, 6 };
	//

	public static void main(String[] args) {
		new QuickSort();
	}

	public QuickSort() {
		sort(0, zahlen.length - 1);
		//
		for (int i : zahlen)
			System.out.println(i);

	}

	public void sort(int links, int rechts) {
		if (links < rechts) {
			int teiler = teile(links, rechts);
			sort(links, teiler);
			sort(teiler + 1, rechts);
		}
	}

	private int teile(int links, int rechts) {
		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];
		//
		do {
			// Suche von links ein Element, welches größer als das Pivotelement ist
			while (zahlen[i] < pivot && i < rechts - 1)
				i = i + 1;
			// Suche von rechts ein Element, welches gleich oder kleiner als das
			// Pivotelement ist
			while (zahlen[j] >= pivot && j > links)
				j = j - 1;
			// tauschen
			if (i < j) {
				int temp = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = temp;
			}
			//
		} while (i < j);
		//
		if (zahlen[i] > pivot) {
			int temp = zahlen[i];
			zahlen[i] = zahlen[rechts];
			zahlen[rechts] = temp;

		}
		//
		return i;
	}

}
