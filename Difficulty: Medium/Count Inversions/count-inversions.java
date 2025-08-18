class Solution {

    // Main function
    static int inversionCount(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    // Merge Sort function
    static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            invCount += mergeSort(arr, temp, left, mid);      // Left half
            invCount += mergeSort(arr, temp, mid + 1, right); // Right half
            invCount += merge(arr, temp, left, mid, right);   // Merge step
        }
        return invCount;
    }

    // Merge function
    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;     // Left index
        int j = mid + 1;  // Right index
        int k = left;     // Temp index
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // Important: count inversions
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to arr
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    // Example test
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count: " + inversionCount(arr));
    }
}
