package com.tannerbernth.game.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.Timer;

import java.util.HashMap;
import java.util.Map;

import com.tannerbernth.game.controller.PlayerController;
import com.tannerbernth.game.client.action.PlayerAction;


public class KeyBinding implements ActionListener {

	private final String PRESSED = "Pressed";
	private final String RELEASED = "Released";

	private Client client;
	private PlayerController playerController;
	private int keysPressed;
	private Map<PlayerAction, Boolean> keyMap;

	public KeyBinding(Client client, PlayerController playerController) {
		this.client = client;
		this.playerController = playerController;
		this.keysPressed = 0;
		this.keyMap = new HashMap<PlayerAction, Boolean>();
		addDirectionalActions();
	}

	private void addDirectionalActions() {
		int inFocus = JComponent.WHEN_IN_FOCUSED_WINDOW;
		ActionMap actionMap = client.getActionMap();
		InputMap inputMap = client.getInputMap(inFocus);
		
		for (PlayerAction action : PlayerAction.values()) {
			keyMap.put(action, Boolean.FALSE);
			inputMap.put(KeyStroke.getKeyStroke(action.getKeyCode(), 0, false), action.getKey() + PRESSED);
			inputMap.put(KeyStroke.getKeyStroke(action.getKeyCode(), 0, true), action.getKey() + RELEASED);
			actionMap.put(action.getKey() + PRESSED, new DirectionAction(true, action));
			actionMap.put(action.getKey() + RELEASED, new DirectionAction(false, action));
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		for (PlayerAction action : PlayerAction.values()) {
			if (keyMap.get(action)) {
				switch(action) {
					case UP:
						playerController.moveUp();
						break;
					case RIGHT:
						playerController.moveRight();
						break;
					case DOWN:
						playerController.moveDown();
						break;
					case LEFT:
						playerController.moveLeft();
						break;
					case ESC:
						System.out.println("Player Quit");
						System.exit(0);
						break;
					default:
						System.out.println("Error KeyBinding");
						break;
				}
			}
		}
		client.repaint();
	}

	private class DirectionAction extends AbstractAction {
		private Boolean pressed;
		private PlayerAction direction;

		public DirectionAction(boolean pressed, PlayerAction direction) {
			this.pressed = Boolean.valueOf(pressed);
			this.direction = direction;
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			keyMap.put(direction, pressed);
		}
	}
}