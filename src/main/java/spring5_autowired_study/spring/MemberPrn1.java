package spring5_autowired_study.spring;

public class MemberPrn1 extends MemberPrinter{

	@Override
	public void print(Member member) {
		System.out.printf("회원정보: 아이디=%d, 이메일=%s",
				member.getId(), member.getEmail());
	}
	
}
