package Main;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class player {
//player
	
	int playerY = 720 - 48;
	int playerVelo = 6;
	int playerVida = 3;
	BufferedImage nave;
	int playerX = 480;
	
	public player() {
		
	try {
        nave = ImageIO.read(getClass().getResourceAsStream("/nave.png"));
        
    } catch (IOException e) {
        e.printStackTrace();
    }
	}
}

	



