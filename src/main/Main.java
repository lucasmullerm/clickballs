package main;

import engine.Game;
import engine.GameEngine;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage s) throws Exception {
		int w = 600;
		int h = 400;
		Game game = new GameBalls(w, h);
		GameEngine engine = new GameEngine(60, game);
		s.setScene(game.getScene());
		s.show();
		
		engine.start();
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	//
	
}
