package com.shoaib.util;

public class DisplayUtility {

	public static void displayMenu() {
		System.out.println("================Main Menu===============");
		System.out.println("1.Student Menu");
		System.out.println("2.Add Course");
		System.out.println("3.Enroll Student");
		System.out.println("4.Enter Marks");
		System.out.println("5.Calculate GPA");
		System.out.println("6.View Rankings");
		System.out.println("7.View Student Report");
		System.out.println("0.Exit");
		System.out.println("========================================");
		System.out.print("Enter Your Choice: ");
	}

	public static void displayStdMenu() {
		System.out.println("-----------Student Operation-----------");
		System.out.println("1.Add Student");
		System.out.println("2.View All Students");
		System.out.println("3.Update Student");
		System.out.println("4.Delete Student");
		System.out.println("0.Go back to main menu");
		System.out.println("---------------------------------------");
		System.out.println("Enter Your Choice: ");
	}

	public static void displayStudentSingle() {
		System.out.println("---------------------------------------");
		System.out.println("             Student Details           ");
		System.out.println("---------------------------------------");

	}

	public static void displayStudentTable() {
		System.out.println("\n----------------------------------------------------------------------------------");
		System.out.printf("%-6s %-20s %-25s %-20s%n", "ID", "Name", "Email", "Department");
		System.out.println("----------------------------------------------------------------------------------");
	}

	public static void stdDetailsHeading() {
		System.out.println("-----------Enter Student Details-------");
	}

	public static void dashedLine() {
		System.out.println("----------------------------------------------------------------------------------");
	}

	private DisplayUtility() {
	}
}
