import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * class for creating special kind of AnimatedVehicle object, so it extends AnimatedVehicle class
 * */
public class AnimatedVehicleRect extends AnimatedVehicle{
	
/**
 * constructor method, it calls constructor method of superclass and passes to her received parameters 
 * */
public AnimatedVehicleRect(int minX, int maxX, int roadHeight, double speed) {
		super(minX, maxX, roadHeight, speed);
	}

/**
 * method for drawing the object, it calls other method(drawCar)
 * */	
public void draw(Graphics graphics) {
if (crashFrame > 0) {
drawCar(graphics, Color.YELLOW);
crashFrame--;
} else {
drawCar(graphics, Color.BLUE);
}
}
/**
 * main method for drawing the objects
 * */
	protected void drawCar(Graphics g, Color c) {
		g.setColor(c);
		g.drawOval(x, y-15, WIDTH, HEIGHT+30);
		g.drawRect(x, y-10, WIDTH, HEIGHT+25);
		g.setColor(Color.RED);

		g.fillRect(x+1, y-11, WIDTH, HEIGHT+25);
		g.setColor(c);

		g.fillOval(x-8, y, 10, 20);
		g.fillOval(x+WIDTH-2, y, 10, 20);
		g.fillOval(x-8, y+HEIGHT-20, 10, 20);
		g.fillOval(x+WIDTH-2, y+HEIGHT-20, 10, 20);
		g.setColor(Color.black);
		g.fillRect(x+5, y+15, 42, 37);
		g.setColor(Color.RED);
		g.fillRect(x+10, y+25, 32, 22);
		Graphics2D g2=(Graphics2D)g;
		g2.setStroke(new BasicStroke(5));
			
			
		g.drawLine(x+5, y+14, x+11, y+24);
		g.drawLine(x+5, y+56, x+15, y+43);
		g.drawLine(x+45, y+14, x+39, y+24);
		g.drawLine(x+45, y+56, x+39, y+43);
		}
}
