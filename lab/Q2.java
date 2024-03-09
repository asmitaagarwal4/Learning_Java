package lab;

//Write a Java recursive method to check if a given array is sorted in ascending    
//order.        

public class Q2 {
        // Recursive method to check if the array is sorted in ascending order
        public static boolean isSorted(int[] arr, int index) {
            // Base case: if the index reaches the last element or the array is empty
            if (index == arr.length - 1 || arr.length == 0) {
                return true;
            }

            // If the current element is greater than the next element, the array is not
            // sorted
            if (arr[index] > arr[index + 1]) {
                return false;
            }

            // Recursive call to check the next element
            return isSorted(arr, index + 1);
        }

        public static void main(String[] args) {
            // Example usage
            int[] array1 = { 1, 2, 3, 4, 5 };
            int[] array2 = { 5, 4, 3, 2, 1 };

            System.out.println("Is array1 sorted? " + isSorted(array1, 0)); // Output: true
            System.out.println("Is array2 sorted? " + isSorted(array2, 0)); // Output: false
        }
    }

