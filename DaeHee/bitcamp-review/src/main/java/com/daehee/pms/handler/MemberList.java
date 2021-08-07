package com.daehee.pms.handler;

import com.daehee.pms.domain.Member;

public class MemberList {
	static final int MAX_LENGTH = 5;

	Member[] members = new Member[MAX_LENGTH];
	int size = 0;

	public void add(Member member) {
		this.members[this.size++] = member;
	}

	public Member[] toArray() {
		Member[] arr = new Member[size];
		for (int i = 0; i < size; i++) {
			arr[i] = members[i];
		}
		return arr;
	}
	public boolean remove(int index) {
		
		for (int i = index + 1; i < this.size; i++) {
			this.members[i - 1] = this.members[i];
		}
		this.members[--this.size] = null;
		return true;
	}
	
	public Member findByNo(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.members[i].no == no) {
				return this.members[i];
			}
		}
		return null;
	}
	public int indexOf(int no) {
		for (int i = 0; i < this.size; i++) {
			if (this.members[i].no == no) {
				return i;
			}
		}
		return -1;
	}
}
