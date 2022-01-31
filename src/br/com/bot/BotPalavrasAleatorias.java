package br.com.bot;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

public class BotPalavrasAleatorias {

	public static void main(String[] args) throws Exception {

		final int TENTATIVAS = 5;
		Robot robo = new Robot();
		Random random = new Random();
		new Thread();
		
		System.out.println("Clique no local que o bot devera escrever:\n");
		Thread.sleep(5000);
		System.out.println("O progama inicializa em:\n");
		
		for(int i = 10; i > 0; i--) {

			System.out.println(i);
			Thread.sleep(1000);
		}

		System.out.println("\n");
		robo.setAutoDelay(100);

		String palavras[] = { "Arvore", "Bola", "Casa", "Dado", "Espada", "Folha", "Gato", "Homem", "Indio", "Janela", "Lobo", "Macaco", "Navio", "Ovo", "Porco", "Queijo", "Rua", "Sapo", "Tucano", "Uva", "Vaca", "Xarope", "Zebra"};
		for (int i = 0; i < TENTATIVAS; i++) {
			String sorteio = palavras[random.nextInt(palavras.length)];
			System.out.println(i + 1 + " " + sorteio);

			BotSoletrando roboSoletrando = new BotSoletrando(robo);
			roboSoletrando.escrever(sorteio);

			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);

		}
	}
}
