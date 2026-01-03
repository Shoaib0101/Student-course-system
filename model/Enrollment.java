package com.shoaib.model;

import java.time.LocalDate;

public class Enrollment {
	private int studentId;
	private int courseId;
	private LocalDate enrolmentDate;

	Enrollment(int studentId, int courseId, LocalDate enrolmentDate) {
		this.courseId = courseId;
		this.studentId = studentId;
		this.enrolmentDate = enrolmentDate;
	}

	Enrollment() {

	}

	public int getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Enrollment [studentId=" + studentId + ", courseId=" + courseId + ", enrolmentDate=" + enrolmentDate
				+ "]";
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public LocalDate getEnrolmentDate() {
		return enrolmentDate;
	}

	public void setEnrolmentDate(LocalDate enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}
}
