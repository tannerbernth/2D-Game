package com.tannerbernth.game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.tannerbernth.game.model.entity.Player;

public class AppTest extends TestCase {
    
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /*----------------------------------------
     * Tests
     *----------------------------------------*/
    public void testApp() {
        assertTrue(true);
    }
}
