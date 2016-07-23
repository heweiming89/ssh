package cn.heweiming.ssh.model;

import java.util.Date;

public class Admin {

	private int id;
	private String username;
	private String password;
	private Date birthday;
	
	public Date getBirthday() {
		return birthday;
	}
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
