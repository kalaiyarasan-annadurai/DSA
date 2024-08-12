package kalai.problems.easy;

public class FindTargetTipicalbinarySearch {
	public static int findTarget(int arr[] , int target) {
		int l = 0;
		int r = arr.length-1;
		int count = 0;
		while(l<=r) { // this fails when l is greater than r
			
			
		int m = l+(r-l)/2;
		System.out.println(count+" left -> "+l);
		System.out.println(count+" right -> "+r);
		System.out.println(count+" middle -> "+m);
		if(arr[m]==target) 
			return m;
		else if(target<arr[m])
			r = m-1;
		else
		    l = m+1;
		
		count++;
		}
		return l;
//	    int l = 0;
//	    int r = nums.length-1;
//	   int count = 0;
//	    while(l<=r){
//	        int m = l + (r-l)/2;
//	       if(nums[m] == target)
//	           return m;
//	        else if(target < nums[m])
//	           r = m-1;
//	        else if(target > nums[m])
//	           l = m+1;      
//	       System.out.println(count+" left -> "+l);
//			System.out.println(count+" right -> "+r);
//			System.out.println(count+" middle -> "+m);
//			count++;
//	    }
//	    return l;
	}
    public static void main(String[] args) {
    	  int[] arr ={1,2,3,4,8,9,10,11,12,13,14};
		  int result = findTarget(arr,6);
		  
		  System.err.println("Result -> "+result);
	}
}
