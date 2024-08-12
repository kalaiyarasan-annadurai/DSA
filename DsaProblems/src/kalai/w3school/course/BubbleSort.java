package kalai.w3school.course;

import java.util.Arrays;

// Algorithm : Bubble sort 
// Compare with next element and if it is not in the order, swap it.

public class BubbleSort {
	static void  bubbleSort(int arr[]) {
		int l = arr.length-1;
		// Start iterate through the array, and require to compare the first element and 
		// the second element, here required to check weather left element is larger than the 
		// right element, if larger move it to right side.
		// In the first iteration the largest value will be placed in the last position
		for(int i = 0;i<l;i++) {
			
			// j<l-1 : which will not allow to check again for the sorted part
			boolean isNotSwapped = true;
			for(int j = 0;j<l-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1]; 
					arr[j+1] = temp;
					isNotSwapped = false;
				}
			}
			if(isNotSwapped)
				return;
			
		}
	}
   public static void main(String[] args) {
	    int arr[] = {2,4,9,12,34,1,3,7};
	    
	    // [7,2,3,4,6] => [2,3,4,6,7] => 
	    bubbleSort(arr);
	   System.out.println("Sorted array -> "+Arrays.toString(arr));
	    
}
}
