package com.tannerbernth.game.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.tannerbernth.game.model.entity.Player;

/**
 * Unit test for simple App.
 */
public class PlayerTest extends TestCase {

    public PlayerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(PlayerTest.class);
    }

    /*----------------------------------------
     * Player Tests
     *----------------------------------------*/
    public void testPlayer() {
        Player player = new Player("James");
        assertTrue(player.getName().equals("James"));
        assertTrue(player.getX() == (double)0);
    }
}
