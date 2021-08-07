package com.daehee.pms.handler;

import com.daehee.pms.domain.Project;

public class ProjectList {
	static final int MAX_LENGTH = 5;

	Project[] projects = new Project[MAX_LENGTH];
	int size = 0;

	public void add(Project project) {
		this.projects[this.size++] = project;
	}

	public Project[] toArray() {
		Project[] arr = new Project[size];
		for (int i = 0; i < size; i++) {
			arr[i] = projects[i];
		}
		return arr;
	}
	public boolean remove(int index) {
		
		for (int i = index + 1; i < this.size; i++) {
			this.projects[i - 1] = this.projects[i];
		}
		this.projects[--this.size] = null;
		return true;
	}
	
	public Project findByNo(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.projects[i].no == no) {
				return this.projects[i];
			}
		}
		return null;
	}
	public int indexOf(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.projects[i].no == no) {
				return i;
			}
		}
		return -1;
	}
}
