package com.shoaib.model;

import java.util.Objects;

public class Student {
	private int studentId;
	private String studentName;
	private String email;

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

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email
				+ ", departmentName=" + departmentName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentName, email, studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(departmentName, other.departmentName) && Objects.equals(email, other.email)
				&& studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	private String departmentName;

	public Student(int studentId, String studentName, String email, String departmentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.departmentName = departmentName;
	}

	Student() {

	}
}
