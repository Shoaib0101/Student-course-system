package com.shoaib.main;

import com.shoaib.util.*;
import java.util.*;
import com.shoaib.services.*;
import com.shoaib.model.*;

public class StudentCourseSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentServiceImpl();

		int id = 0;
		String name = null;
		String email = null;
		String dep = null;
		Student std;

		// Main loop for Main menu
		while (true) {
			DisplayUtility.displayMenu();
			System.out.println();
			int ch = sc.nextInt();

			// switch for main menu
			switch (ch) {
			// all operation of student
			case 1:
				// inner loop for student menu operation
				do {

					DisplayUtility.displayStdMenu();
					System.out.println();

					int choice = sc.nextInt();

					if (choice == 0) {
						break;
					}

					switch (choice) {
					case 1:
						DisplayUtility.stdDetailsHeading();

						try {
							System.out.println("Enter Student ID:");
							id = sc.nextInt();
							if (studentService.ifExist(id)) {
								System.out.println("\nStudent with id (" + id + ") already exist.\n");

							} else {
								sc.nextLine();
								System.out.println("Enter Student Name:");
								name = sc.nextLine();
								System.out.println("Enter Student Email:");
								while (true) {
									email = sc.nextLine();
									if (!ValidationUtil.validateEmail(email)) {
										System.out.println("Invalid Email or cannot be Null");
									} else {
										break;
									}
								}
								System.out.println("Enter Department Name :");
								dep = sc.nextLine();

								std = new Student(id, name, email, dep);

								String str = (studentService.addStudent(std)) ? "!!!Student Added Successfully!!!"
										: "!!!Failed To add the student!!!";
								System.out.println("\n" + str + "\n");

							}

						} catch (Exception e) {
							System.out.println("\nFollowing Error Occured " + e);
							sc.nextLine();
						}
						break;
					case 2:
						DisplayUtility.displayStudentTable();
						studentService.displayAllStudents();
						break;
					case 3:
						try {
							System.out.println("Enter Id to update Student:");
							id = sc.nextInt();
							sc.nextLine();
							if (studentService.ifExist(id)) {
								System.out.println("Enter data or null in the feild");
								System.out.println("Enter Name:");
								name = sc.nextLine();
								System.out.println("Enter email:");
								email = sc.nextLine();
								System.out.println("Enter Department:");
								dep = sc.nextLine();

								std = new Student(id, name, email, dep);
								if (studentService.updateById(id, std)) {
									System.out.println("\n!!!Updaet Sucessfully!!!\n");
								} else {
									System.out.println("\n!!!Failed To Update!!!\n");
								}
							} else {
								System.out.println("!!!Student Not Found!!!");
							}
						} catch (Exception ex) {
							System.out.println("\nFollowing error ocured " + ex);
						}
						break;
					case 4:
						System.out.println("Enter ID To Delete Student:");
						id = sc.nextInt();
						std = studentService.deleteById(id);
						if (std != null) {
							System.out.println("\n!!!Student " + std.getStudentName() + " with ID (" + std.getStudentId()
									+ ") deleted Sucessfully!!!\n");
						} else {
							System.out.println("\n!!!Student Not Found!!!\n");
						}
						break;
					default:
						System.out.println("\n!!!Invalid Choice!!!");
						System.out.println("	  Try Again		\n");
					}
				} while (true);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 0:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter Valid Choice");
			}
		}
	}
}
