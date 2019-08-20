package com.kranti.vector;

import java.util.Vector;
import java.util.ListIterator;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v =new Vector();
		v.add("Rice");
		v.add("Wheat");
		v.add("potato");
		v.add("banana");
		
		System.out.println(" SIZE OF V :"+v.size());
		
	
		
		ListIterator<String> litr=v.listIterator(v.size());
		
		
		while(litr.hasPrevious())
		{		
			//System.out.println("TEST");
			System.out.println("  "+litr.previous());
		
		}
		
		
	}

}
