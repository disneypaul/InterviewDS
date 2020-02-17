package com.techt.interview.ds.search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.techt.interview.ds.search.DFSearch.Node;

public class BFSearch {

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
		
		public List<String> BFSearch(List<String> array){
			
			//ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface. It is also known as Array Double Ended Queue
			//ArrayDeque class is likely to be faster than LinkedList when used as a queue
			ArrayDeque<Node> queue = new ArrayDeque<Node>();
			queue.add(this);
			while(!queue.isEmpty()){
				Node current = queue.poll();
				array.add(current.getName());
				for(int i=0; i<current.getChildrens().size(); i++){
					queue.add(current.getChildrens().get(i));
				}
			}
			return array;
		}

	}
	
	 @Test
	 public void bfsTest(){
		 Node node = new Node("A");
		 node.addChildren("B").addChildren("D");
		 //node.addChildren("C");
		 node.getChildrens().get(0).addChildren("E");
		 
		 List<String> expected = new ArrayList<String>(Arrays.asList("A", "B","D", "E"));
		 List<String> actual = new ArrayList<String>();
		 
		 //DFSearch search = new DFSearch();
		 actual = node.BFSearch(actual);
		 
		 Assert.assertEquals(expected, actual);
	 }
}
