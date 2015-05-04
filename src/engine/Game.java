package engine;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;

public abstract class Game {
	
	protected GraphicsContext gc;
	private Canvas canvas;
	private Scene scene;

	protected float MAX_W;
	protected float MAX_H;
	
	public Game(float w, float h) {
		MAX_W = w;
		MAX_H = h;
		canvas = new Canvas(w, h);
		scene = new Scene(new StackPane(canvas));
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
	
	public Scene getScene() {
		return scene;
	}

}
