package com.shoaib.exception;

public class StudentException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public String duplicateStudentException() {
		return "Student already exist";
	}
}
