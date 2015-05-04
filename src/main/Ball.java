package main;

import engine.Game;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

import java.util.Random;

public class Ball {
	private float velocidadeX, velocidadeY;
	private float x, y;
	private static float largura, altura;
	private boolean exists;
	private static GraphicsContext gc;
	public static void set (Game game) {
		gc = game.getGraphicsContext();
		largura = game.getW();
		altura = game.getH();
	}
	public Ball (float x, float y) {
		Random random = new Random (System.currentTimeMillis());
		velocidadeX = random.nextInt(5);
		velocidadeY = random.nextInt(5);
		this.x = x;
		this.y = y;
		exists = true;
	}
	public void update() {
        // A bolinha ter� sempre a sua posi��o atualizada
        x += velocidadeX;
        y += velocidadeY;
        // Verificamos se a posi��o da bolinha est� saindo da tela
        if (x > largura-30 || x < 0) {
            velocidadeX *= -1;
        }
        if (y > altura-30 || y < 0) {
            velocidadeY *= -1;
        }
    }
	public void display() {
        // vamos fazer da cor vermelha
        gc.setFill(Color.RED);
        // enfim, desenhamos a bolinha com a posi��o atualizada e o tamanho de 10
        gc.fillOval(x, y, 30, 30);
    }
	public boolean exists() {
		return exists;
	}
}
