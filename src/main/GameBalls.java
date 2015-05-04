package main;

import java.util.ArrayList;
import java.util.List;

import engine.Game;

public class GameBalls extends Game {
	
	List<Ball> balls;

	public GameBalls(float w, float h) {
		super(w, h);
		balls = new ArrayList<Ball>();
	}

	@Override
	public void update() {
		for(Ball b : balls) {
			b.update();
		}

	}

	@Override
	public void display() {
		for(Ball b : balls) {
			b.display();
		}

	}

}
