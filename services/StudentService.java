package com.shoaib.services;

import com.shoaib.model.Student;

public interface StudentService {
	boolean addStudent(Student std);

	boolean updateById(int studentId, Student std);

	void displayAllStudents();

	boolean ifExist(int studentId);

	Student deleteById(int studentId);
}
