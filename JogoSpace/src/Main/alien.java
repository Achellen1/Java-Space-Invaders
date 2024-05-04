package Main;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class alien {
	int posX;
	int posY;
	int veloY;
	int veloX;
	int altura;
	int largura;
	boolean ativo;
	BufferedImage aliens;
	BufferedImage aliens2;
	
	
	BufferedImage animAlien1;
	BufferedImage animAlien2;
	
	public alien(){
		ativo = true;
		largura = 48;
		altura = 48;
		posX = 240;
		posY = 48;
		veloX = 2;
		try {
			aliens = ImageIO.read(getClass().getResourceAsStream("/inimigo_azul_1.png"));
			aliens2 = ImageIO.read(getClass().getResourceAsStream("/inimigo_roxo1.png"));
	        animAlien1 = ImageIO.read(getClass().getResourceAsStream("/inimigo_azul_2.png"));
	        animAlien2 = ImageIO.read(getClass().getResourceAsStream("/inimigo_roxo2.png"));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		
	}
	

}
