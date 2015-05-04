package main;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import engine.Game;

public class GameBalls extends Game {
	
	List<Ball> balls;

	public GameBalls(float w, float h) throws InterruptedException {
		super(w, h);
		balls = new ArrayList<Ball>();
		balls.add(new Ball(this));
		balls.add(new Ball(this));
	}

	@Override
	public void update() {
		for(Ball b : balls) {
			b.update();
		}

	}

	@Override
	public void display() {
        // primeiro desenhos o fundo com a cor cinza claro
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, MAX_W, MAX_H);
		for(Ball b : balls) {
			b.display();
		}

	}

}
