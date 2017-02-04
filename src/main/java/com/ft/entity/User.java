package com.ft.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private int userId;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private Date birthday;
	
	private int usernum;
	
	private int memberId;
	
	

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public int getUsernum() {
		return usernum;
	}



	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}



	public int getMemberId() {
		return memberId;
	}



	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", birthday=" + birthday + ", usernum=" + usernum + ", memberId=" + memberId + "]";
	}
	
}
