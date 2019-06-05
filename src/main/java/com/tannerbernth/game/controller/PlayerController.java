package com.tannerbernth.game.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;

import com.tannerbernth.game.model.entity.Player;

public class PlayerController {

	private final double VELOCITY = 1.0;

	private Player player;
	
	public PlayerController (Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void moveLeft() {
		player.moveX(VELOCITY * -1);
		System.out.println("left: " + player.getX());
	}

	public void moveRight() {
		player.moveX(VELOCITY);
		System.out.println("right: " + player.getX());
	}

	public void moveDown() {
		player.moveY(VELOCITY);
		System.out.println("down: " + player.getY());
	}

	public void moveUp() {
		player.moveY(VELOCITY * -1);
		System.out.println("up: " + player.getY());
	}

	public void move(double x, double y) {
		player.move(x, y);
	}

	public void draw(Graphics2D g2) {
		player.draw(g2);
	}
}