package main;

import engine.Game;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

import java.util.Random;

public class Ball {
	private float velocidadeX, velocidadeY;
	private float x, y;
	private float largura, altura;
	private boolean exists;
	GraphicsContext gc;
	public Ball (Game game, float x, float y) throws InterruptedException {
		gc = game.getGraphicsContext();
		largura = game.getW();
		altura = game.getH();
		Random random = new Random (System.currentTimeMillis());
		Thread.sleep(100);
		velocidadeX = random.nextInt(5);
		velocidadeY = random.nextInt(5);
		this.x = x;
		this.y = y;
		exists = true;
	}
	public void update() {
        // A bolinha terá sempre a sua posição atualizada
        x += velocidadeX;
        y += velocidadeY;
        // Verificamos se a posição da bolinha está saindo da tela
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
        // enfim, desenhamos a bolinha com a posição atualizada e o tamanho de 10
        gc.fillOval(x, y, 30, 30);
    }
	public boolean exists() {
		return exists;
	}
}
