package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class AddSubject_UserPage {
	protected int id;
	protected String subject_name;
	protected String subject_desc;
	

	public AddSubject_UserPage() {
	}
	
	public AddSubject_UserPage(String subject_name, String subject_desc) {
		super();
		this.subject_name  = subject_name;
		this.subject_desc = subject_desc;
	}

	public AddSubject_UserPage(int id, String subject_name, String subject_desc) {
		super();
		this.id = id;
		this.subject_name  = subject_name;
		this.subject_desc = subject_desc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getSubject_desc() {
		return subject_desc;
	}

	public void setSubject_desc(String subject_desc) {
		this.subject_desc = subject_desc;
	}
}
