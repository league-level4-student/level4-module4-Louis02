package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class PolyCircle extends Polymorph {

	PolyCircle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
float angle  = 0;
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.blue);
		g.drawRect(GetX(), GetY(), 50, 50);
	}
	public void update() {
		SetX(100);
		SetY(100);
		SetX((int) (GetX()+Math.sin(angle)*250));
		SetY((int)(GetY()+Math.cos(angle)*250));
		angle +=.01;
	}

}
