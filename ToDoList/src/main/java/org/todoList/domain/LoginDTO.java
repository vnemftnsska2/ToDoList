package org.todoList.domain;

public class LoginDTO {

	private String user_id;
	private String user_pw;
	private boolean haveCookie;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	
	public boolean isHaveCookie() {
		return haveCookie;
	}

	public void setHaveCookie(boolean haveCookie) {
		this.haveCookie = haveCookie;
	}

	@Override
	public String toString() {
		return "LoginVO [user_id=" + user_id + ", user_pw=" + user_pw + ", haveCookie=" + haveCookie + "]";
	}

}
