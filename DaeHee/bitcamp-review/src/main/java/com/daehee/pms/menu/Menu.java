package com.daehee.pms.menu;

public abstract class Menu {
	String title;
	public Menu(String title){
		this.title = title;
	}
	public abstract void execute();
}
