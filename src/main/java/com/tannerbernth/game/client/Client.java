package com.tannerbernth.game.client;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Arrays;
import java.util.Random;
import java.util.Collection;
import java.util.*;

import java.awt.Graphics;
import java.awt.Graphics2D;

import com.tannerbernth.game.controller.PlayerController;

public class Client extends JPanel {
	
	private PlayerController playerController;
	private final int DELAY = 25;

	public Client(PlayerController playerController) {
		this.playerController = playerController;
		new Timer(DELAY, new KeyBinding(this, playerController)).start();
		createAndShowGui();
	}

	private void createAndShowGui() {
		JLabel jlabel = new JLabel("This is a label");
	    this.add(jlabel);

	    JFrame frame = new JFrame("2D RPG");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.addFocusListener(new ClientFocusListener());
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		playerController.draw(g2);
		g2.drawString("GG", 10, 20);
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