CREATE DATABASE 'studentmanagementsystemdb';
USE studentmanagementsystemdb;

create table  fee_details (
	id  int(11) NOT NULL AUTO_INCREMENT,
	stud_name varchar(120) NOT NULL,
	emailid varchar(220) NOT NULL,
	school_name varchar(120),
	course varchar(120),
	month varchar(30) NOT NULL,
	totalfee int(30) NOT NULL,
	paidfee int(30) NOT NULL,
	remfee int(30) NOT NULL, 
	date varchar(50) NOT NULL,
	PRIMARY KEY (id)
);

create table  stud_addattendance (
	id  int(11) NOT NULL AUTO_INCREMENT,
	stud_name varchar(120) NOT NULL,
	subject_name varchar(220) NOT NULL,
	status varchar(120) NOT NULL,
	lecture_title varchar(120),
	date varchar(50) NOT NULL,
	PRIMARY KEY (id)
);


create table stud_addfee (
	id  int(11) NOT NULL AUTO_INCREMENT,
	stud_name varchar(120) NOT NULL,
	month varchar(30) NOT NULL,
	amount int(30) NOT NULL,
	totalfee int(30) NOT NULL,
	paidfee int(30) NOT NULL,
	balancefee int(30) NOT NULL, 
	date varchar(50) NOT NULL,
	PRIMARY KEY (id)
);


/*create table stud_addmarksheet (
	id  int(11) NOT NULL AUTO_INCREMENT,
	dept_name varchar(30) NOT NULL,
	rollno int(20) NOT NULL,
	sub1_name varchar(80) NOT NULL,
	sub1_marks int(20) NOT NULL,
	sub2_name varchar(80) NOT NULL,
	sub2_marks int(20) NOT NULL,
	sub3_name varchar(80) NOT NULL,
	sub3_marks int(20) NOT NULL,
	sub4_name varchar(80) NOT NULL,
	sub4_marks int(20) NOT NULL,
	sub5_name varchar(80) NOT NULL,
	sub5_marks int(20) NOT NULL,
	PRIMARY KEY (id)
);*/


create table stud_addsubject (
	id  int(11) NOT NULL AUTO_INCREMENT,
	subject_name varchar(220) NOT NULL,
	subject_desc varchar(220) NOT NULL,
	PRIMARY KEY (id)
);


create table stud_attdetails (
	id  int(11) NOT NULL AUTO_INCREMENT,
	stud_name varchar(220) NOT NULL,
	sub_name varchar(220) NOT NULL,
	lec_name  varchar(90) NOT NULL,
	dob varchar(90) NOT NULL,
	status varchar(90) NOT NULL,
	PRIMARY KEY (id)
);


create table stud_details (
	id  int(11) NOT NULL AUTO_INCREMENT,
	stud_name varchar(220) NOT NULL,
	emailid varchar(220) NOT NULL,
	dob varchar(90) NOT NULL,
	contact varchar(20),
	address varchar(220) NOT NULL,
	PRIMARY KEY (id)
);


create table stud_registration (
	id  int(11) NOT NULL AUTO_INCREMENT,
	firstname varchar(100) NOT NULL,
	lastname varchar(100) NOT NULL, 
	loginid varchar(120) NOT NULL, 
	password varchar(100) NOT NULL, 
	confirmpwd varchar(100) NOT NULL, 
	schoolname varchar(120),
	coursename varchar(100) NOT NULL,
	telephone varchar(20) NOT NULL,     
	gender varchar(30) NOT NULL, 
	dob varchar(60) NOT NULL, 
	emailid varchar(100) NOT NULL, 
	address1 varchar(220) NOT NULL,
	address2 varchar(220),
	country varchar(100) NOT NULL, 
	state varchar(100) NOT NULL, 
	city varchar(100) NOT NULL,
	roleid int(10) NOT NULL,
	PRIMARY KEY (id)
);



create table sub_details (
	id  int(11) NOT NULL AUTO_INCREMENT,
	sub_name varchar(100) NOT NULL,
	sub_code varchar(100) NOT NULL, 
	lecturer_name varchar(120) NOT NULL, 
	lec_time varchar(100) NOT NULL, 
	department varchar(100) NOT NULL,
	PRIMARY KEY (id)
);


create table stud_addmarksheet (
	id  int(11) NOT NULL AUTO_INCREMENT,
	index_no varchar(90) NOT NULL,
	dept_name varchar(30) NOT NULL,
	division varchar(30) NOT NULL,
	rollno int(40) NOT NULL,
	year varchar(50) NOT NULL,
	stud_name varchar(120) NOT NULL,
	sub1_code varchar(50) NOT NULL,
	sub1_name varchar(180) NOT NULL,
	sub1_max_marks int(50) NOT NULL,
	sub1_min_marks int(50) NOT NULL,
	sub1_marks_obtained int(50) NOT NULL,
	sub1_marks_in_words varchar(150) NOT NULL,
	sub2_code varchar(50) NOT NULL,
	sub2_name varchar(180) NOT NULL,
	sub2_max_marks int(50) NOT NULL,
	sub2_min_marks int(50) NOT NULL,
	sub2_marks_obtained int(50) NOT NULL,
	sub2_marks_in_words varchar(150) NOT NULL,
	sub3_code varchar(50) NOT NULL,
	sub3_name varchar(180) NOT NULL,
	sub3_max_marks int(50) NOT NULL,
	sub3_min_marks int(50) NOT NULL,
	sub3_marks_obtained int(50) NOT NULL,
	sub3_marks_in_words varchar(150) NOT NULL,
	sub4_code varchar(50) NOT NULL,
	sub4_name varchar(180) NOT NULL,
	sub4_max_marks int(50) NOT NULL,
	sub4_min_marks int(50) NOT NULL,
	sub4_marks_obtained int(50) NOT NULL,
	sub4_marks_in_words varchar(150) NOT NULL,
	sub5_code varchar(50) NOT NULL,
	sub5_name varchar(180) NOT NULL,
	sub5_max_marks int(50) NOT NULL,
	sub5_min_marks int(50) NOT NULL,
	sub5_marks_obtained int(50) NOT NULL,
	sub5_marks_in_words varchar(150) NOT NULL,
	other_sub1_code varchar(50) NOT NULL,
	other_sub1_name varchar(180) NOT NULL,
	other_sub1_grades varchar(150) NOT NULL,
	other_sub2_code varchar(50) NOT NULL,
	other_sub2_name varchar(180) NOT NULL,
	other_sub2_grades varchar(150) NOT NULL,
	total_marks int(100) NOT NULL,
	total_min_marks int(100) NOT NULL,
	total_marks_obtained int(100) NOT NULL,
	total_marks_obtained_in_words varchar(250) NOT NULL,
	final_result varchar(250) NOT NULL,
	percentage varchar(150) NOT NULL,
	PRIMARY KEY (id)
);










