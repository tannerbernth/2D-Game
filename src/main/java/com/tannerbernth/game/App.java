package com.tannerbernth.game;

import javax.swing.SwingUtilities;

import com.tannerbernth.game.model.entity.Player;
import com.tannerbernth.game.client.Client;
import com.tannerbernth.game.client.KeyBinding;

import com.tannerbernth.game.controller.PlayerController;

public class App {

    public static void main( String[] args ) {
    	Player player = new Player("Player 1");
    	PlayerController playerController = new PlayerController(player);
    	Client client = new Client(playerController);

    	SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				client.run();
			}
		});

    }
}
