package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class LoginPage_User {
	protected int id;
	protected String loginid;
	protected String password;
	protected int roleid;
	protected String firstname;
	protected String lastname;
		
	public LoginPage_User() {
	}
	
	public LoginPage_User(String loginid, String password, int roleid, String firstname, String lastname) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.roleid = roleid;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public LoginPage_User(int id, String loginid, String password, int roleid, String firstname, String lastname) {
		super();
		this.id = id;
		this.loginid = loginid;
		this.password = password;
		this.roleid = roleid;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
		
}
