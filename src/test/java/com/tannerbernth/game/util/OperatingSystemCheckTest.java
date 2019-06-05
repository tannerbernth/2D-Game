package com.tannerbernth.game.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.tannerbernth.game.util.OperatingSystemCheck;

public class OperatingSystemCheckTest extends TestCase {

	private enum OsType {
		Linux, Mac, Other, Windows
	};

	// Select Os for testing
	private OsType Os = OsType.Mac;

    public OperatingSystemCheckTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(OperatingSystemCheckTest.class);
    }

    /*----------------------------------------
	 * OperatingSystemCheck Tests
	 *----------------------------------------*/
    public void testIsLinux() {
        if (Os == OsType.Linux){
        	assertTrue(OperatingSystemCheck.isLinux());
        } else {
        	assertTrue(!OperatingSystemCheck.isLinux());
        }
    }

    public void testIsMac() {
        if (Os == OsType.Mac){
        	assertTrue(OperatingSystemCheck.isMac());
        } else {
        	assertTrue(!OperatingSystemCheck.isMac());
        }
    }

    public void testIsWindows() {
        if (Os == OsType.Windows){
        	assertTrue(OperatingSystemCheck.isWindows());
        } else {
        	assertTrue(!OperatingSystemCheck.isWindows());
        }
    }
}