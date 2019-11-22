package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PolyImage extends Polymorph {
BufferedImage img;
	PolyImage(int x, int y)  {
		super(x, y);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("RealLifeHomer.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.drawImage(img, 50, 50, 250, 250, null);
	}

}
