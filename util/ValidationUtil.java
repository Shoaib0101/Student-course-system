package com.shoaib.util;

public class ValidationUtil {
	public static boolean validateEmail(String email) {
		if (email == null || email.isBlank()) {
			return false;
		}
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

		if (!email.matches(emailRegex)) {
			return false;
		}

		return true;
	}

	public static boolean validateName(String name) {
		if (name == null || name.isEmpty())
			return false;
		return true;
	}

	public static boolean validateId(int id) {
		if (id <= 0)
			return false;
		return true;
	}

}
