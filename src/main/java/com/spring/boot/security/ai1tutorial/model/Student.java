package com.spring.boot.security.ai1tutorial.model;

public class Student{
	
	String studentName;
	String studentId;
	

	public Student(String studentName, String studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	

	
}