package com.daehee.pms.handler;


public class ArrayList implements List{
	static final int MAX_LENGTH = 5;

	int size = 0;
	Object[] objects = new Object[MAX_LENGTH];
	
	public void add(Object object) {
		this.objects[this.size++] = object;
	}

	public Object[] toArray() {
		Object[] arr = new Object[size];
		for (int i = 0; i < size; i++) {
			arr[i] = objects[i];
		}
		return arr;
	}
	public boolean remove(Object obj) {
		int index = indexOf(obj);
		for (int i = index + 1; i < this.size; i++) {
			this.objects[i - 1] = this.objects[i];
		}
		this.objects[--this.size] = null;
		return true;
	}
	

	public int indexOf(Object obj) {
		for (int i = 0; i < this.size; i++) {
			if (this.objects[i] == obj) {
				return i;
			}
		}
		return -1;
	}
}
