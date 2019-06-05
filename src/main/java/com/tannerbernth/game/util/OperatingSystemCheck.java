package com.tannerbernth.game.util;

import java.util.Locale;

public class OperatingSystemCheck {

	public OperatingSystemCheck() {}

	public static boolean isLinux() {
		String operatingSystem = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
		if (operatingSystem.indexOf("nux") >= 0) {
			return true;
		}
		return false;
	}

	public static boolean isMac() {
		String operatingSystem = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
		if (operatingSystem.indexOf("mac") >= 0) {
			return true;
		}
		return false;
	}

	public static boolean isWindows() {
		String operatingSystem = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
		if (operatingSystem.indexOf("win") >= 0) {
			return true;
		}
		return false;
	}

}