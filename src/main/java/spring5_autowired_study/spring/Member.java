package spring5_autowired_study.spring;

import java.time.LocalDateTime;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDataTime;
	
	public Member() {
		
	}

	public Member(String email, String password, String name, LocalDateTime registerDataTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDataTime = registerDataTime;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			throw new WrongIdPasswordException();
		}else {
			this.password = newPassword;
		}
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getRegisterDataTime() {
		return registerDataTime;
	}

	public void setRegisterDataTime(LocalDateTime registerDataTime) {
		this.registerDataTime = registerDataTime;
	}

	@Override
	public String toString() {
		return String.format("[id=%s, email=%s, password=%s, name=%s, registerDataTime=%s]", id, email, password,
				name, registerDataTime);
	}
}
