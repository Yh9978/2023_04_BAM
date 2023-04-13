//   2023/4/11 오후 19시 웹개발 수업
//   Workspace 이름 eclipes-work_space

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("==Program Start==");
		 

		 
		 while(true) {
			 System.out.println("명령어");
			 String cmd = sc.nextLine();
			 
			 if(cmd.equals("exit")) {
				 break;
			 }
		 }
		 
		 sc.close();
		 
		 System.out.println("==Program Quit==");

		 
		 
	}
}
