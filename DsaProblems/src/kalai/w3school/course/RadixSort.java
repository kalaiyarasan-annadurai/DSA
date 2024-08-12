package kalai.w3school.course;

import java.util.Arrays;

public class RadixSort {
	static int getMax(int ar[]){
		int max = ar[0];
	   for(int val : ar) {
		   if(val>max)
			   max = val;
	   }
	   return max;
	}
   public static void main(String[] args) {
	  int[] ar = {9,3,34,34,434,34};
	  
	  int maxVal = getMax(ar);
	  
	  int[][] radixArray = new int[10][ar.length];
	  int[] countsArray = new int[10];
	  
	  int ex = 1;
	  while(maxVal/ex>0) {
		  for(int val: ar)
		  {
			  int radixIndex = (val/ex)%10;

			  radixArray[radixIndex][countsArray[radixIndex]] = val;
			  for(int[] smallAr:radixArray) {
				  for(int k:smallAr) {
					  System.out.print(k+" ");
				  }
				  System.out.println();
			  }
			  countsArray[radixIndex]++;
			  System.out.println("The count array");
			  for(int l:countsArray) {
				  System.out.print(l+" ");
			  }
		  }
		  int pos = 0;
          for(int i = 0; i < 10; i++) {
              for(int j = 0; j < countsArray[i]; j++) {
                  ar[pos] = radixArray[i][j];
                  pos++;
              }
              countsArray[i] = 0;
          }

          ex *= 10;
		  
	  }
	  System.out.println("The sorted Array -> "+Arrays.toString(ar));
}
}
