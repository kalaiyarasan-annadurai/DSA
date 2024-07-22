package kalai.problems.easy;

import java.util.Stack;

public class CheckValidParanthes {
	
  public static void main(String[] args) {
	  String val = "{{{{{}}][";
	  String val1 = "[[]]{{}}()";
	System.out.println("Is valid -> "+CheckValid(val1));
}

private static boolean CheckValid(String val) {
	
	Stack<Character> stack = new Stack<>();
	for(char c :val.toCharArray()) {
		  if(c == '(')
			  stack.push(')');
		  else if(c== '[')
			  stack.push(']');
		  else if(c =='{')
			  stack.push('}');
		  else if(stack.isEmpty()|| stack.pop() !=c) 
			  return false;
		       
			   
	}
	return stack.isEmpty();
}
}
