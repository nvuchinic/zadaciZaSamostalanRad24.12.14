import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

public class Vehicle implements GameArtifact 
{
public static int WIDTH = 50;
public static int HEIGHT = 60;
public static int WIDTH_HALF = WIDTH/2;
public static int HEIGHT_HALF = HEIGHT/2;
protected int x;
protected int y;
//private int crashFrame;
protected int crashFrame;

public Vehicle(int x, int y) {
setPosition(x, y);
}

public void setPosition(int x, int y) {
this.x = x - WIDTH_HALF;
this.y = y - HEIGHT_HALF;
}

public void setX(int x) {
this.x = x - WIDTH_HALF;
}

@Override
public void draw(Graphics graphics) {
if (crashFrame > 0) {
drawCar(graphics, Color.YELLOW);
crashFrame--;
} else {
drawCar(graphics, Color.BLUE);
}
}

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

public boolean colide(Vehicle v) {
return Math.abs(x - v.x) < WIDTH && Math.abs(y - v.y) < HEIGHT;
}

public void crash() {
crashFrame = 20;
}

public boolean isCrashed() {
return crashFrame > 0;
}

public boolean stepOverOil(Obstacle o){
	return Math.abs(x - o.getX()) < WIDTH && Math.abs(y - o.getY()) < HEIGHT;
	}

public void moveRandom(){
	int min=(int) Math.max(50, x - 5);
	int max=(int) Math.min(750, x + 5);
	x=min + (int)(Math.random() * ((max - min) + 1));
}

}