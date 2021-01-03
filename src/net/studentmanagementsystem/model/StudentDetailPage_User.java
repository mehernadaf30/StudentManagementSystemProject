package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class StudentDetailPage_User {
	protected int id;
	protected String stud_name;
	protected String emailid;
	protected String dob;
	protected String contact;
	protected String address;
		
	public StudentDetailPage_User() {
	}
	
	public StudentDetailPage_User(String stud_name, String emailid, String dob, String contact, String address) {
		super();
		this.stud_name = stud_name;
		this.emailid = emailid;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
	}

	public StudentDetailPage_User(int id, String stud_name, String emailid, String dob, String contact, String address) {
		super();
		this.id = id;
		this.stud_name = stud_name;
		this.emailid = emailid;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
		
}
