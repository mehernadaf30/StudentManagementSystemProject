package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class AttendanceDetailPage_User {
	protected int id;
	protected String stud_name;
	protected String sub_name;
	protected String lec_name;
	protected String dob;
	protected String status;
		
	public AttendanceDetailPage_User() {
	}
	
	public AttendanceDetailPage_User(String stud_name, String sub_name, String lec_name, String dob, String status) {
		super();
		this.stud_name = stud_name;
		this.sub_name = sub_name;
		this.lec_name = lec_name;
		this.dob = dob;
		this.status = status;
	}

	public AttendanceDetailPage_User(int id, String stud_name, String sub_name, String lec_name, String dob, String status) {
		super();
		this.id = id;
		this.stud_name = stud_name;
		this.sub_name = sub_name;
		this.lec_name = lec_name;
		this.dob = dob;
		this.status = status;
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

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getLec_name() {
		return lec_name;
	}

	public void setLec_name(String lec_name) {
		this.lec_name = lec_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
