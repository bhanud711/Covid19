package java50Programs;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   StringBuffer sb=new StringBuffer();
		
		String inputString="ramaro derangulla";
		String[] words = inputString.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);
        
   
        
	}

}
