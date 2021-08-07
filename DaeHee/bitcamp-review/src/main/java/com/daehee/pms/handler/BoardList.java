package com.daehee.pms.handler;

import com.daehee.pms.domain.Board;

public class BoardList {
	static final int MAX_LENGTH = 5;

	Board[] boards = new Board[MAX_LENGTH];
	int size = 0;

	public void add(Board board) {
		this.boards[this.size++] = board;
	}

	public Board[] toArray() {
		Board[] arr = new Board[size];
		for (int i = 0; i < size; i++) {
			arr[i] = boards[i];
		}
		return arr;
	}
	public boolean remove(int index) {
		
		for (int i = index + 1; i < this.size; i++) {
			this.boards[i - 1] = this.boards[i];
		}
		this.boards[--this.size] = null;
		return true;
	}
	
	public Board findByNo(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.boards[i].no == no) {
				return this.boards[i];
			}
		}
		return null;
	}
	public int indexOf(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.boards[i].no == no) {
				return i;
			}
		}
		return -1;
	}
}
