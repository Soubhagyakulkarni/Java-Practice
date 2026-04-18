public class BubbleSort {
   public static void bubblesort(int[] var0) {
      for (int var1 = 0; var1 < var0.length - 1; ++var1) {
         for (int var2 = 0; var2 < var0.length - 1 - var1; ++var2) {
            if (var0[var2] < var0[var2 + 1]) {
               int var3 = var0[var2];
               var0[var2] = var0[var2 + 1];
               var0[var2 + 1] = var3;
            }
         }
      }

   }
   public static void printarray(int[] var0) {
      for (int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

   public static void main(String[] var0) {
      int[] var1 = new int[] { 3, 6, 2, 1, 8, 7, 4, 5, 3 };
      printarray(var1);
      bubblesort(var1);//decreasing order
      printarray(var1);
   }
}
