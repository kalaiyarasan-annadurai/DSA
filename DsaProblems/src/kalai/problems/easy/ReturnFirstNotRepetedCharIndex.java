package kalai.problems.easy;

// Asked in Wissen technology
public class ReturnFirstNotRepetedCharIndex {
	
    public static void main(String[] args) {
    	String val = "racmmddcare"; // 3
		 int index = getResult(val);
		 
		 System.out.println("The index -> "+index);
	}

	private static int getResult(String val) {
	    char[] charArr = val.toCharArray();
	    int k = 0;
	    for(int i = 0;i<charArr.length;i++) {
	    	for(int j = 0;j<charArr.length;j++) {
	    		if(i!=j && charArr[i]==charArr[j]) {
	    			k++;
	    		}
	    	}
	    	if(k==0)
	    		return i;
	    	else
	    		k  = 0;
	    }
		return -1;
	}
}
