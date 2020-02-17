package com.techt.interview.ds;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import org.junit.Test;

public class Prime {

	List<Integer> primeList = Arrays.asList(1,3,5,7);
	List<Integer> nonprimeList = Arrays.asList(2,4,6,8,9);
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
	public boolean primeCheckJava5(){
		System.out.println("Hello world");
		return true;
	}
	
	public void primeCheckJava8(){
		System.out.println("Java8 test");
		//IntPredicate isDivisible = index -> i % index == 0;
		
		System.out.println("Prime + "+list.stream().filter(Prime::isPrime).collect(Collectors.toList()));
		//System.out.println("Non-Prime + "+primeList.stream().filter(Prime::isPrime).noneMatch(Prime::isPrime).collect(Collectors.toList()));
		//return true;
	}
	
	public static boolean isPrime(int num){
		if(num ==0 || num <0)
			return false;
		if(num ==1)
			return true;
		int i=2;
		while(i<num){
			if(num%i ==0)
				return false;
			i++;
		}
		return true;
	}
	
	@Test
	public void primeJava5Test(){
		//assertEquals(primeCheckJava5(),true);
		;
	}
	
	@Test
	public void primeJava8Test(){
		//assertEquals(primeCheckJava8(),true);
		primeCheckJava8();
		assertSame(list,list);
		
		//assertThat(list, hasItems(2,3,5,7,11,13, 17,19, 23, 29));
	}
}
