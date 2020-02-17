package com.techt.interview.ds.search;

import org.junit.Test;

public class BSTree {
	
	//Complexity : O(n) time | O(1) space

	static class BST{
		int value;
		BST left;
		BST right;
		public BST(int value){
			this.value=value;
		}
	}
	
	public int bstreeSearch(BST node, int target){
		
		return bstreeSearch(node, target, Double.MAX_VALUE);
	}
	
	public int bstreeSearch(BST node, int target, double closeset){
		
		while(node != null){
			if(Math.abs(target-closeset)>Math.abs(target-node.value)){
				closeset = node.value;
			}
			
			if(target<node.value)
				node = node.left;
			else if(target>node.value)
				node = node.right;
			else
				break;
		}
		
		return (int)closeset;
	}
	
	@Test
	public void mathAbsTest(){
		int target = 50;
		int closeset = (int)Double.MAX_VALUE;
		for(int i=0; i< 10; i++){
			target = target + 100;
			System.out.println(Math.abs(target-closeset));
		}
	}
}
