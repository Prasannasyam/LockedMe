package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		FileOperations.createMainFolder("main");
		MenuOptions.printWelcomeScreen("LockedMe", "Prasanna kumari Chitta.");
		HandleOptions.WelcomeScreen();
	}
}
