package kalai.w3school.course;

public class FibonacciSeriesUsingRecrusion {
   
	
   private static void printFibonacciSeries(int a, int b,int count ) {
	  
	  if(count<=18) {
		 int newFibo = a+b;
		 System.out.print(newFibo+" ");
		 printFibonacciSeries(b,newFibo,count+1);
	  }
	  return;
		  
	   
   }
   public static void main(String[] args) {
	    System.out.print(0);
	    System.out.print(1);
	    
	    printFibonacciSeries(0,1,2);
	    
	
}
   
}
