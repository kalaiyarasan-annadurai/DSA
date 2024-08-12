package kalai.w3school.course;

import java.util.Arrays;

public class SelectionSortShift {
	
	static void selectionSort(int ar[]) {
		int l = ar.length;
		 for(int i = 0;i<l;i++ ) {
			 int smallIndex = i ;
			 for(int j = i+1;j< l;j++) {
				 if(ar[j]<ar[smallIndex])
					 smallIndex =j;
			 }
			 int minVal = ar[smallIndex];
			 for(int k = smallIndex;i<k;k--) {
				 ar[k] = ar[k-1];
			 }
			 ar[i] = minVal;
		 }
	}
     public static void main(String[] args) {
	   int ar[] = {9,8,7,6,5,4,3,2,21,18};
	   
	   selectionSort(ar);
	   System.out.println(Arrays.toString(ar));
	}
}
