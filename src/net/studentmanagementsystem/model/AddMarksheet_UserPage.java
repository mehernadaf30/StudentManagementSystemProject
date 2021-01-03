package net.studentmanagementsystem.model;

/**
 * User.java
 * This is a model class represents a User entity
 * 
 *
 */
public class AddMarksheet_UserPage {
	protected int id;
	protected String index_no;
	protected String dept_name;
	protected String division;
	protected int rollno;
	protected String year;
	protected String stud_name;
	protected String sub1_code;
	protected String sub1_name;
	protected int sub1_max_marks;
	protected int sub1_min_marks;
	protected int sub1_marks_obtained;
	protected String sub1_marks_in_words;
	protected String sub2_code;
	protected String sub2_name;
	protected int sub2_max_marks;
	protected int sub2_min_marks;
	protected int sub2_marks_obtained;
	protected String sub2_marks_in_words;
	protected String sub3_code;
	protected String sub3_name;
	protected int sub3_max_marks;
	protected int sub3_min_marks;
	protected int sub3_marks_obtained;
	protected String sub3_marks_in_words;
	protected String sub4_code;
	protected String sub4_name;
	protected int sub4_max_marks;
	protected int sub4_min_marks;
	protected int sub4_marks_obtained;
	protected String sub4_marks_in_words;
	protected String sub5_code;
	protected String sub5_name;
	protected int sub5_max_marks;
	protected int sub5_min_marks;
	protected int sub5_marks_obtained;
	protected String sub5_marks_in_words;
	protected String other_sub1_code;
	protected String other_sub1_name;
	protected String other_sub1_grades;
	protected String other_sub2_code;
	protected String other_sub2_name;
	protected String other_sub2_grades;
	protected int total_marks;
	protected int total_min_marks;
	protected int total_marks_obtained;
	protected String total_marks_obtained_in_words;
	protected String final_result;
	protected String percentage;
	

	public AddMarksheet_UserPage() {
	}
	
	public AddMarksheet_UserPage(String index_no, String dept_name, String division ,int rollno ,String year ,String stud_name, String sub1_code ,String sub1_name ,int sub1_max_marks ,int sub1_min_marks ,int sub1_marks_obtained ,String sub1_marks_in_words ,String sub2_code ,String sub2_name ,int sub2_max_marks ,int sub2_min_marks ,int sub2_marks_obtained ,String sub2_marks_in_words ,String sub3_code ,String sub3_name ,int sub3_max_marks ,int sub3_min_marks ,int sub3_marks_obtained ,String sub3_marks_in_words ,String sub4_code ,String sub4_name ,int sub4_max_marks ,int sub4_min_marks ,int sub4_marks_obtained ,String sub4_marks_in_words ,String sub5_code ,String sub5_name ,int sub5_max_marks ,int sub5_min_marks ,int sub5_marks_obtained ,String sub5_marks_in_words ,String other_sub1_code ,String other_sub1_name ,String other_sub1_grades ,String other_sub2_code ,String other_sub2_name ,String other_sub2_grades ,int total_marks ,int total_min_marks ,int total_marks_obtained ,String total_marks_obtained_in_words ,String final_result ,String percentage) {
		super();
				this.index_no =	index_no;
				this.dept_name = dept_name;
				this.division = division;
				this.rollno = rollno;
				this.year = year;
				this.stud_name = stud_name;
				this.sub1_code = sub1_code;
				this.sub1_name = sub1_name;
				this.sub1_max_marks = sub1_max_marks;
				this.sub1_min_marks = sub1_min_marks;
				this.sub1_marks_obtained = sub1_marks_obtained;
				this.sub1_marks_in_words = sub1_marks_in_words;
				this.sub2_code = sub2_code;
				this.sub2_name = sub2_name;
				this.sub2_max_marks = sub2_max_marks;
				this.sub2_min_marks = sub2_min_marks;
		        this.sub2_marks_obtained = sub2_marks_obtained;
		        this.sub2_marks_in_words = sub2_marks_in_words;
		        this.sub3_code = sub3_code;
		        this.sub3_name = sub3_name;
		        this.sub3_max_marks = sub3_max_marks;
		        this.sub3_min_marks = sub3_min_marks;
		        this.sub3_marks_obtained = sub3_marks_obtained;
		        this.sub3_marks_in_words = sub3_marks_in_words;
		        this.sub4_code = sub4_code;
		        this.sub4_name = sub4_name;
		        this.sub4_max_marks = sub4_max_marks;
		        this.sub4_min_marks = sub4_min_marks;
		        this.sub4_marks_obtained = sub4_marks_obtained;
		        this.sub4_marks_in_words = sub4_marks_in_words;
		        this.sub5_code = sub5_code;
		        this.sub5_name = sub5_name;
		        this.sub5_max_marks = sub5_max_marks;
		        this.sub5_min_marks = sub5_min_marks;
		        this.sub5_marks_obtained = sub5_marks_obtained;
		        this.sub5_marks_in_words = sub5_marks_in_words;
		        this.other_sub1_code = other_sub1_code;
		        this.other_sub1_name  = other_sub1_name;
		        this.other_sub1_grades = other_sub1_grades;
		        this.other_sub2_code = other_sub2_code;
		        this.other_sub2_name = other_sub2_name;
		        this.other_sub2_grades  = other_sub2_grades;
		        this.total_marks = total_marks;
		        this.total_min_marks = total_min_marks;
		        this.total_marks_obtained = total_marks_obtained;
		        this.total_marks_obtained_in_words = total_marks_obtained_in_words;
		        this.final_result = final_result;
		        this.percentage = percentage;
	}

	public AddMarksheet_UserPage(int id, String index_no, String dept_name, String division ,int rollno ,String year ,String stud_name, String sub1_code ,String sub1_name ,int sub1_max_marks ,int sub1_min_marks ,int sub1_marks_obtained ,String sub1_marks_in_words ,String sub2_code ,String sub2_name ,int sub2_max_marks ,int sub2_min_marks ,int sub2_marks_obtained ,String sub2_marks_in_words ,String sub3_code ,String sub3_name ,int sub3_max_marks ,int sub3_min_marks ,int sub3_marks_obtained ,String sub3_marks_in_words ,String sub4_code ,String sub4_name ,int sub4_max_marks ,int sub4_min_marks ,int sub4_marks_obtained ,String sub4_marks_in_words ,String sub5_code ,String sub5_name ,int sub5_max_marks ,int sub5_min_marks ,int sub5_marks_obtained ,String sub5_marks_in_words ,String other_sub1_code ,String other_sub1_name ,String other_sub1_grades ,String other_sub2_code ,String other_sub2_name ,String other_sub2_grades ,int total_marks ,int total_min_marks ,int total_marks_obtained ,String total_marks_obtained_in_words ,String final_result ,String percentage) {
		super();
		this.id = id;
		this.index_no =	index_no;
		this.dept_name = dept_name;
		this.division = division;
		this.rollno = rollno;
		this.year = year;
		this.stud_name = stud_name;
		this.sub1_code = sub1_code;
		this.sub1_name = sub1_name;
		this.sub1_max_marks = sub1_max_marks;
		this.sub1_min_marks = sub1_min_marks;
		this.sub1_marks_obtained = sub1_marks_obtained;
		this.sub1_marks_in_words = sub1_marks_in_words;
		this.sub2_code = sub2_code;
		this.sub2_name = sub2_name;
		this.sub2_max_marks = sub2_max_marks;
		this.sub2_min_marks = sub2_min_marks;
        this.sub2_marks_obtained = sub2_marks_obtained;
        this.sub2_marks_in_words = sub2_marks_in_words;
        this.sub3_code = sub3_code;
        this.sub3_name = sub3_name;
        this.sub3_max_marks = sub3_max_marks;
        this.sub3_min_marks = sub3_min_marks;
        this.sub3_marks_obtained = sub3_marks_obtained;
        this.sub3_marks_in_words = sub3_marks_in_words;
        this.sub4_code = sub4_code;
        this.sub4_name = sub4_name;
        this.sub4_max_marks = sub4_max_marks;
        this.sub4_min_marks = sub4_min_marks;
        this.sub4_marks_obtained = sub4_marks_obtained;
        this.sub4_marks_in_words = sub4_marks_in_words;
        this.sub5_code = sub5_code;
        this.sub5_name = sub5_name;
        this.sub5_max_marks = sub5_max_marks;
        this.sub5_min_marks = sub5_min_marks;
        this.sub5_marks_obtained = sub5_marks_obtained;
        this.sub5_marks_in_words = sub5_marks_in_words;
        this.other_sub1_code = other_sub1_code;
        this.other_sub1_name  = other_sub1_name;
        this.other_sub1_grades = other_sub1_grades;
        this.other_sub2_code = other_sub2_code;
        this.other_sub2_name = other_sub2_name;
        this.other_sub2_grades  = other_sub2_grades;
        this.total_marks = total_marks;
        this.total_min_marks = total_min_marks;
        this.total_marks_obtained = total_marks_obtained;
        this.total_marks_obtained_in_words = total_marks_obtained_in_words;
        this.final_result = final_result;
        this.percentage = percentage;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getIndex_no() {
		return index_no;
	}

	public void setIndex_no(String index_no) {
		this.index_no = index_no;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getSub1_code() {
		return sub1_code;
	}

	public void setSub1_code(String sub1_code) {
		this.sub1_code = sub1_code;
	}

	public String getSub1_name() {
		return sub1_name;
	}

	public void setSub1_name(String sub1_name) {
		this.sub1_name = sub1_name;
	}

	public int getSub1_max_marks() {
		return sub1_max_marks;
	}

	public void setSub1_max_marks(int sub1_max_marks) {
		this.sub1_max_marks = sub1_max_marks;
	}

	public int getSub1_min_marks() {
		return sub1_min_marks;
	}

	public void setSub1_min_marks(int sub1_min_marks) {
		this.sub1_min_marks = sub1_min_marks;
	}

	public int getSub1_marks_obtained() {
		return sub1_marks_obtained;
	}

	public void setSub1_marks_obtained(int sub1_marks_obtained) {
		this.sub1_marks_obtained = sub1_marks_obtained;
	}

	public String getSub1_marks_in_words() {
		return sub1_marks_in_words;
	}

	public void setSub1_marks_in_words(String sub1_marks_in_words) {
		this.sub1_marks_in_words = sub1_marks_in_words;
	}

	public String getSub2_code() {
		return sub2_code;
	}

	public void setSub2_code(String sub2_code) {
		this.sub2_code = sub2_code;
	}

	public String getSub2_name() {
		return sub2_name;
	}

	public void setSub2_name(String sub2_name) {
		this.sub2_name = sub2_name;
	}

	public int getSub2_max_marks() {
		return sub2_max_marks;
	}

	public void setSub2_max_marks(int sub2_max_marks) {
		this.sub2_max_marks = sub2_max_marks;
	}

	public int getSub2_min_marks() {
		return sub2_min_marks;
	}

	public void setSub2_min_marks(int sub2_min_marks) {
		this.sub2_min_marks = sub2_min_marks;
	}

	public int getSub2_marks_obtained() {
		return sub2_marks_obtained;
	}

	public void setSub2_marks_obtained(int sub2_marks_obtained) {
		this.sub2_marks_obtained = sub2_marks_obtained;
	}

	public String getSub2_marks_in_words() {
		return sub2_marks_in_words;
	}

	public void setSub2_marks_in_words(String sub2_marks_in_words) {
		this.sub2_marks_in_words = sub2_marks_in_words;
	}

	public String getSub3_code() {
		return sub3_code;
	}

	public void setSub3_code(String sub3_code) {
		this.sub3_code = sub3_code;
	}

	public String getSub3_name() {
		return sub3_name;
	}

	public void setSub3_name(String sub3_name) {
		this.sub3_name = sub3_name;
	}

	public int getSub3_max_marks() {
		return sub3_max_marks;
	}

	public void setSub3_max_marks(int sub3_max_marks) {
		this.sub3_max_marks = sub3_max_marks;
	}

	public int getSub3_min_marks() {
		return sub3_min_marks;
	}

	public void setSub3_min_marks(int sub3_min_marks) {
		this.sub3_min_marks = sub3_min_marks;
	}

	public int getSub3_marks_obtained() {
		return sub3_marks_obtained;
	}

	public void setSub3_marks_obtained(int sub3_marks_obtained) {
		this.sub3_marks_obtained = sub3_marks_obtained;
	}

	public String getSub3_marks_in_words() {
		return sub3_marks_in_words;
	}

	public void setSub3_marks_in_words(String sub3_marks_in_words) {
		this.sub3_marks_in_words = sub3_marks_in_words;
	}

	public String getSub4_code() {
		return sub4_code;
	}

	public void setSub4_code(String sub4_code) {
		this.sub4_code = sub4_code;
	}

	public String getSub4_name() {
		return sub4_name;
	}

	public void setSub4_name(String sub4_name) {
		this.sub4_name = sub4_name;
	}

	public int getSub4_max_marks() {
		return sub4_max_marks;
	}

	public void setSub4_max_marks(int sub4_max_marks) {
		this.sub4_max_marks = sub4_max_marks;
	}

	public int getSub4_min_marks() {
		return sub4_min_marks;
	}

	public void setSub4_min_marks(int sub4_min_marks) {
		this.sub4_min_marks = sub4_min_marks;
	}

	public int getSub4_marks_obtained() {
		return sub4_marks_obtained;
	}

	public void setSub4_marks_obtained(int sub4_marks_obtained) {
		this.sub4_marks_obtained = sub4_marks_obtained;
	}

	public String getSub4_marks_in_words() {
		return sub4_marks_in_words;
	}

	public void setSub4_marks_in_words(String sub4_marks_in_words) {
		this.sub4_marks_in_words = sub4_marks_in_words;
	}

	public String getSub5_code() {
		return sub5_code;
	}

	public void setSub5_code(String sub5_code) {
		this.sub5_code = sub5_code;
	}

	public String getSub5_name() {
		return sub5_name;
	}

	public void setSub5_name(String sub5_name) {
		this.sub5_name = sub5_name;
	}

	public int getSub5_max_marks() {
		return sub5_max_marks;
	}

	public void setSub5_max_marks(int sub5_max_marks) {
		this.sub5_max_marks = sub5_max_marks;
	}

	public int getSub5_min_marks() {
		return sub5_min_marks;
	}

	public void setSub5_min_marks(int sub5_min_marks) {
		this.sub5_min_marks = sub5_min_marks;
	}

	public int getSub5_marks_obtained() {
		return sub5_marks_obtained;
	}

	public void setSub5_marks_obtained(int sub5_marks_obtained) {
		this.sub5_marks_obtained = sub5_marks_obtained;
	}

	public String getSub5_marks_in_words() {
		return sub5_marks_in_words;
	}

	public void setSub5_marks_in_words(String sub5_marks_in_words) {
		this.sub5_marks_in_words = sub5_marks_in_words;
	}

	public String getOther_sub1_code() {
		return other_sub1_code;
	}

	public void setOther_sub1_code(String other_sub1_code) {
		this.other_sub1_code = other_sub1_code;
	}

	public String getOther_sub1_name() {
		return other_sub1_name;
	}

	public void setOther_sub1_name(String other_sub1_name) {
		this.other_sub1_name = other_sub1_name;
	}

	public String getOther_sub1_grades() {
		return other_sub1_grades;
	}

	public void setOther_sub1_grades(String other_sub1_grades) {
		this.other_sub1_grades = other_sub1_grades;
	}

	public String getOther_sub2_code() {
		return other_sub2_code;
	}

	public void setOther_sub2_code(String other_sub2_code) {
		this.other_sub2_code = other_sub2_code;
	}

	public String getOther_sub2_name() {
		return other_sub2_name;
	}

	public void setOther_sub2_name(String other_sub2_name) {
		this.other_sub2_name = other_sub2_name;
	}

	public String getOther_sub2_grades() {
		return other_sub2_grades;
	}

	public void setOther_sub2_grades(String other_sub2_grades) {
		this.other_sub2_grades = other_sub2_grades;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public int getTotal_min_marks() {
		return total_min_marks;
	}

	public void setTotal_min_marks(int total_min_marks) {
		this.total_min_marks = total_min_marks;
	}

	public int getTotal_marks_obtained() {
		return total_marks_obtained;
	}

	public void setTotal_marks_obtained(int total_marks_obtained) {
		this.total_marks_obtained = total_marks_obtained;
	}

	public String getTotal_marks_obtained_in_words() {
		return total_marks_obtained_in_words;
	}

	public void setTotal_marks_obtained_in_words(String total_marks_obtained_in_words) {
		this.total_marks_obtained_in_words = total_marks_obtained_in_words;
	}

	public String getFinal_result() {
		return final_result;
	}

	public void setFinal_result(String final_result) {
		this.final_result = final_result;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

}
