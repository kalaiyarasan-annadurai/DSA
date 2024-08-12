package kalai.w3school.course;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
	  int ar[]  = {10,9,8,7,6,5,4,3,2,1};
	  int l = ar.length;
	  for(int i = 1;i<l;i++) {
		  int currentVal = ar[i];
		  int j = i-1;
		  int insertPosition = j;
		  while(j>=0 && ar[j]>currentVal) {
			  ar[j+1] = ar[j];
			  insertPosition = j;
			  j--;
		  }
		  ar[insertPosition] = currentVal;
	    	  
	  }
	  System.out.println(Arrays.toString(ar));
}
}
