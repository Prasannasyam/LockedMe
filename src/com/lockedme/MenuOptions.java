package com.lockedme;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("--------------------------------------------------------------\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by : %s.\n"
				+ "------------------------------------------------------------\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "1. Retrieve all file names in the \"main\" folder.\n"
				+ "2. Search, add, or delete files in \"main\" folder.\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n-:folder Options:-\n\n"
				+ "1. Files inside \"main\" folder.\n" + "2. File Operations.\n"
				+ "3. Exit.\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n-: File Operations:-\n\n"
				+ "1. Add file. \n" + "2. Delete file. \n"
				+ "3. Search file.\n" + "4. Previous Menu.\n" + "5. Exit.\n";

		System.out.println(fileMenu);
	}

}
