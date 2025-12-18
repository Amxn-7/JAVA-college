public class Main {
    class SortedArray {
        int[] arr;

        public SortedArray(int[] arr) {
            this.arr = arr;
        }

        // Method to find the last occurrence of a target value using binary search
        public int lastOccurrence(int target) {
            int left = 0;
            int right = arr.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    result = mid; // Update result and search in the right half
                    left = mid + 1;
                } else if (arr[mid] < target) {
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1; // Search in the right half
                }
            }
            return result;
        }
    }
}
