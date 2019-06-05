package com.tannerbernth.game.controller;

import java.util.HashMap;
import java.util.Map;

import com.tannerbernth.game.model.entity.Entity;

public class EntityController {

	private Map<Integer,Entity> entityMap;
	
	public EntityController() {
		this.entityMap = new HashMap<Integer, Entity>();
	}


}