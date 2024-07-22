package kalai.problems.easy;


public class RemoveDuplicateSortedArray {
	
	static int removeTheDuplicate(int[] arr) {
		int j = 1;
		for(int i = 1;i<arr.length;i++) {
			printArrays(arr, i-1);
			if(arr[i]!= arr[i-1]) 
				arr[j++] = arr[i];
			
				
		}
    return j;
	}
    static void printArrays(int[] arr,int index) {
    	System.out.println("Index -> "+index);
    	for(int i = 0;i<arr.length;i++) {
         
  		  System.out.print(arr[i]+" ,");
  	  }
    }
  public static void main(String[] args) {
	  int arr[] = {0,0,1,1,3,3,3,12,13,13};
	  
	  int j = removeTheDuplicate(arr);
	  for(int i = 0;i<j;i++) {
		  System.out.print(arr[i]+" ,");
	  }
}
}   
