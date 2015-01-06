import java.awt.Color;
import java.awt.Graphics;

/**
 * class for creating AnimatedVehicle objects, it extends Vehicle class and implements AnimatedGameArtifact;
 * It implements (overrides) animateFrame method
 * */
public class AnimatedVehicle extends Vehicle implements AnimatedGameArtifact {
//private double speed;
//private int roadHeight;
//private int minX;
//private int maxX;
protected double speed;
protected int roadHeight;
protected int minX;
protected int maxX;
	
/**
 * constructor method, for creating AnimatedVehicle objects
 * */
public AnimatedVehicle(int minX, int maxX, int roadHeight, double speed) {
super(0, 0);
this.minX = minX;
this.maxX = maxX;
this.roadHeight = roadHeight;
setSpeed(speed);
resetPosition();
}

/**
 * method for (re)setting x and y coordinates that are used for drawing the objects of type AnimatedVehicle
 * */
public void resetPosition() {
setPosition((int) (minX + Math.random() * (maxX - minX)), (int)(-HEIGHT * Math.random() * 10));
}

/**
 * method for setting the speed of objects of type AnimatedVehicle
 * */
@Override
public void setSpeed(double speed) {
this.speed = speed / 2;
}

/**
 * method for animating objects of type AnimatedVehicle (changing the y coordinate for drawing the object)
 * */
@Override
public void animateFrame(long frameNumber) {
// move down or reset position if passed
if (y < roadHeight) {
y += speed;
} else {
resetPosition();
}
}
}
