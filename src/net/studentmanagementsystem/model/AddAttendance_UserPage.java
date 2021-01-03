package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class AddAttendance_UserPage {
	protected int id;
	protected String stud_name;
	protected String subject_name ;
	protected String status;
	protected String lecture_title;
	protected String date;
	
	public AddAttendance_UserPage() {
	}
	
	public AddAttendance_UserPage(String stud_name, String subject_name, String status, String lecture_title, String date) {
		super();
		this.stud_name  = stud_name;
		this.subject_name = subject_name;
		this.status = status;
		this.lecture_title = lecture_title;
		this.date = date;
	}

	public AddAttendance_UserPage(int id, String stud_name, String subject_name, String status, String lecture_title, String date) {
		super();
		this.id = id;
		this.stud_name  = stud_name;
		this.subject_name = subject_name;
		this.status = status;
		this.lecture_title = lecture_title;
		this.date = date;
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

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLecture_title() {
		return lecture_title;
	}

	public void setLecture_title(String lecture_title) {
		this.lecture_title = lecture_title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
