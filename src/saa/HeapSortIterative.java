package saa;

public class HeapSortIterative {

    public void sort(int[] arr) {
        int n = arr.length;

        // 1. Построяване на max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }

        // 2. Сортиране чрез размяна на корена и последния елемент
        for (int heapSize = n; heapSize > 1; heapSize--) {
            // Размяна на първия и последния елемент
            int temp = arr[0];
            arr[0] = arr[heapSize - 1];
            arr[heapSize - 1] = temp;

            // Възстановяване на свойството max-heap
            maxHeapify(arr, heapSize - 1, 0);
        }
    }

    // Итеративен maxHeapify
    private void maxHeapify(int[] arr, int heapSize, int i) {
        int current = i;

        while (true) {
            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int largest = current;

            if (left < heapSize && arr[left] > arr[largest]) {
                largest = left;
            }

            if (right < heapSize && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest == current) {
                break; // възелът е на правилното място
            }

            // Размяна
            int swap = arr[current];
            arr[current] = arr[largest];
            arr[largest] = swap;

            // Продължаваме надолу
            current = largest;
        }
    }

    // Тест
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        HeapSortIterative hs = new HeapSortIterative();
        hs.sort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
