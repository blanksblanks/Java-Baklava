//
//  RectangleComponent.java
//
//  Created by Nina Baculinao on 9/5/14.
//

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import javax.swing.JComponent;

import java.util.Random;

// To display a drawing in a frame, need to define a class that inherits and 
// extends JComponent class
public class RectangleComponent extends JComponent {
	
	// Drawing instructions go inside this class
	// This method is called whenever the component needs to be repainted
	// This method receives an object from primitive Graphics class
	public void paintComponent(Graphics g) {

		// Use a cast to receover the Graphics2D object from the Graphics param
		Graphics2D g2 = (Graphics2D) g;

		// Construct a rectangle and draw it
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);

		// Move rectangle 15 units to the right and 25 units down
		box.translate(15,25);

		// Draw moved rectangle
		g2.draw(box);

		// Draw the head
		// Double is an inner class in Ellipse2D, there's also float
		// but double is more convenient to use in Java
		// Syntax: new Ellipse2D.Double(x, y, diameter, diameter);
		Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
		Color mint = new Color(162, 255, 204);
		Color random = generateRandomColor(mint); // white is color to be mixed with
		g2.setColor(random);
		g2.fill(head);
		g2.draw(head);

		// Draw the eyes
		// Syntax: new Line2D.Double(x1, y1, x2, y2)
		// can also set Point2D.Double from =  new Point2D.Double(x1, x2);
		g2.setColor(Color.BLACK);

		Line2D.Double lefteye1 = new Line2D.Double (25, 80, 35, 70);
		g2.draw(lefteye1);

		Line2D.Double lefteye2 = new Line2D.Double (35, 70, 45, 80);
		g2.draw(lefteye2);

		Line2D.Double righteye1 = new Line2D.Double (65, 80, 75, 70);
		g2.draw(righteye1);

		Line2D.Double righteye2 = new Line2D.Double (75, 70, 85, 80);
		g2.draw(righteye2);

		// Draw the mouth
		Rectangle mouth = new Rectangle(30, 130, 50, 5);
		g2.setColor(Color.PINK);
		g2.fill(mouth);

		// Draw the greeting
		g2.setColor(Color.BLUE);
		g2.drawString("Hello, World!", 5, 175);

	}

	public Color generateRandomColor(Color mix) {
    Random random = new Random();
    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);

    // mix the color
    if (mix != null) {
        red = (red + mix.getRed()) / 2;
        green = (green + mix.getGreen()) / 2;
        blue = (blue + mix.getBlue()) / 2;
    }

    Color color = new Color(red, green, blue);
    return color;
}
}