package com.daehee.pms.menu;

public abstract class Menu {
	String title;
	Menu(String title){
		this.title = title;
	}
	abstract void execute();
}
