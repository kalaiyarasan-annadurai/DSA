package kalai.w3school.course;

import java.util.Arrays;

public class QucikSort1 {
     static void quickSort(int ar[],int low, int high) {
    	    
    	 if(low<high) {
    		 int pivot = getPivotAndSwap(ar,low,high);
    		 quickSort(ar,low,pivot-1);
    		 quickSort(ar,pivot+1,high);
    	 }
     }
     static int getPivotAndSwap(int ar[],int low, int high) {
    	 int pivot  = ar[high];
    	 int i = low-1;
    	 for(int j = low;j<high;j++) {
    		 if(ar[j]<= pivot) {
    			 i++;
    			 int temp = ar[i];
    			 ar[i] = ar[j];
    			 
    			 ar[j] = temp;
    			 
    		 }
    	 }
    	 int temp = ar[i+1];
    	 ar[i+1] = ar[high];
    	 ar[high] = temp;
    	 
    	 
    	 return i+1;
     }
  public static void main(String[] args) {
	   int[] ar = {223,23,23,2,3,3,43,2,2,29};
	   quickSort(ar, 0, ar.length-1);
	   System.out.println(Arrays.toString(ar));
}
}
