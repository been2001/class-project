/**
 *   File Name: AppBasic.java<br>
 *
 *   Yusuf, Abdifatahe<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 4, 2017
 *
 */

package com.sqa.ay.helpers;

import java.util.*;

/**
 * AppBasic //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Yusuf, abdifatah
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasics {
	static Scanner scanner = new Scanner(System.in);
	private static String aString;

	// Helper method to farewellUser

	public static void farewellUser(String appName, String user) {
		System.out.println("Thank you for using the " + appName + " App " + user + ", have a great day!");
	}

	public static boolean requestBoolean(String question) {
		String input;
		boolean booleanResponse = false;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			booleanResponse = Boolean.parseBoolean(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct short value (" + input + ")\nUsing 0 for set value");
		}
		return booleanResponse;
	}

	public static char requestChar(String question) {
		String input;
		char character = 'A';
		System.out.print(question + " ");
		input = scanner.nextLine();
		character = input.trim().charAt(0);
		if (input.trim().length() > 1) {
			System.out.println("You have entered more than one character (" + input + ")\nUsing 'A' for set value");
		}
		return character;
	}

	/**
	 * @param Helper
	 *            method to return double
	 * @return
	 */

	public static double requestDouble(String question) {
		String input;
		double count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Double.parseDouble(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct double value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	// Helper method to return float
	public static float requestFloat(String question) {
		String input;
		float count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Float.parseFloat(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct float value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static int requestInt(String question) {
		String input;
		int count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Integer.parseInt(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct integer value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static long requestLong(String question) {
		String input;
		long count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Long.parseLong(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct long value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static short requestShort(String question) {
		String input;
		short count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Short.parseShort(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct short value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	// Helper method to request any String
	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}

	// Helper method to welcome user and return supplied name.

	public static String welcomeUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " application!\n");
		System.out.print("Could I get your name? ");
		return scanner.nextLine();
	}
}