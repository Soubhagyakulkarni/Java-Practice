public class MergeSort{
   public static void mergesort(int arr[],int si,int ei){
      if(si>=ei){
         return;
      }
      int mid=si+(ei-si)/2;
      mergesort(arr,si,mid);
      mergesort(arr,mid+1,ei);
      merge(arr,si,mid,ei);
   }
   public static void merge(int arr[],int si,int mid,int ei){
      int temp[]=new int[ei-si+1];
      int i=si;
      int j=mid+1;
      int k=0;
      while(i<=mid && j<=ei){
         if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
         }
         else{
            temp[k]=arr[j];
            j++;
         }
         k++;
      }
      while(i<=mid){
         temp[k++]=arr[i++];
      }
      while(j<=ei){
         temp[k++]=arr[j++];
      }
      for(k=0,i=si;k<temp.length;k++,i++){
         arr[i]=temp[k];
      }
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
      mergesort(var1,0,var1.length-1);//increasing order
      printarray(var1);
   }
}
