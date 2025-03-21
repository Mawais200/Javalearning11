// Merge Sort Implementation in Java
public class MergeSort {
    
    // Merge two sorted subarrays into one sorted array
    public static void Conqour(int arr[], int start, int mid, int end) {
        // Temporary array to store the merged result
        int merger[] = new int[end - start + 1];

        // Pointers for the left and right subarrays
        int index1 = start;   // Starting index of the left subarray
        int index2 = mid + 1; // Starting index of the right subarray
        int x = 0;            // Index for the temporary array

        // Merge elements from both subarrays in sorted order
        while (index1 <= mid && index2 <= end) {
            if (arr[index1] < arr[index2]) {
                merger[x++] = arr[index1++]; // Copy from left subarray
            } else {
                merger[x++] = arr[index2++]; // Copy from right subarray
            }
        }

        // Copy remaining elements from the left subarray, if any
        while (index1 <= mid) {
            merger[x++] = arr[index1++];
        }

        // Copy remaining elements from the right subarray, if any
        while (index2 <= end) {
            merger[x++] = arr[index2++];
        }

        // Copy merged elements back to the original array
        for (int i = 0, j = start; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }
    }

    // Recursively divide the array into two halves
    public static void Divide(int arr[], int start, int end) {
        // Base case: If the array has one or no elements, it is already sorted
        if (start >= end) {
            return;
        }

        // Find the middle index to divide the array
        int mid = start + (end - start) / 2;

        // Recursively divide the left and right halves
        Divide(arr, start, mid);
        Divide(arr, mid + 1, end);

        // Merge the two sorted halves
        Conqour(arr, start, mid, end);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Input array to be sorted
        int arr[] = {6, 3, 9, 5, 2, 8};

        // Get the length of the array
        int n = arr.length;

        // Call the Divide function to start Merge Sort
        Divide(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
