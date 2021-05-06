package spring5_autowired_study.spring;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	private DateTimeFormatter dateTimeFormatter;
	
	public MemberPrinter() {
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	}

	public void print(Member member) {
		if (dateTimeFormatter == null) {
		System.out.printf("회원정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF %n",
			member.getId(), member.getEmail(), member.getName(), member.getRegisterDataTime());
		}else {
			System.out.printf("회원정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%s%n",
					member.getId(), member.getEmail(), member.getName(), 
					dateTimeFormatter.format(member.getRegisterDataTime()));
		}
	}

	//required = false -> 인수가 null이므로 세터메서드를 호출하지 않아 생성자에서 초기화된 DateTimeFormatter.ofPattern에 의해 등록일을 출력
	@Autowired /* (required = false) */
	public void setDateTimeFormatter(@Nullable  DateTimeFormatter dateTimeFormatter) {
		this.dateTimeFormatter = dateTimeFormatter;
	}
	
}
