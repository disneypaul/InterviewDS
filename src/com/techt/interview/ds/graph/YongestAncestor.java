package com.techt.interview.ds.graph;

public class YongestAncestor {

	
	//O(d) time | O(1) space : d = depth (height) of the tree
	static class Node{
		String name;
		Node ancestor;
		public Node(String name){
			this.name = name;
			ancestor = null;
		}
	}
	
	public String getYongestAncestor(Node root, Node decendent1, Node decendent2){
		
		Node commonAncestor = null;
		int dec1Depth = findDepth(root, decendent1);
		int dec2Depth = findDepth(root, decendent2);
		
		if(dec1Depth > dec2Depth){
			commonAncestor = backTrack(root, decendent1, decendent2, (dec1Depth-dec2Depth));
		}else{
			commonAncestor = backTrack(root, decendent2, decendent1, (dec2Depth-dec1Depth));
		}
		
		return commonAncestor.name;
	}
	
	public int findDepth(Node node, Node root){
		int depth = 0;
		while(node != root){
			depth++;
			node = node.ancestor;
		}
		return depth;
	}
	
	public Node backTrack(Node root, Node lowerDecendent, Node higherDecendent, int depthDiff){
		while(depthDiff !=0){
			lowerDecendent = lowerDecendent.ancestor;
			depthDiff--;
		}
		while(lowerDecendent != higherDecendent){
			lowerDecendent = lowerDecendent.ancestor;
			higherDecendent = higherDecendent.ancestor;
			
		}
		
		return lowerDecendent;
	}
	
}
