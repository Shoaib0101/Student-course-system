package com.shoaib.model;

public class Result {
	private int studentId;
	private int courseId;
	private double marks;

	public int getStudentId() {
		return studentId;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(double gradePoint) {
		this.gradePoint = gradePoint;
	}

	private double gradePoint;
}
