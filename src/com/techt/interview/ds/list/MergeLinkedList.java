package com.techt.interview.ds.list;

import java.util.List;

import org.junit.Test;

public class MergeLinkedList {

	//p1 : 2 - 4  - 7 - 9 - 10
	//p2: 1 - 5 - 8
	//Result: 	1 - 2 - 4 - 5 - 7 - 8 - 9 - 10
	
	public Node mergeLinkedList(Node leftHeadNode, Node rightHeadNode){
		
		Node p1 = leftHeadNode;
		Node p2 = rightHeadNode;
		Node prev = null;
		
		while(p1 != null && p2 != null){
			if(p1.getValue()<p2.getValue()){
				prev = p1;
				p1 = p1.nextNode;
			}else{
				if(prev != null)
					prev.nextNode = p2;
				prev = p2;
				p2 = p2.nextNode;
				prev.nextNode = p1;
			}
		}
		
		if(p1 == null)
			prev.nextNode = p2;
		
		return (leftHeadNode.getValue()>rightHeadNode.getValue()?rightHeadNode:leftHeadNode);
	}
	
	@Test
	public void testMergeLL(){
		/*Node p1 = new Node();
		Node p2 = new Node();
		List<>*/
	}
}
