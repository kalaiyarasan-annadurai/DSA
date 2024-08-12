package kalai.w3school.course;

public class FibonacySeriesUsingForLoop {
     public static void main(String[] args) {
//		  Print the fibonacy upto 20
    	   int a= 0;
    	   int b= 1;
    	   System.out.print(a+", "+b+", ");
    	   for(int i = 0;i<18;i++ ) {
    		   int newFibo = a+b;
    		   System.out.print(newFibo+", ");
    	       a = b;
    	       b = newFibo;
    		  
    	   }
	}
}
