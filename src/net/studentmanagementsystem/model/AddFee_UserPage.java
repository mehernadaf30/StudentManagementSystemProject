package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class AddFee_UserPage {
	protected int id;
	protected String stud_name;
	protected String month ;
	protected int amount;
	protected int totalfee;
	protected int paidfee;
	protected int balancefee;
	protected String date;
	
	public AddFee_UserPage() {
	}
	
	public AddFee_UserPage(String stud_name, String month, int amount, int totalfee, int paidfee, int balancefee, String date) {
		super();
		this.stud_name  = stud_name;
		this.month = month;
		this.amount = amount;
		this.totalfee = totalfee;
		this.paidfee = paidfee;
		this.balancefee = balancefee;
		this.date = date;
	}

	public AddFee_UserPage(int id, String stud_name, String month, int amount, int totalfee, int paidfee, int balancefee, String date) {
		super();
		this.id = id;
		this.stud_name  = stud_name;
		this.month = month;
		this.amount = amount;
		this.totalfee = totalfee;
		this.paidfee = paidfee;
		this.balancefee = balancefee;
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

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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

	public int getBalancefee() {
		return balancefee;
	}

	public void setBalancefee(int balancefee) {
		this.balancefee = balancefee;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


}
