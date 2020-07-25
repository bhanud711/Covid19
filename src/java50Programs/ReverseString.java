package java50Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ramarao";
		char[] c=name.toCharArray();
		for (int i=name.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
			
		}
		
		StringBuffer sb=new StringBuffer();
		sb.append(name);
		sb.reverse();
		System.out.println();
		System.out.println(sb);
		
		String b="srinu";
		char[] p=b.toCharArray();
		List<Character> al=new ArrayList<Character>();
		for(char cp:p)
		{
			al.add(cp);
		}
		System.out.println();
		System.out.println(al);
		Collections.reverse(al);
		Iterator ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.print(ir.next());
		}
	}	

	}


