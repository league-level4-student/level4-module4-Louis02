package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   private  int x;
   private  int y;
   
   public int GetX() {
	   return x;
   }
   public void SetX(int x) {
	   this.x = x;
   }
   public int GetY() {
	   return y;
   }
   public void SetY(int y) {
	   this.y=y;
   }
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
 	
    }
    
    public abstract void draw(Graphics g);
}
