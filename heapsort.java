package Proj6;

public class heapsort extends sort {
	public heapsort() {
		super();
	}
	public int[] sorts() {
	    int n = temporary.length;

	    // Build max heap
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(temporary, n, i);
	    }
	    for (int i = n - 1; i > 0; i--) {
	        int temp = temporary[0];
	        temporary[0] = temporary[i];
	        temporary[i] = temp;

	        heapify(temporary, i, 0);
	    }

	    return temporary;
	}

	private void heapify(int[] arr, int size, int rootIndex) {
	    int largest = rootIndex; // Initialize largest as root
	    int left = 2 * rootIndex + 1; // left child
	    int right = 2 * rootIndex + 2; // right child

	    if (left < size && arr[left] > arr[largest]) {
	        largest = left;
	    }

	    if (right < size && arr[right] > arr[largest]) {
	        largest = right;
	    }

	    // If largest is not root
	    if (largest != rootIndex) {
	        int swap = arr[rootIndex];
	        arr[rootIndex] = arr[largest];
	        arr[largest] = swap;

	        heapify(arr, size, largest);
	    }
	}
}
