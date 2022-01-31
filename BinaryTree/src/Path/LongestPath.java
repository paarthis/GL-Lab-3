package Path;

import java.io.*;
import java.util.ArrayList;

public class LongestPath {

	 	
	static class Node
	{
		 int data;
	    Node left;
	    Node right;
	  
	}
	 
	static  Node newNode(int data)
	{
	    Node temp = new Node();
	    temp.data = data;
	    temp.left = temp.right = null;
	 
	    return temp;
	}
	 

	public static ArrayList<Integer> longestPath(Node root)
	{
	
	    if(root == null)
	    {
	        ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	     
	    ArrayList<Integer> right = longestPath(root.right);
   
	    ArrayList<Integer> left = longestPath(root.left);
	     
	
	    if(right.size() < left.size())
	    {
	        left.add(root.data);
	    }
	    else
	    {
	        right.add(root.data);
	    }
	     

	    return (left.size() >
	            right.size() ? left :right);
	}
	 

	public static void main(String[] args)
	{
	    Node root = newNode(100);
	    root.left = newNode(20);
	    root.right = newNode(130);
	    root.left.left = newNode(10);
	    root.left.right = newNode(50);
	    root.left.left.left  = newNode(5);
	    root.right.left = newNode(110);
	    root.right.right = newNode(140);
	     
	    ArrayList<Integer> output = longestPath(root);
	    int o = output.size();
	    System.out.println(output.get(o - 1));
	    for(int i = o - 2; i >= 0; i--)
	    {
	        System.out.println(" -> " + output.get(i));
	    }
	}
	}


		
			
			
	

