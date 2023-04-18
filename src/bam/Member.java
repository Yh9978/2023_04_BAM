package bam;

public class Member {
	public int id;
	public String loginId;
	public String loginPw;
	public String name;
	public String regData;
	
	
		public Member(int id, String loginId, String loginPw, String name, String regData) {
			this.id = id;
			this.loginId = loginId;
			this.loginPw = loginPw;
			this.name = name;
			this.regData = regData;
		}
}
