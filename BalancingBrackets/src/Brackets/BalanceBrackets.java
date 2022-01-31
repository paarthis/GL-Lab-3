package Brackets;

import java.util.*;

public class BalanceBrackets {

			 
	   private static boolean BalancedBrackets(String Str)
	    {
	        Stack <Character> stack = new Stack  <Character>();
	 
	    
	        for (int i = 0; i < Str.length(); i++)
	        {
	            char S = Str.charAt(i);
	 
	            if (S == '(' || S == '[' || S == '{')
	            {
	                stack.push(S);
	                continue;
	            }
	  
	            if (stack.isEmpty())
	                return false;
	            
	           
	            else if(S == ')') {
	                if(stack.isEmpty() || stack.pop() != '(') {
	                    return false;
	                }           
	            } 
	            else if(S == ']') {
	                if(stack.isEmpty() || stack.pop() != '[') {
	                    return false;
	                }
	            } 
	           
	            else if(S == '}') {
	                if(stack.isEmpty() || stack.pop() != '{') {
	                    return false;
	                }
	            }

	        }
	 
	        return (stack.isEmpty());
	    }   	 

public static void main(String[] args) {
	
	 String bracket;
	 System.out.println ("Enter the input");
	 Scanner in=new Scanner(System.in);
		bracket =in.next();
             if (BalancedBrackets(bracket)) {
           System.out.println("The entered String has Balanced Brackets");
       }
       else
           System.out.println("The entered Strings do not contain Balanced Brackets");
}
	    }
