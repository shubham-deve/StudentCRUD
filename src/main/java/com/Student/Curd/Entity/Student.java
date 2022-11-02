package com.Student.Curd.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int  studentId;
	public String studentName;
	public String studentEmail;
	private long studentPhone;
	public String studentAddres;
	public String studentCity;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public long getStudentPhone() {
	return studentPhone;
}
public void setStudentPhone(long studentPhone) {
	this.studentPhone = studentPhone;
}
public String getStudentAddres() {
	return studentAddres;
}
public void setStudentAddres(String studentAddres) {
	this.studentAddres = studentAddres;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public Student(int studentId, String studentName, String studentEmail, long studentPhone, String studentAddres,
		String studentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentEmail = studentEmail;
	this.studentPhone = studentPhone;
	this.studentAddres = studentAddres;
	this.studentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String studentName, String studentEmail, long studentPhone, String studentAddres, String studentCity) {
	super();
	this.studentName = studentName;
	this.studentEmail = studentEmail;
	this.studentPhone = studentPhone;
	this.studentAddres = studentAddres;
	this.studentCity = studentCity;
}
	
	

}
