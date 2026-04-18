public class SelectionSort {

   public static void selectionsort(int[] var0) {
      for (int var1 = 0; var1 < var0.length; ++var1) {
         int var2 = var1;

         for (int var3 = var1 + 1; var3 < var0.length; var3++) {
            if (var0[var3] < var0[var2]) {
               var2 = var3;
            }
         }

         int var4 = var0[var2];
         var0[var2] = var0[var1];
         var0[var1] = var4;
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
      selectionsort(var1);
      printarray(var1);
   }
}