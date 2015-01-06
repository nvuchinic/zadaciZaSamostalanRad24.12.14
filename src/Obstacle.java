import java.awt.Color;
import java.awt.Graphics;

/**
 * class for creating visual objects in game(obstacle on road)
 * */
public class Obstacle implements AnimatedGameArtifact {
private double speed=5;
private int x;
private int y;
protected int minX;
protected int maxX;



public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

/**
 * constructor method
 * */
public Obstacle(int minX, int maxX){
	this.minX=minX;
	this.maxX=maxX;
	resetPosition();
	setSpeed(speed);
}

/**
 * method for resetting the position of object(calls the setPosition method that sets the x and y coordinate for drawing the object)
 * */
public void resetPosition() {
setPosition((int) (minX + Math.random() * (maxX - minX)), (int)(-30 * Math.random() * 10));
}

public void setPosition(int x, int y) {
this.x = x - 25;
this.y = y - 12;
}

@Override
public void setSpeed(double speed) {
this.speed = speed / 4;
}

/**main  method for drawing the object
 * */
public void draw(Graphics g) {
//		int xpoints[] = {100, 110,115,120,130,135,145,150,145,150,140,135,130,125,120,115,110,115,110};
//	    int ypoints[] = {100, 95,90,95,90,95,90,100,100,110,115,110,115,110,115,110,115,105,100};
		int xpoints[] = {x, x+10,x+15,x+20,x+30,x+35,x+45,x+50,x+45,x+50,x+40,x+35,x+30,x+25,x+20,x+15,x+10,x+15,x+10};
	    int ypoints[] = {y, y-5,y-10,y-5,y-10,y-5,y-10,y,y,y+10,y+15,y+10,y+15,y+10,y+15,y+10,y+15,y+5,y};
	    int npoints = 19;
	    
 //   g.drawPolygon(xpoints, ypoints, npoints);
    g.setColor(Color.BLACK);
    g.fillPolygon(xpoints, ypoints, npoints);
	   		}
	
	public void animateFrame(long frameNumber) {
		// move down or reset position if passed
		if (y < 600) {
		y += speed;
		} else {
		resetPosition();
		}
		}
}
