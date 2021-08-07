package com.daehee.pms.handler;

import com.daehee.pms.domain.Task;

public class TaskList {
	static final int MAX_LENGTH = 5;

	Task[] tasks = new Task[MAX_LENGTH];
	int size = 0;

	public void add(Task task) {
		this.tasks[this.size++] = task;
	}

	public Task[] toArray() {
		Task[] arr = new Task[size];
		for (int i = 0; i < size; i++) {
			arr[i] = tasks[i];
		}
		return arr;
	}
	public boolean remove(int index) {
		
		for (int i = index + 1; i < this.size; i++) {
			this.tasks[i - 1] = this.tasks[i];
		}
		this.tasks[--this.size] = null;
		return true;
	}
	
	public Task findByNo(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.tasks[i].no == no) {
				return this.tasks[i];
			}
		}
		return null;
	}
	public int indexOf(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.tasks[i].no == no) {
				return i;
			}
		}
		return -1;
	}
}
