package kalai.w3school.course;

import java.util.Arrays;

public class QuickSort {
	
	 public static void quicksort(int[] array, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partician(array, low, high);
	           
	            quicksort(array, low, pivotIndex - 1);
	            quicksort(array, pivotIndex + 1, high);
	        }
	    }

	    public static int partition(int[] array, int low, int high) {
	    	
	    	// intially considering the high value as pivot element
	        int pivot = array[high]; //5
	        
	        
	        int i = low - 1; // -1
	        for (int j = low; j < high; j++) { // j = 0
	        	
	        	// Every time the values is compared with the pivot element
	        	// and if values are less or equal to the pivot element, 
	           System.out.println(" before if condition "+array[j]+ " "+pivot);
	        	if (array[j] <= pivot) {
	                i++;
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        int temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        return i + 1;
	        
	    }
	    static int partician(int ar[], int low, int high) {
	    	int pivot = ar[high];
	    	int i = low-1;
	    	for(int j = low;j<high;j++) {
	    		if(ar[j]<=pivot) {
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
	        int[] myArray = {500, 34, 25, 12, 22, 11, 90, 64};
	        
	        // Calling the method by passing first index and the last index
	        // Since the technique is recursive, so required to pass the value for the first call also.
	       
	        quicksort(myArray, 0, myArray.length - 1);

	        System.out.print("Sorted array: ");
            System.out.println(Arrays.toString(myArray));
	    }
	    

	   
	}



