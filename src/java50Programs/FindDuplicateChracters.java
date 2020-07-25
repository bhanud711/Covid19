package java50Programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChracters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdfasdfafk asd234asda ramarao";
	    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	    char[] arr = str.toCharArray();

	    for (char value: arr) {

	       if (Character.isAlphabetic(value)) {
	           if (charMap.containsKey(value)) {
	               charMap.put(value, charMap.get(value) + 1);

	           } else {
	               charMap.put(value, 1);
	           }
	       }
	    }

	    System.out.println(charMap);
	    
	    
	    
	    System.out.println("2nd approach method");
	    char Char;
	    int count;
	    String a = "Hi my name is Rahul";
	    a = a.toLowerCase();
	    for (Char = 'a'; Char <= 'z'; Char++) {
	        count = 0;
	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) == Char) {
	                count++;
	            }
	        }
	        System.out.println("Number of occurences of " + Char + " is " + count);
	    }

	}
	
	
	
	

}
