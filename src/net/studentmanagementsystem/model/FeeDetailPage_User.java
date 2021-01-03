package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class FeeDetailPage_User {
	protected int id;
	protected String stud_name;
	protected String emailid;
	protected String school_name;
	protected String course;
	protected String month;
	protected int totalfee;
	protected int paidfee;
	protected int remfee;
	protected String date;
			
	public FeeDetailPage_User() {
	}
	
	public FeeDetailPage_User(String stud_name, String emailid, String school_name ,String course ,String month, int totalfee ,int paidfee ,int remfee ,String date) {
		super();
		this.stud_name = stud_name;
		this.emailid = emailid;
		this.school_name = school_name;
		this.course = course;
		this.month = month;
		this.totalfee = totalfee;
		this.paidfee = paidfee;
		this.remfee = remfee;
		this.date = date;
	}

	public FeeDetailPage_User(int id, String stud_name, String emailid, String school_name ,String course ,String month, int totalfee ,int paidfee ,int remfee ,String date) {
		super();
		this.id = id;
		this.stud_name = stud_name;
		this.emailid = emailid;
		this.school_name = school_name;
		this.course = course;
		this.month = month;
		this.totalfee = totalfee;
		this.paidfee = paidfee;
		this.remfee = remfee;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(int totalfee) {
		this.totalfee = totalfee;
	}

	public int getPaidfee() {
		return paidfee;
	}

	public void setPaidfee(int paidfee) {
		this.paidfee = paidfee;
	}

	public int getRemfee() {
		return remfee;
	}

	public void setRemfee(int remfee) {
		this.remfee = remfee;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
