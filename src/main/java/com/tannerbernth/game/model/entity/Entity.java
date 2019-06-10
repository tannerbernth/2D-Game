package com.tannerbernth.game.model.entity;

import java.awt.Graphics2D;

public class Entity {
	
	private final int DEFAULT_WIDTH = 20, DEFAULT_HEIGHT = 20;

	private EntityType type;
	private double x, y;
	private int width, height;
	private Entity target;

	public Entity(EntityType type) {
		this.type = type;
		this.x = 0.0;
		this.y = 0.0;
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
	}

	public Entity(EntityType type, int width, int height) {
		this.type = type;
		this.x = 0.0;
		this.y = 0.0;
		this.width = width;
		this.height = height;
	}

	/*----------------------------------------
	 * Getters/Setters
	 *----------------------------------------*/
	public EntityType getType() {
		return type;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/*----------------------------------------
	 * Movement Methods
	 *----------------------------------------*/
	public void moveX(double x) {
		this.x += x;
	}

	public void moveY(double y) {
		this.y += y;
	}

	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/*----------------------------------------
	 * Draw Entity
	 *----------------------------------------*/
	public void draw(Graphics2D g2) {
        int x2 = (int) (x - width / 2);
        int y2 = (int) (y - height / 2);
        g2.fillOval(x2, y2, width, height);
	}

}