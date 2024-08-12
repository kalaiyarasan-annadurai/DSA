package kalai.utility;

import java.util.Arrays;

public class TwoDimensionalArray {
  public static void main(String[] args) {
	int[][] twoArray = {{2,2,23,32,32},{3232,23,23,2323,2323}};
	
	for(int[] array:twoArray) {
		for(int val:array) {
			System.out.println("val "+val);
		}
		
	}
	
 }
}
