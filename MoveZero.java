public class MoveZero {
   public static void MoveZero(int[] arr) {
      int j = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
         }
      }

   }

   public static void main(String args[]) {
      int numbers[] = { 0, 1, 0, 3, 12 };

      System.out.println("The orginial array");
      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      MoveZero(numbers);
     
      System.out.println("after placing zero's at end");
      for (int arr : numbers) {
         System.out.print(arr + " ");
      }
   }

}
