package com.tannerbernth.game.client;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClientMouseListener implements MouseListener {
	
	public ClientMouseListener() {}

	@Override
	public void mouseClicked(MouseEvent event) {}

	@Override
	public void mouseEntered(MouseEvent event) {}

	@Override
	public void mouseExited(MouseEvent event) {}

	@Override
	public void mousePressed(MouseEvent event) {
		System.out.println(event.getPoint().toString());
	}

	@Override
	public void mouseReleased(MouseEvent event) {}

}