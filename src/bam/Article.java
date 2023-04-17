package bam;

public class Article {
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