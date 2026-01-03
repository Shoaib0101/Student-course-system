package com.shoaib.repo;

import java.util.*;
import com.shoaib.model.Student;
import com.shoaib.util.DisplayUtility;

public class StudentRepoImpl implements StudentRepo {
	//For storing the data of student in format key as student id and value as student object
	HashMap<Integer, Student> studentMap = new HashMap<>();

	@Override
	public boolean addStudent(Student std) {
		if (findById(std.getStudentId()) != null) {
			return false;
		}
		studentMap.put(std.getStudentId(), std);
		return true;
	}

	@Override
	public Student findById(int studentId) {
		return studentMap.get(studentId);
	}

	@Override
	public boolean updateById(int studentId, Student student) {
		Student std = findById(studentId);
		if (std == null) {
			return false;
		}
		std.setStudentId(studentId);// null!=null
		String name = student.getStudentName();
		if (!name.equals("null") && !(student.getStudentName().isBlank())) {
			std.setStudentName(student.getStudentName());
		}

		if (!student.getEmail().equals("null") && !(student.getEmail().isBlank())) {
			std.setEmail(student.getEmail());
		}

		if (!student.getDepartmentName().equals("null") && !(student.getDepartmentName().isBlank())) {
			std.setDepartmentName(student.getDepartmentName());
		}

		return true;
	}

	@Override
	public void displayAllStudents() {
		int cnt = 0;
		for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
			cnt++;
			Student temp = entry.getValue();
			System.out.printf("%-6s %-20s %-25s %-20s%n \n", temp.getStudentId(), temp.getStudentName(),
					temp.getEmail(), temp.getDepartmentName());
		}
		DisplayUtility.dashedLine();
		System.out.println("Total No: " + cnt);
		DisplayUtility.dashedLine();
		System.out.println();
	}

	@Override
	public boolean ifExist(int studentId) {
		if (findById(studentId) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Student deleteById(int studentId) {
		Student std = findById(studentId);

		if (std != null) {
			return studentMap.remove(studentId);
		}
		
		return null;
	}

}
