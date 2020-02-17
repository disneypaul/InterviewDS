package com.synergy.utils;

import java.security.SecureRandom;

public class RandomNoGeneration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecureRandom secRand = new SecureRandom();
		byte seed[]= new byte[100];
		try
		{
			for(int i=0; i<5; i++)
			{
					System.out.println(secRand.nextInt());
					secRand.nextBytes(seed);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.getMessage());
		}

	}

}
