package com.tannerbernth.game.model.entity;

import java.awt.Graphics2D;

public class Player extends Entity {
	
	private String name;
	
	public Player(String name) {
		super(EntityType.Player);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*----------------------------------------
	 * Draw Entity
	 *----------------------------------------*/
	public void draw(Graphics2D g2) {
		int x2 = (int) (150 - super.getWidth() / 2);
        int y2 = (int) (150 - super.getHeight() / 2);
		g2.fillOval(x2, y2, super.getWidth(), super.getHeight());
        /*int x2 = (int) (x - width / 2);
        int y2 = (int) (y - height / 2);
        g2.fillOval(x2, y2, width, height);*/
	}
}