package com.tannerbernth.game.model.entity;

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
}