package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

//	private static Polymorph bluePoly;
//	private static Polymorph RedPoly;
//	private static Polymorph movingPoly;
	Polymorph PolyCircle;
	Polymorph PolyMouse;
	//Polymorph PolyImage;
	Polymorph PolyJOP;
	private static int width = 50;
	private static int height = 50;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	 ArrayList <Polymorph> pm = new ArrayList<Polymorph>();
	 Polymorph one;
	 Polymorph two;
	 Polymorph three;
	 Polymorph four;
	 Polymorph five;
	 Polymorph six;
	 Polymorph seven;
	
	// getters and setter start
//	public Polymorph GetBluePoly() {
//		return bluePoly;
//	}
//
//	public void SetBluePoly(Polymorph bp) {
//		this.bluePoly = bp;
//	}
//
//	public int GetWidth() {
//		return width;
//	}
//
//	public void SetWidth(int w) {
//		this.width = w;
//	}
//
//	public int GetHeight() {
//		return height;
//	}
//
//	public void SetHeight(int h) {
//		this.height = h;
//	}
//
//	public Polymorph GetRedPoly() {
//		return RedPoly;
//	}
//
//	public void SetRedPoly(Polymorph rp) {
//		this.RedPoly = rp;
//	}
//	public Polymorph GetMovingPoly() {
//		return movingPoly;
//	}
//	public void SetMovingPoly(Polymorph mp) {
//		this.movingPoly = mp;
//	}
	// getters and setter end

	
	
	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

//		bluePoly = new BluePolymorph(width, height);
//		RedPoly = new RedMorph(width, height);
//		movingPoly  = new MovingMorph(width, height);
		PolyCircle = new PolyCircle(width,height);
		PolyMouse = new PolyMouse(width, height);
	//	PolyImage = new PolyImage (width, height);
		PolyJOP = new PolyJOP (width,height);
		window.addMouseMotionListener((PolyMouse)PolyMouse);
		window.addMouseListener((PolyJOP)PolyJOP);
		timer = new Timer(1000 / 30, this);
		timer.start();
		
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
for(Polymorph p : pm) {
	p.draw(g);
}
		// draw polymorph
//		bluePoly.draw(g);
//		RedPoly.draw(g);
//		movingPoly.draw(g);
PolyCircle.draw(g);
PolyMouse.draw(g);
//PolyImage.draw(g);
//PolyImage.draw(g);
PolyJOP.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for(Polymorph p : pm) {
			p.update();
		}
//		bluePoly.update();
//		RedPoly.update();
//		movingPoly.update();
		PolyCircle.update();
		PolyMouse.update();
		PolyJOP.update();
//PolyImage.update();		
	}
}