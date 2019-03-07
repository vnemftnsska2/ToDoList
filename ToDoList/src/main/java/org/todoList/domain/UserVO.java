package org.todoList.domain;

import java.util.Date;

public class UserVO {

	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_email;
	private Date user_logdate;
	private Date user_regdate;

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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Date getUser_logdate() {
		return user_logdate;
	}

	public void setUser_logdate(Date user_logdate) {
		this.user_logdate = user_logdate;
	}

	public Date getUser_regdate() {
		return user_regdate;
	}

	public void setUser_regdate(Date user_regdate) {
		this.user_regdate = user_regdate;
	}

	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_email="
				+ user_email + ", user_logdate=" + user_logdate + ", user_regdate=" + user_regdate + "]";
	}

}
