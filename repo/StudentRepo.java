package com.shoaib.repo;

import com.shoaib.model.Student;

public interface StudentRepo {
	boolean addStudent(Student std);

	Student findById(int studentId);

	boolean updateById(int studentId, Student student);

	void displayAllStudents();

	boolean ifExist(int studentId);

	Student deleteById(int studentId);
}
