package com.techt.interview.ds.list;

import java.util.ArrayList;
import java.util.List;

public class Node {

	public String name;
	public Integer value;
	public Node nextNode;
	public Node previousNode;
	public List<Node> childrens = new ArrayList<Node>();
	
	public Node(){
		super();
	}
	
	public Node(String name, Integer value, Node nextNode, Node previousNode){
		this.name=name;
		this.value=value;
		this.nextNode=nextNode;
		this.previousNode=previousNode;
	}
	public Node(String name, Integer value){
		this.name=name;
		this.value=value;
	}
	
	public Node(String name){
		this.name=name;
	}
	
	public Node(String name, Node nextNode){
		this.name=name;
		this.nextNode=nextNode;
	}
	
	public Node(Integer value){
		this.value=value;
	}
	
	public Node(Integer value, Node nextNode){
		this.value=value;
		this.nextNode=nextNode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
		
	public List<Node> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Node> childrens) {
		this.childrens = childrens;
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
	
	List<String> getNodeNamesInList(){
		List<String> nameList = new ArrayList<String>();
		Node current = this;
		while(current.nextNode == null){
			nameList.add(current.getName());
			current = current.nextNode;
		}
		return nameList;
	}
	
	List<Integer> getNodeValuesInList(){
		List<Integer> valueList = new ArrayList<Integer>();
		Node current = this;
		while(current.nextNode == null){
			valueList.add(current.getValue());
			current = current.nextNode;
		}
		return valueList;
	}
	
	Node createLinkedListFromValueList(List<Integer> valueList){
		Node headNode = this;
		Node current = headNode;
		Node previous = null;
		for(Integer value:valueList){
			current.value=value;
			current.nextNode = new Node();
			previous = current;
			current = current.nextNode;
		}
		previous.nextNode = null;
		
		return headNode;
	}
}

