package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class SubjectDetailPage_User {
	protected int id;
	protected String sub_name;
	protected String sub_code;
	protected String lecturer_name;
	protected String lec_time;
	protected String department;
			
	public SubjectDetailPage_User() {
	}
	
	public SubjectDetailPage_User(String sub_name, String sub_code, String lecturer_name, String lec_time, String department) {
		super();
		this.sub_name = sub_name;
		this.sub_code = sub_code;
		this.lecturer_name = lecturer_name;
		this.lec_time = lec_time;
		this.department = department;
	}

	public SubjectDetailPage_User(int id, String sub_name, String sub_code, String lecturer_name, String lec_time, String department) {
		super();
		this.id = id;
		this.sub_name = sub_name;
		this.sub_code = sub_code;
		this.lecturer_name = lecturer_name;
		this.lec_time = lec_time;
		this.department = department;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getSub_code() {
		return sub_code;
	}

	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}

	public String getLecturer_name() {
		return lecturer_name;
	}

	public void setLecturer_name(String lecturer_name) {
		this.lecturer_name = lecturer_name;
	}

	public String getLec_time() {
		return lec_time;
	}

	public void setLec_time(String lec_time) {
		this.lec_time = lec_time;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
