package kalai.w3school.course;

public class FindNthFibonacciNumber {
	    public static int F(int n) {
	    	System.out.println("hpw many times" +n);
	        if (n <= 1) {
	            return n;
	        } else {
	            return F(n - 1) + F(n - 2);
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(F(19));
	    }
	}
