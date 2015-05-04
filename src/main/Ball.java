package main;

import engine.Game;
import javafx.scene.canvas.*;

public class Ball {
	private double speedx, speedy;
	private double posx, posy;
	GraphicsContext context;
	public Ball (Game game) {
		this.game = game;
		context = game.getGraphicsContext();
		posx = game.getW();
		posy = game.getH();
	}
}
