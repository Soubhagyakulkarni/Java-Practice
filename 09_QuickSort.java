public class QuickSort {
   public static void quicksort(int[] arr, int si, int ei) {
      if (si < ei) {
         int pidx = partition(arr, si, ei);
         quicksort(arr, si, pidx - 1);
         quicksort(arr, pidx + 1, ei);
      }
   }
   public static int partition(int[] arr, int si, int ei) {
      int pivot = arr[ei];
      int i = si- 1;
      for (int j = si; j < ei; j++) {
         if (arr[j] < pivot) {
            i++;
           //swap
           int temp = arr[i];
           arr[i] = arr[j];
             arr[j] = temp;
         }
      }
      i++;
      //swap
      int temp = arr[i];
      arr[i] = arr[ei];
      arr[ei] = temp;
      return i;

   }
   public static void printarray(int[] var0) {
      for (int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

   public static void main(String[] var0) {
      int[] var1 = new int[] { 6,3,9,5,2,8};
      printarray(var1);
      quicksort(var1,0,var1.length-1);//increasing order
      printarray(var1);
   }

}
