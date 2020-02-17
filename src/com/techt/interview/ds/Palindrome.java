package com.techt.interview.ds;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Palindrome {

	// O(n) time | O(1) space - storing only pointer
	public boolean isPalindrome(String str){
		if(str == null || str.length()==0)
			return false;
		int start = 0;
		int end = str.length() -1;
		
		while(start<end){
			if(str.charAt(start)!=str.charAt(end))
				return false;
			start++;
			end--;
		}
		
		return true;
	}
	
	public int substring(String s, String x){
		Pattern p = Pattern.compile(x);
		Matcher m = p.matcher(s);
		while(m.find()){
			
			System.out.println(m.group());
		}
		return 0;
	}
	
	@Test
	public void testString(){
		
		substring("abcdxyzijkopq","xy*i");
	}
}
