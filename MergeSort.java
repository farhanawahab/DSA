// Merge Sort implementation in Java
public class MergeSort {

    // Function to merge two sorted subarrays into one sorted array
    void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Initial indexes for L[], R[] and merged array
        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into arr[left..right]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to divide the array into subarrays and call merge()
    void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 9, 1}; // Sample input array

        MergeSort ms = new MergeSort(); // Create object
        ms.sort(arr, 0, arr.length - 1); // Call sort on the entire array

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int val : arr)
            System.out.print(val + " ");
    }
}

