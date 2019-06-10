package com.tannerbernth.game.client;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import com.tannerbernth.game.controller.PlayerController;

public class Client extends JPanel {
	
	private PlayerController playerController;
	private final int DELAY = 25;
	private final int DEFAULT_WIDTH = 300, DEFAULT_HEIGHT = 300;

	public Client(PlayerController playerController) {
		this.playerController = playerController;
		new Timer(DELAY, new KeyBinding(this, playerController)).start();
		createAndShowGui();
	}

	private void createAndShowGui() {
	    JFrame frame = new JFrame("2D RPG");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setBackground(Color.BLACK);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.addFocusListener(new ClientFocusListener());
		frame.addMouseListener(new ClientMouseListener());
		frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.RED);
		playerController.draw(g2);
	}

	public PlayerController getPlayerController() {
		return playerController;
	}

	public void setPlayerController(PlayerController playerController) {
		this.playerController = playerController;
	}

	public void run() {
		
	}
}