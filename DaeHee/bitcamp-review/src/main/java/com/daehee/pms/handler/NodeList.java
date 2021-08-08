package com.daehee.pms.handler;


public class NodeList {
	static class Node{
		Object obj;
		Node next;
		
		public Node(Object obj) {
			this.obj = obj;
		}
		
	}
	int size = 0;
	Node head;
	Node tail;
	
	public void add(Object obj) {
		Node node = new Node(obj);
		if(head == null) {
			head = tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public Object[] toArray() {
		Object[] arr = new Object[size];
		Node node = head;
		int i = 0;
		while(node != null) {
			arr[i++] = node.obj;
			node = node.next;
		}
		return arr;
	}
	
	public boolean remove(Object obj) {
		Node node = head;
		Node preNode = null;
		if(node == null) {
			System.out.println("삭제할 노드가 없습니다.");
			return false;
		}
		while(node != null) {
			if(node.obj == obj) {
				if(head == node) {
					node = node.next;
					head = node;
				}else if(tail == node) {
					preNode.next = null;
					tail = preNode;
				}else {
					preNode.next = node.next;
					node.next = null;	
				}
				size--;
				return true;
			}
			preNode = node;
			node = node.next;
		}
		return true;
	}
	
}
