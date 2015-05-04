package main;

import engine.Game;
import javafx.scene.canvas.*;

import java.awt.Color;
import java.util.Random;

public class Ball {
	private float velocidadeX, velocidadeY;
	private float x, y;
	private float largura, altura;
	GraphicsContext gc;
	public Ball (Game game) {
		gc = game.getGraphicsContext();
		largura = game.getW();
		altura = game.getH();
		Random random = new Random (System.currentTimeMillis());
		velocidadeX = random.nextInt(5);
		velocidadeY = random.nextInt(5);
	}
	public void update() {
        // A bolinha terá sempre a sua posição atualizada
        x += velocidadeX;
        y += velocidadeY;
        // Verificamos se a posição da bolinha está saindo da tela
        if (x > largura || x < 0) {
            velocidadeX *= -1;
        }
        if (y > altura || y < 0) {
            velocidadeY *= -1;
        }
    }
	public void display() {
        // primeiro desenhos o fundo com a cor cinza claro
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, largura, altura);
        // vamos fazer da cor vermelha
        gc.setFill(Color.RED);
        // enfim, desenhamos a bolinha com a posição atualizada e o tamanho de 10
        gc.fillOval(x, y, 30, 30);
    }
}
