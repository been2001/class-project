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

	/**
	 *
	 */
	public static void farewell(String appName, String user) {
		System.out.println("Thank you for using the " + appName + "app " + user + ", and have a gret day!");
	}

	/**
	 *
	 */
	public static String welcomeUserAndGetName(String appName) {
		String input;
		System.out.println("Welcome to the " + appName + " Application.");
		System.out.println("Could I get your name?");
		return scanner.nextLine();
	}

}
