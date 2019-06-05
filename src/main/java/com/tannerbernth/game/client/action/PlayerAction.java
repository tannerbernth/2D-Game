package com.tannerbernth.game.client.action;

import java.awt.event.KeyEvent;

public enum PlayerAction {
	UP("W", KeyEvent.VK_W), 
	RIGHT("D", KeyEvent.VK_D), 
	DOWN("S", KeyEvent.VK_S), 
	LEFT("A", KeyEvent.VK_A),
	ESC("ESCAPE", KeyEvent.VK_ESCAPE);

	private String key;
	private int keyCode;

	private PlayerAction(String key, int keyCode) {
		this.key = key;
		this.keyCode = keyCode;
	}

	public String getKey() {
		return key;
	}

	public int getKeyCode() {
		return keyCode;
	}
}