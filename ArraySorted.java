public class ArraySorted {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      System.out.println(isSorted(arr)); // Output: true

      int[] arr2 = {5, 4, 3, 2, 1};
      System.out.println(isSorted(arr2)); // Output: false
   }

   public static boolean isSorted(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < arr[i - 1]) {
            return false; // Not sorted
         }
      }
      return true; // Sorted
   }}