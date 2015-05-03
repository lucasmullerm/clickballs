package engine;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class Game {
	
	protected GraphicsContext gc;
	private Canvas canvas;

	float MAX_W;
	float MAX_H;
	
	public Game(float w, float h) {
		MAX_W = w;
		MAX_H = h;
		canvas = new Canvas(w, h);
		gc = canvas.getGraphicsContext2D();
	}

	public abstract void update();

	public abstract void display();
	
	public Canvas getCanvas() {
		return canvas;
	}

}
