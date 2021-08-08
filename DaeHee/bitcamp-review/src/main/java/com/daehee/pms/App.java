package com.daehee.pms;

import com.daehee.pms.handler.ArrayList;
import com.daehee.pms.handler.BoardHandler;
import com.daehee.pms.handler.List;
import com.daehee.pms.handler.MemberHandler;
import com.daehee.pms.handler.ProjectHandler;
import com.daehee.pms.handler.TaskHandler;
import com.daehee.pms.menu.Menu;
import com.daehee.pms.menu.MenuGroup;
import com.daehee.pms.util.Prompt;

public class App {

	public static void main(String[] args) {
		List boardList = new ArrayList();
		List memberList = new ArrayList();
		List projectList = new ArrayList();
		List taskList = new ArrayList();
		
		BoardHandler boardHandler = new BoardHandler(boardList);
		MemberHandler memberHandler = new MemberHandler(memberList);
		ProjectHandler projectHandler = new ProjectHandler(projectList,memberHandler);
		TaskHandler taskHandler = new TaskHandler(taskList,memberHandler);

		MenuGroup main = new MenuGroup("메인");
		main.setIsPrevMenu("종료");

		MenuGroup board = new MenuGroup("게시판");
		board.add(new Menu("등록") {
			public void execute() {
				boardHandler.add();
			}
		});
		board.add(new Menu("목록") {
			public void execute() {
				boardHandler.list();
			}
		});
		board.add(new Menu("상세 정보") {
			public void execute() {
				boardHandler.detail();
			}
		});
		board.add(new Menu("업데이트") {
			public void execute() {
				boardHandler.update();
			}
		});
		board.add(new Menu("삭제") {
			public void execute() {
				boardHandler.delete();
			}
		});
		main.add(board);

		MenuGroup member = new MenuGroup("회원");
		member.add(new Menu("등록") {
			public void execute() {
				memberHandler.add();
			}
		});
		member.add(new Menu("목록") {
			public void execute() {
				memberHandler.list();
			}
		});
		member.add(new Menu("상세 정보") {
			public void execute() {
				memberHandler.detail();
			}
		});
		member.add(new Menu("업데이트") {
			public void execute() {
				memberHandler.update();
			}
		});
		member.add(new Menu("삭제") {
			public void execute() {
				memberHandler.delete();
			}
		});
		main.add(member);

		MenuGroup project = new MenuGroup("프로젝트");
		project.add(new Menu("등록") {
			public void execute() {
				projectHandler.add();
			}
		});
		project.add(new Menu("목록") {
			public void execute() {
				projectHandler.list();
			}
		});
		project.add(new Menu("상세 정보") {
			public void execute() {
				projectHandler.detail();
			}
		});
		project.add(new Menu("업데이트") {
			public void execute() {
				projectHandler.update();
			}
		});
		project.add(new Menu("삭제") {
			public void execute() {
				projectHandler.delete();
			}
		});
		main.add(project);

		MenuGroup task = new MenuGroup("작업");
		task.add(new Menu("등록") {
			public void execute() {
				taskHandler.add();
			}
		});
		task.add(new Menu("목록") {
			public void execute() {
				taskHandler.list();
			}
		});
		task.add(new Menu("상세 정보") {
			public void execute() {
				taskHandler.detail();
			}
		});
		task.add(new Menu("업데이트") {
			public void execute() {
				taskHandler.update();
			}
		});
		task.add(new Menu("삭제") {
			public void execute() {
				taskHandler.delete();
			}
		});
		main.add(task);

		main.execute();

		Prompt.close();
		// Prompt 가 소유하고 관리하고 있는 자원을 닫으라고 명령한다.

	}
}
