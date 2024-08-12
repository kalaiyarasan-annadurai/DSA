package kalai.w3school.course;

import java.util.Arrays;

public class SelectionSortSwap {
   public static void main(String[] args) {
	int ar[] = {23,33,343,433,4,5,6};
	int l = ar.length;
	for(int i = 0;i< l;i++) {
		int smallIndex = i;
		for(int j = i+1;j< l;j++) {
			if(ar[j]<ar[smallIndex]) {
				smallIndex = j;
			}
		}
		int temp = ar[i];
		ar[i] = ar[smallIndex];
		ar[smallIndex] = temp;
		
	}
	System.out.println(Arrays.toString(ar));
 }
}
