package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PolyMouse extends Polymorph implements MouseMotionListener {

	PolyMouse(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	int mx = 9;
	int my = 9;

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.drawRect(GetX(), GetY(), 20, 20);
	}
public void update() {
		SetX(mx);
		SetY(my);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mx = e.getX();
		my = e.getY();
	}

	

}
