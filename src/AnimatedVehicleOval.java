import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class AnimatedVehicleOval extends AnimatedVehicle{

	public AnimatedVehicleOval(int minX, int maxX, int roadHeight, double speed) {
		super(minX, maxX, roadHeight, speed);
	}
	
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
		g.drawOval(x, y-10, WIDTH, HEIGHT+25);
		g.setColor(Color.RED);

		g.fillOval(x+1, y-11, WIDTH, HEIGHT+25);
		g.setColor(c);

		g.fillOval(x-8, y, 10, 20);
		g.fillOval(x+WIDTH-2, y, 10, 20);
		g.fillOval(x-8, y+HEIGHT-20, 10, 20);
		g.fillOval(x+WIDTH-2, y+HEIGHT-20, 10, 20);
		g.setColor(Color.black);
		g.fillOval(x+5, y+15, 42, 37);
		g.setColor(Color.RED);
		g.fillOval(x+10, y+25, 32, 22);
		Graphics2D g2=(Graphics2D)g;
		g2.setStroke(new BasicStroke(5));

			
		g.drawLine(x+5, y+14, x+14, y+26);
		g.drawLine(x+5, y+56, x+15, y+43);
		g.drawLine(x+45, y+14, x+37, y+26);
				g.drawLine(x+45, y+56, x+39, y+43);
				}


}
