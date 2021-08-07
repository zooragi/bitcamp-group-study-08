package com.daehee.pms.menu;

import com.daehee.pms.util.Prompt;

public class MenuGroup extends Menu{
	Menu[] menus = new Menu[100];
	int size = 0;
	String isPrevMenu = "이전";
	
	public void setIsPrevMenu(String isPrevMenu) {
		this.isPrevMenu = isPrevMenu;
	}
	public MenuGroup(String title) {
		super(title);
	}
	public void add(Menu menu) {
		if(menu == null) {
			System.out.println("menu가 없네여");
			return;
		}
		menus[size++] = menu;
	}
	boolean delete(int no) {
		for(int i = no+1; i < size ; i++) {
			menus[size-1] = menus[size];
		}
		menus[size--] = null;
		return true;
	}
	
	@Override
	public
	void execute() {
		while(true) {
			System.out.printf("[%s]\n" , this.title);
			for(int i = 0 ; i < size ;i++) {
				System.out.printf("%d. %s\n",i+1,menus[i].title);
			}
			System.out.printf("0.%s\n",isPrevMenu);
			int menuNo = Prompt.inputInt("선택>");
			System.out.println();

			if(menuNo == 0) {
				return;
			}
			
			menus[menuNo-1].execute();
		}

	}
}
