package kalai.w3school.course;

import java.util.Arrays;

public class CountingSort {
   public static void main(String[] args) {
   int[] ar = {3,2,1,0}; 
   int max = ar[0];
   for(int val : ar) {
	   if(val>max)
	      max = val;
		   
   }
   int[] countArray = new int[max+1];
   for(int j = 0;j<ar.length;j++) {
	   countArray[ar[j]]++; 
   }
   int l = 0;
   for(int k = 0;k<countArray.length;k++) {
	   while(countArray[k]>0) {
		   ar[l++] = k;
		   countArray[k]--;
	   }
   }
   System.out.println("The sorted array -> "+ Arrays.toString(ar));
}
}
