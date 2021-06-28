package comparison;

import shapes.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ShapeUtil implements Comparator {
	private int sortType; // 0(default): height, 1: base area, 2: volume

	public ShapeUtil(int sortType) {
		this.sortType = sortType;
	}

	@Override
	/**
	 * This compare method will be used to compare two shapes by base area / volume / height
	 * @param object1 - first shape to compare
	 * @param object2 - second shape to compare
	 */
	public int compare(Object object1, Object object2) {
		Shape shape1 = (Shape) object1;
		Shape shape2 = (Shape) object2;

		double shape1Size;
		double shape2Size;
		if (sortType == 1) {
			shape1Size = shape1.calcBaseArea();
			shape2Size = shape2.calcBaseArea();
		}
		else if (sortType == 2) {
			shape1Size = shape1.calcVolume();
			shape2Size = shape2.calcVolume();
		} else {
			return shape1.compareTo(shape2);
		}

		if (shape1Size > shape2Size) return 1;
		else if (shape1Size < shape2Size) return -1;
		else return 0;
	}

	public void bubbleSort(Shape[] array) {
		boolean sorted = false;
		Shape temp;
		while(!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (compare(array[i], array[i + 1]) < 0) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorted = false;
				}
			}
		}
	}

	public void selectionSort(Shape[] array) {

			int n = array.length;

			// One by one move boundary of unsorted subarray
			for (int i = 0; i < n-1; i++)
			{
				// Find the minimum element in unsorted array
				int min_idx = i;
				for (int j = i+1; j < n; j++)
					if (compare(array[j],array[min_idx]) > 0)
						min_idx = j;

				// Swap the found minimum element with the first
				// element
				Shape temp = array[min_idx];
				array[min_idx] = array[i];
				array[i] = temp;
			}



	}

	public void insertionSort(Shape[] array) {
			int n = array.length;
			for (int i = 1; i < n; ++i) {
				Shape key = array[i];
				int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
				while (j >= 0 && compare(array[j], key) < 0) {
					array[j + 1] = array[j];
					j = j - 1;
				}
				array[j + 1] = key;
			}



	}

	public void mergeSort(Shape[] array, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			mergeSort(array, l, m);
			mergeSort(array, m + 1, r);

			// Merge the sorted halves
			merge(array, l, m, r);
		}


	}

	private void merge(Shape array[], int l, int m, int r) {
		if (l < r) {
			// Find sizes of two subarrays to be merged
			int n1 = m - l + 1;
			int n2 = r - m;

			/* Create temp arrays */
			Shape L[] = new Shape[n1];
			Shape R[] = new Shape[n2];

			/*Copy data to temp arrays*/
			for (int i = 0; i < n1; ++i)
				L[i] = array[l + i];
			for (int j = 0; j < n2; ++j)
				R[j] = array[m + 1 + j];

			/* Merge the temp arrays */

			// Initial indexes of first and second subarrays
			int i = 0, j = 0;

			// Initial index of merged subarry array
			int k = l;
			while (i < n1 && j < n2) {
				if (compare(L[i], R[j]) >= 0) {
					array[k] = L[i];
					i++;
				}
				else {
					array[k] = R[j];
					j++;
				}
				k++;
			}

			/* Copy remaining elements of L[] if any */
			while (i < n1) {
				array[k] = L[i];
				i++;
				k++;
			}

			/* Copy remaining elements of R[] if any */
			while (j < n2) {
				array[k] = R[j];
				j++;
				k++;
			}
		}
	}

	public void quickSort(Shape[] array, int low, int high) {
		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(array, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	private int partition(Shape[] array, int low, int high) {
		// pivot
		Shape pivot = array[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for(int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (compare(array[j], pivot) > 0) {

				// Increment index of
				// smaller element
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return (i + 1);
	}

	private void swap(Shape[] array, int i, int j) {
		Shape temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static Shape[] readFile(String path) {
		Shape[] array = null;
		Shape newShape = null;
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			// check if the first token is a proper integer that indicates the number of shapes inside the file.
			int numberOfArray = Integer.parseInt(st.nextToken());
			if (numberOfArray < 1) throw new IOException("Not a properly formatted file.");
			array = new Shape[numberOfArray];
			int i = 0;

			while (st.hasMoreTokens()) {
				String shapeType = st.nextToken();
				double height = Double.parseDouble(st.nextToken());
				double length = Double.parseDouble(st.nextToken());

				switch (shapeType) {
					case "Cylinder" :
						newShape = new Cylinder(height, length);
						break;
					case "Cone" :
						newShape = new Cone(height, length);
						break;
					case "Pyramid" :
						newShape = new Pyramid(height, length);
						break;
					case "SquarePrism" :
						newShape = new SquarePrism(height, length);
						break;
					case "TriangularPrism" :
						newShape = new TriangularPrism(height, length);
						break;
					case "PentagonalPrism" :
						newShape = new PentagonalPrism(height, length);
						break;
					case "OctagonalPrism" :
						newShape = new OctagonalPrism(height, length);
						break;
					default: throw new IOException("Not a proper shape: " + shapeType);
				}

				array[i] = newShape;
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return array;
	}
}
