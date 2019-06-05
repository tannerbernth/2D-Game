package com.tannerbernth.game.client;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import com.tannerbernth.game.util.OperatingSystemCheck;

import java.io.IOException;

public class ClientFocusListener implements FocusListener {

	private final String COMMAND = "defaults write NSGlobalDomain ApplePressAndHoldEnabled -bool ";
	
	public ClientFocusListener() {
		super();
	}

	@Override
    public void focusGained(FocusEvent event){
    	if (OperatingSystemCheck.isMac()) {
	        try {
	        	Runtime.getRuntime().exec(COMMAND + false);
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }
    }

    @Override
    public void focusLost(FocusEvent event){
    	if (OperatingSystemCheck.isMac()) {
	        try {
	        	Runtime.getRuntime().exec(COMMAND + true);
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }
    }
}