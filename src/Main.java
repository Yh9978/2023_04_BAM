//   2023/4/11 오후 19시 웹개발 수업
//   Workspace 이름 eclipes-work_space

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	@SuppressWarnings("hiding")
	public static <Article> void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("==Program Start==");
		 
		 String command;
		 
		 command = sc.next();

		 int num = sc.nextInt();
			System.out.printf("입력된 정수 : %d\n", num);
			int lastArticleId = 0;
			lastArticleId = num;
			
			List<Article> articles = new ArrayList<>();
			
			
		 
		 while(true) {
			 System.out.println("명령어");
			 String cmd = sc.nextLine();
			 
			 if(cmd.equals("article list")) {
				 if (articles.size() == 0) {
					System.out.println("존재하는 게시글이 없습니다");
					continue;
				}
					
				System.out.println("번호    |  제목");
				 
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf("%d  	 |  %s\n", article.id, article.title);

				}
			} else if(cmd.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				
				articles.add(article);
				
				System.out.printf("%d번글이 생성되었습니다\n", id);
			}
				
			} else {
				System.out.println("존재하지 않는 명령어 입니다");
			}
			
			 
			
			 if(cmd.equals("exit")) {
				 break;
			 }
		 }
		 
		 sc.close();
		 
		 System.out.println("==Program Quit==");

		 
		 
	

	}
}
class Article {
		int id;
		String title;
		String body;

		public Article(int id, String title, String body) {
			this.id = id;
			this.title = title;
			this.body = body;
		}
	}

// article id,title,body에 에러가 있다.
// 근데 왜이러는지 진짜 모르겠다