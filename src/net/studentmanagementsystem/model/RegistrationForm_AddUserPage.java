package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class RegistrationForm_AddUserPage {
	protected int id;
	protected String firstname;
	protected String lastname ;
	protected String loginid;
	protected String password;
	protected String confirmpwd;
	protected String schoolname;
	protected String coursename;
	protected String telephone;
	protected String gender;
	protected String dob;
	protected String emailid;
	protected String address1;
	protected String address2;
	protected String country;
	protected String state;
	protected String city;
	protected int roleid;
	

	public RegistrationForm_AddUserPage() {
	}
	
	public RegistrationForm_AddUserPage(String firstname, String lastname, String loginid, String password, String confirmpwd, String schoolname, String coursename, String telephone, String gender, String dob, String emailid, String address1, String address2, String country, String state, String city, int roleid) {
		super();
		this.firstname  = firstname;
		this.lastname = lastname;
		this.loginid = loginid;
		this.password = password;
		this.confirmpwd = confirmpwd;
		this.schoolname = schoolname;
		this.coursename = coursename;
		this.telephone = telephone;
		this.gender = gender;
		this.dob = dob;
		this.emailid = emailid;
		this.address1 = address1;
		this.address2 = address2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.roleid = roleid;
	}

	public RegistrationForm_AddUserPage(int id, String firstname, String lastname, String loginid, String password, String confirmpwd, String schoolname, String coursename, String telephone, String gender, String dob, String emailid, String address1, String address2, String country, String state, String city, int roleid) {
		super();
		this.id = id;
		this.firstname  = firstname;
		this.lastname = lastname;
		this.loginid = loginid;
		this.password = password;
		this.confirmpwd = confirmpwd;
		this.schoolname = schoolname;
		this.coursename = coursename;
		this.telephone = telephone;
		this.gender = gender;
		this.dob = dob;
		this.emailid = emailid;
		this.address1 = address1;
		this.address2 = address2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.roleid = roleid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public String getConfirmpwd() {
		return confirmpwd;
	}

	public void setConfirmpwd(String confirmpwd) {
		this.confirmpwd = confirmpwd;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

}
