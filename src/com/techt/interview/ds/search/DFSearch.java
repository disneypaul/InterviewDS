package com.techt.interview.ds.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import com.techt.interview.ds.list.Node;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

//import com.techt.interview.ds.list.Node;

public class DFSearch {
	
	//Verticies/Nodes & Edges
	//O(v+e) time | O(v) space
	
	 static class Node{
		String name;
		List<Node> childrens = new ArrayList<Node>();
		
		public Node(String name){
			this.name = name;
		}
		
		public Node addChildren(String childName){
			Node child = new Node(childName);
			this.childrens.add(child);
			return this;
		}
		
		public Node addChildrens(List<String> childNames){
			childNames.stream().forEach(n -> this.addChildren(n));
			return this;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Node> getChildrens() {
			return childrens;
		}

		public void setChildrens(List<Node> childrens) {
			this.childrens = childrens;
		}
		
		public List<String> DFSearch(List<String> array){
			
			//if(CollectionUtils.isNotEmpty(this.childrens)){
				array.add(this.getName());
				for(int i=0; i<this.getChildrens().size(); i++){
					this.getChildrens().get(i).DFSearch(array);
				}
			//}
			return array;
		}

	}
	
	 @Test
	 public void dfsTest(){
		 Node node = new Node("A");
		 node.addChildren("B").addChildren("D");
		 //node.addChildren("C");
		 node.getChildrens().get(0).addChildren("E");
		 
		 List<String> expected = new ArrayList<String>(Arrays.asList("A", "B","E", "D"));
		 List<String> actual = new ArrayList<String>();
		 
		 //DFSearch search = new DFSearch();
		 actual = node.DFSearch(actual);
		 
		 Assert.assertEquals(expected, actual);
	 }
	
	
}
