package engine;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class Game {
	
	protected GraphicsContext gc;
	private Canvas canvas;

	protected float MAX_W;
	protected float MAX_H;
	
	public Game(float w, float h) {
		MAX_W = w;
		MAX_H = h;
		canvas = new Canvas(w, h);
		gc = canvas.getGraphicsContext2D();
	}
	
	public GraphicsContext getGraphicsContext() {
		return gc;
	}
	
	public float getW() {
		return MAX_W;
	}
	
	public float getH() {
		return MAX_H;
	}

	public abstract void update();

	public abstract void display();
	
	public Canvas getCanvas() {
		return canvas;
	}

}
