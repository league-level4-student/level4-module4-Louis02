package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void update(){
	 	SetY(GetX()+10);
    }

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.drawRect(GetX(), GetY(), 50, 50);
	}

}
