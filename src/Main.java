//   2023/4/11 오후 19시 웹개발 수업
//   Workspace 이름 eclipes-work_space


package bam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("== 프로그램 시작 ==");
      Scanner sc = new Scanner(System.in);
      int lastArticleId = 0;
      List<Article> articles = new ArrayList<>();
      while (true) {
         System.out.printf("명령어) ");
         String cmd = sc.nextLine();

         if (cmd.equals("exit")) {
            break;
         }
         // 게시글 작성
         if (cmd.equals("article write")) {
            int id = lastArticleId + 1;
            lastArticleId = id;
            System.out.printf("제목 : ");
            String title = sc.nextLine();
            System.out.printf("내용 : ");
            String body = sc.nextLine();

            Article article = new Article(id, Util.getDataStr(), title, body);
            articles.add(article);
            System.out.printf("%d번 글이 생성되었습니다\n", id);

         } 
         // 게시글 리스트 확인
         	else if (cmd.equals("article list")) {
            if (articles.size() == 0) {
               System.out.println("존재하는 게시물이 없습니다");
               continue;
            }
            System.out.println("== 게시물 목록 ==");
            System.out.println("번호   |   제목   |	작성일	");
            for (int i = articles.size() - 1; i >= 0; i--) {
				Article article = articles.get(i);
            System.out.printf("%d	|	%s	|	%s	\n", article.id, article.title);
         }
         for (int i = articles.size() - 1; i >= 0; i--) {
            Article article = articles.get(i);

            System.out.printf("%d   |   %s   \n", article.id, article.title, article.regDate);
         }
         //게시글 확인
         if (cmd.startsWith("article detail ")) {

				String[] cmdBits = cmd.split(" ");
				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = null;

				for (Article article : articles) {
					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
					continue;
				}

				System.out.println("== 게시물 상세보기 ==");
				System.out.printf("번호 : %d\n", foundArticle.id);
				System.out.printf("제목 : %s\n", foundArticle.title);
				System.out.printf("내용 : %s\n", foundArticle.body);
			} 
		}
         //게시글 수정
         	 else if (cmd.startsWith("article modify ")) {

 				String[] cmdBits = cmd.split(" ");
 				int id = Integer.parseInt(cmdBits[2]);

 				Article foundArticle = null;

 				for (Article article : articles) {
 					if (article.id == id) {
 						foundArticle = article;
 						break;
 					}
 				}

 				if (foundArticle == null) {
 					System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
 					continue;
 				}

 				System.out.println("== 게시물 수정 ==");
 				System.out.printf("수정할 제목 : ");
 				String title = sc.nextLine();
 				System.out.printf("수정할 내용 : ");
 				String body = sc.nextLine();

 				foundArticle.title = title;
 				foundArticle.body = body;

 				System.out.printf("%d번 게시물이 수정되었습니다\n", id);
        		 continue;
        	 }
         //게시글 삭제
      		else if (cmd.startsWith("article deldte")) {
        	 String[] cmdBits = cmd.split(" ");
				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = null;

				for (Article article : articles) {
					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}
				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
					continue;
				}

				articles.remove(foundArticle);

				System.out.printf("%d번 게시물이 삭제되었습니다\n", id);
         }
 
         else {
 			System.out.println("존재하지 않는 명령어 입니다");
 		} 
    
    }
      sc.close();

      System.out.println("== 프로그램 끝 ==");
   }

}

class Article {
   int id;
   String title;
   String body;
   String regData;

   public Article(int id, String regData, String title, String body) {
      this.id = id;
      this.regData = regData;
      this.title = title;
      this.body = body;
   }
}

//게시물 시간 추가
//Util.java에서 에러 발생
//시간에서 에러 발생