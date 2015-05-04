package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import engine.Game;

public class GameBalls extends Game {
	
	List<Ball> balls;

	public GameBalls(float w, float h) {
		super(w, h);
		balls = new ArrayList<Ball>();
		Ball.set (this);
		
		scene.setOnMousePressed(new EventHandler<MouseEvent>() {
	        
	        public void handle(MouseEvent event) {
	            balls.add(new Ball ((float)event.getSceneX(), (float)event.getSceneY()));
	        }
	    });
	}

	@Override
	public void update() {
		for(Ball b : balls) {
			b.update();
		}
		for (Iterator<Ball> iter = balls.listIterator(); iter.hasNext(); ) {
		    Ball a = iter.next();
		    if (a.exists () == false) {
		        iter.remove();
		    }
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
