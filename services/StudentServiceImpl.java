package com.shoaib.services;

import com.shoaib.model.Student;
import com.shoaib.repo.StudentRepoImpl;

public class StudentServiceImpl implements StudentService {
	StudentRepoImpl studentRepo = new StudentRepoImpl();

	@Override
	public boolean addStudent(Student std) {
		return studentRepo.addStudent(std);
	}

	@Override
	public boolean updateById(int studentId, Student std) {
		return studentRepo.updateById(studentId, std);
	}

	//
	@Override
	public void displayAllStudents() {
		studentRepo.displayAllStudents();
	}

	@Override
	public boolean ifExist(int studentId) {

		return studentRepo.ifExist(studentId);
	}

	@Override
	public Student deleteById(int studentId) {

		return studentRepo.deleteById(studentId);
	}

}
