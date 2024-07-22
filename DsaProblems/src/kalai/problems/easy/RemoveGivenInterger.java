package kalai.problems.easy;

import java.util.Arrays;

public class RemoveGivenInterger {
	static int removeInteger(int[] ar, int n) {
		int j = 0;
		for(int i = 0;i<ar.length;i++) {
			if(ar[i]!=n)
				ar[j++] = ar[i];
		}
		return j;
	}
	
	
  public static void main(String[] args) {
	  int[] ar = {2,2,2,2,34,3,2,43,434,3,2,23,22,22};
	  int k = removeInteger(ar, 2);
	  System.out.println("Count of non match values -> "+k);
	  System.out.println(Arrays.toString(ar));
//	  System.out.println(Arrays.toString(ar).substring(0, k));
	  
}
}
